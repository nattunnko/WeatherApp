package weatherAPI;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * jsonファイルの要素クラス
 * @author niwanatsuki
 *
 */

public class Weather {
	@JsonProperty("weather")
	public ArrayList<Weather1> weather;

	@JsonProperty("coord")
	public coord coord;

	@JsonProperty("base")
	public String base;

	@JsonProperty("main")
	public Main main;

	@JsonProperty("visibility")
	public String visibility;

	@JsonProperty("wind")
	public Wind wind;

	@JsonProperty("rain")
	public Rain rain;

	@JsonProperty("clouds")
	public Clouds clouds;

	@JsonProperty("dt")
	public String dt;

	@JsonProperty("sys")
	public Sys sys;

	@JsonProperty("timezone")
	public String timezone;

	@JsonProperty("id")
	public String id;

	@JsonProperty("name")
	public String name;

	@JsonProperty("cod")
	public String cod;
	/*private String weatherMain;//天気
	private String weatherIcon;//天気アイコン
	private String temp;//気温
	private String humidity;//湿度
	private String temp_min;//最低気温
	private String temp_max;//最高気温
	private String grnd_level;//地表面の大気圧
	private String wind_speed;//風速
	private String wind_deg;//風向
	private String rain1h;//過去１時間の雨量
	private String rain3h;//過去３時間の雨量
	private String cityID;//都市ID
	private String cityName;//都市名*/

	/*public String getBase(){
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getCoord(){
		return coord;
	}

	@JsonProperty("parts_array")
	public void setCoord(ArrayList<String> array) {

	}*/

	/*public String getWeather(){
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}*/

	/*public String getWeatherMain(){
		return weatherMain;
	}

	public void setWeatherMain(String weatherMain) {
		this.weatherMain = weatherMain;
	}

	public String getWeatherIcon(){
		return weatherIcon;
	}

	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}

	public String getTemp(){
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getHumidity(){
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getTemp_min(){
		return temp_min;
	}

	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}

	public String getTemp_max(){
		return temp_max;
	}

	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}

	public String getGrnd_level(){
		return grnd_level;
	}

	public void setGrnd_level(String grnd_level) {
		this.grnd_level = grnd_level;
	}

	public String getWind_speed(){
		return wind_speed;
	}

	public void setWind_speed(String wind_speed) {
		this.wind_speed = wind_speed;
	}

	public String getWind_deg(){
		return wind_deg;
	}

	public void setWind_deg(String wind_deg) {
		this.wind_deg = wind_deg;
	}

	public String getRain1h(){
		return rain1h;
	}

	public void setRain1h(String rain1h) {
		this.rain1h = rain1h;
	}

	public String getRain3h(){
		return rain3h;
	}

	public void setRain3h(String rain3h) {
		this.rain3h = rain3h;
	}

	public String getCityID(){
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getCityName(){
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}*/
}
