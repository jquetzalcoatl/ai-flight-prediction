package com.middleware.dto;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main implements Serializable {

	@SerializedName("temp")
	@Expose
	private Double temp;
	@SerializedName("feels_like")
	@Expose
	private Double feelsLike;
	@SerializedName("temp_min")
	@Expose
	private Double tempMin;
	@SerializedName("temp_max")
	@Expose
	private Double tempMax;
	@SerializedName("pressure")
	@Expose
	private Long pressure;
	@SerializedName("humidity")
	@Expose
	private Long humidity;
	private final static long serialVersionUID = -1159010867420465296L;
	
	public Double getTemp() {
		return temp;
	}
	
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	
	public Double getFeelsLike() {
		return feelsLike;
	}
	
	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}
	
	public Double getTempMin() {
		return tempMin;
	}
	
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	
	public Double getTempMax() {
		return tempMax;
	}
	
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	
	public Long getPressure() {
		return pressure;
	}
	
	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}
	
	public Long getHumidity() {
		return humidity;
	}
	
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Main.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("temp");
		sb.append('=');
		sb.append(((this.temp == null)?"<null>":this.temp));
		sb.append(',');
		sb.append("feelsLike");
		sb.append('=');
		sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
		sb.append(',');
		sb.append("tempMin");
		sb.append('=');
		sb.append(((this.tempMin == null)?"<null>":this.tempMin));
		sb.append(',');
		sb.append("tempMax");
		sb.append('=');
		sb.append(((this.tempMax == null)?"<null>":this.tempMax));
		sb.append(',');
		sb.append("pressure");
		sb.append('=');
		sb.append(((this.pressure == null)?"<null>":this.pressure));
		sb.append(',');
		sb.append("humidity");
		sb.append('=');
		sb.append(((this.humidity == null)?"<null>":this.humidity));
		sb.append(',');
		
		if (sb.charAt((sb.length()- 1)) == ',') {
			sb.setCharAt((sb.length()- 1), ']');
		} else {
			sb.append(']');
		}
		
		return sb.toString();
	}

}
