package com.iconicdev.getip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.iconicdev.getip.Retrofit.ApiServices;
import com.iconicdev.getip.Retrofit.ResponseDTO;
import com.iconicdev.getip.Retrofit.RetrofitClient;

import dmax.dialog.SpotsDialog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{
    SpotsDialog pd;
    TextView showIp;
    Button btnGetIp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pd = new SpotsDialog(this);
        showIp = findViewById(R.id.showIp);
        btnGetIp = findViewById(R.id.btnGetIp);
        btnGetIp.setOnClickListener(this);
    }

    public void getRequest() {
        pd.show();
        ApiServices apiServices = new RetrofitClient().getClient();
        Call<ResponseDTO> call = apiServices.getIp();
        call.enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                Log.d("ipsss", "onResponse: " + response.raw());
                pd.dismiss();
                if (response.code() == 200){
                    showIp.setText(response.body().getQuery());
                }
            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {
                pd.dismiss();
                Toast.makeText(MainActivity.this, ""+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//                Log.d("ipsss", "onResponse: " + t.getLocalizedMessage());
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGetIp:
                getRequest();
            break;
        }
    }
}
