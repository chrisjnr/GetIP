package com.iconicdev.getip.Retrofit;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

	@SerializedName("as")
	private String as;

	@SerializedName("city")
	private String city;

	@SerializedName("country")
	private String country;

	@SerializedName("countryCode")
	private String countryCode;

	@SerializedName("isp")
	private String isp;

	@SerializedName("lat")
	private Object lat;

	@SerializedName("lon")
	private Object lon;

	@SerializedName("org")
	private String org;

	@SerializedName("query")
	private String query;

	@SerializedName("region")
	private String region;

	@SerializedName("regionName")
	private String regionName;

	@SerializedName("status")
	private String status;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("zip")
	private String zip;

	public void setAs(String as){
		this.as = as;
	}

	public String getAs(){
		return as;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setIsp(String isp){
		this.isp = isp;
	}

	public String getIsp(){
		return isp;
	}

	public void setLat(Object lat){
		this.lat = lat;
	}

	public Object getLat(){
		return lat;
	}

	public void setLon(Object lon){
		this.lon = lon;
	}

	public Object getLon(){
		return lon;
	}

	public void setOrg(String org){
		this.org = org;
	}

	public String getOrg(){
		return org;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setRegionName(String regionName){
		this.regionName = regionName;
	}

	public String getRegionName(){
		return regionName;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"as = '" + as + '\'' + 
			",city = '" + city + '\'' + 
			",country = '" + country + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			",isp = '" + isp + '\'' + 
			",lat = '" + lat + '\'' + 
			",lon = '" + lon + '\'' + 
			",org = '" + org + '\'' + 
			",query = '" + query + '\'' + 
			",region = '" + region + '\'' + 
			",regionName = '" + regionName + '\'' + 
			",status = '" + status + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",zip = '" + zip + '\'' + 
			"}";
		}
}