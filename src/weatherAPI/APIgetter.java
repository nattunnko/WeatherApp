package weatherAPI;


import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * API取得、jsonファイル生成のためのファイル
 * @author niwanatsuki
 *
 */

public class APIgetter {

	private String json;
	private StringBuilder sb;
	private String requestUrl = "https://api.openweathermap.org/data/2.5/weather?APPID=777d52fe05b810a6c6fe3420f2da5f17&lang=ja&units=metric&q=";

	public String getJson() {
		return json;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}

	/**
	 * 引数で選択された都市の天気情報をjsonファイルとして生成する
	 * @param city
	 * @throws IOException
	 */
	public void createJson(String city) throws IOException{
		city = city + ",jp";
		requestUrl = requestUrl + city;

        URL url = new URL(getRequestUrl());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);

	if(responseCode == HttpURLConnection.HTTP_OK){

		   InputStreamReader isr = new InputStreamReader(connection.getInputStream());

		   BufferedReader br = new BufferedReader(isr);

		   setJson(br.readLine());
		   setSb(new StringBuilder(getJson()));
		   System.out.println(getJson());


	}else{
		   System.out.println("取得失敗");
	}


	 try {
         // FileWriterクラスのオブジェクトを生成する
		 FileWriter file = new FileWriter("./weather.json");
         System.out.println("jsonファイルの作成に成功");
         // PrintWriterクラスのオブジェクトを生成する
         PrintWriter pw = new PrintWriter(new BufferedWriter(file));
         //ファイルに書き込む
         pw.println(getJson());
         //ファイルを閉じる
         pw.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
	}

	public static void main(String[] args) {
		System.out.println("ok");
	}

/*public static void main(String[] args) throws Exception {

		APIgetter api = new APIgetter();

        URL url = new URL(api.getRequestUrl());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int responseCode = connection.getResponseCode();

	if(responseCode == HttpURLConnection.HTTP_OK){

		   InputStreamReader isr = new InputStreamReader(connection.getInputStream());

		   BufferedReader br = new BufferedReader(isr);

		   api.setJson(br.readLine());
		   api.setSb(new StringBuilder(api.getJson()));
		   /*for(int i=0;i<json.length();i++) {
			   if(json.charAt(i) == ',') {
				   sb.insert(i+1,'\n');
			   }
		   }*/

		   //System.out.println(api.getSb()); //Json形式でデータが取得できるのでJackson等で処理する

	/*}else{
		   System.out.println("取得失敗");
	}

	 try {
         // FileWriterクラスのオブジェクトを生成する
         FileWriter file = new FileWriter("./weather.json");
         // PrintWriterクラスのオブジェクトを生成する
         PrintWriter pw = new PrintWriter(new BufferedWriter(file));

         //ファイルに書き込む
         pw.println(api.getJson());
         //ファイルを閉じる
         pw.close();
     } catch (IOException e) {
         e.printStackTrace();
     }

    }*/
}
