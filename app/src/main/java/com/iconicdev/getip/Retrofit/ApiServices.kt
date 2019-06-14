package com.iconicdev.getip.Retrofit
import com.iconicdev.getip.Retrofit.ResponseDTO
import retrofit2.Call
import retrofit2.http.*
import java.util.*

public interface ApiServices {
    @GET("/json")
    fun getIp(): Call<ResponseDTO>
//    fun getIp(@Path("username") user:String): Call<String>


}
