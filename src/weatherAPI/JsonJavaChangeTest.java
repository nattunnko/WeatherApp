package weatherAPI;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * jsonファイルの内容をjavaオブジェクトに変換するクラス
 * 最終的にjspファイルに値を送るのはこのクラスのgetWeather_infoメソッド
 * @author niwanatsuki
 *
 */

public class JsonJavaChangeTest {



	/**
	 * jsonファイルからjavaオブジェクトに変更するメソッド
	 * @return jsonファイルの値を持つweatherオブジェクト
	 */
	public Weather jsonJavaChange() throws InterruptedException{
	        ObjectMapper mapper = new ObjectMapper();
	        Weather weather = null;
	        mapper.enable(SerializationFeature.INDENT_OUTPUT);
	        try {
	            weather = mapper.readValue(new File("./weather.json"), Weather.class);
	        }catch(IOException e) {
	            e.printStackTrace();
	        }
	        return weather;
	}

	/**
	 * 最終的にこのメソッドを使えば天気の情報を取得できるテンプレートメソッド
	 * @return
	 * @throws
	 */
	public Weather getWeather_info(String cityName) throws IOException{
		APIgetter api = new APIgetter();
		JsonJavaChangeTest jjct = new JsonJavaChangeTest();
		Weather weather = null;
		api.createJson(cityName);
		try {
			 weather = jjct.jsonJavaChange();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return weather;
	}

	public static void main(String[] args) throws IOException{
		JsonJavaChangeTest jjct = new JsonJavaChangeTest();
		Weather weather;
		weather = jjct.getWeather_info("Hokkaido");
		System.out.println(weather.weather.get(0).description);
		System.out.println("気温" + weather.main.temp);
	}

	/*public static void main(String[] args) throws Exception{
		APIgetter api = new APIgetter();
		JsonJavaChangeTest jjct = new JsonJavaChangeTest();
		Weather weather;
		api.createJson("osaka");
		weather = jjct.jsonJavaChange();
		System.out.println(weather.name +"の天気は" + weather.weather.get(0).main);
	}*/

	/*public static void main(String[] args) throws InterruptedException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            Weather weather = mapper.readValue(new File("weather.json"), Weather.class);
            System.out.println("天気: "+weather.weather.get(0).main);
            System.out.println("気温: "+weather.getTemp());
            System.out.println("都市ID: "+weather.getCityID());
            System.out.println("都市名: "+weather.getCityName());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }*/
}
