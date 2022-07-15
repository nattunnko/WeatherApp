<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8" />
<title>️あなたの地域のお天気</title>
<%-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script src='https://use.fontawesome.com/releases/v5.0.13/js/all.js'></script>--%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/weather.css">
</head>
<body>
    <div class="container">
        <h1>☀️今日のお天気☀️</h1>
    <div>
    <h2>都市の選択</h2>
   <form method="post" action="./HelloServlet">
      <input type="radio" id="cityRadio" name="cityRadio" value="Hokkaido">北海道
      <input type="radio" id="cityRadio" name="cityRadio" value="Miyagi-ken">宮城
      <input type="radio" id="cityRadio" name="cityRadio" value="Niigata-ken">新潟
      <input type="radio" id="cityRadio" name="cityRadio" value="Ishikawa-ken">石川
      <input type="radio" id="cityRadio" name="cityRadio" value="Tokyo Prefecture">東京
      <input type="radio" id="cityRadio" name="cityRadio" value="Aichi-ken">愛知
      <input type="radio" id="cityRadio" name="cityRadio" value="Osaka">大阪
      <input type="radio" id="cityRadio" name="cityRadio" value="Hiroshima-ken">広島
      <input type="radio" id="cityRadio" name="cityRadio" value="Kochi Prefecture">高知
      <input type="radio" id="cityRadio" name="cityRadio" value="Fukuoka Prefecture">福岡
      <input type="radio" id="cityRadio" name="cityRadio" value="Kagoshima-ken">鹿児島
      <input type="radio" id="cityRadio" name="cityRadio" value="Okinawa">沖縄
      <button id="submit"><i class="fas fa-paper-plane"></i>  Click</button>
    </form>
	</div>
        <div class="weatherMain">
            <h2>現在の天気は</h2>
            <div><span id = "weather" class="bold"><%= request.getAttribute("weather") %></span></div>
            <div><span id = "weatherMark" class="bold"></span></div>
            <p id="icon"></p>
        </div>
        <div>気温　<span id = "temp"  class="bold"><%= request.getAttribute("temp") %></span>　℃</div>
        <div>湿度　<span id = "humidity" class="bold"><%= request.getAttribute("humidity") %></span>　%</div>
    </div>

  <%--  <script>
    $(document).ready(function() {
        $("#submit").click(function (e) {
            //JSONデータ取得 日本語で天気名を表示したいのでlang=ja　として日本語表記データを取得
            $.post("http://api.openweathermap.org/data/2.5/weather?id=" + $("input[id='cityRadio']:checked").val() + "&appid=cc05750ba50400f27ebabbcd6f4c4976&lang=ja&units=metric",
                function(json){
                    $("#weather").html(json.weather[0].description);
                    $("#humidity").html(json.main.humidity);
                    //lang=jaにすることで華氏から摂氏に変換することなく摂氏表示となる。小数点だけ丸める処理をする
                    $("#temp").html(Math.round(json.main.temp));

                    //天気に応じた天気アイコンを表示させる
                    switch (json.weather[0].main){
                    case 'Clouds':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/04d.png' >");
                    break;
                    case 'Snow':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/13d.png' >");
                    break;
                    case 'Rain':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/09d.png' >");
                    break;
                    case 'Clear':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/01d.png' >");
                    break;
                    case 'Fog':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/50d.png' >");
                    break;
                    case 'Mist':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/50n.png' >");
                    break;
                    case 'Haze':
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/50d.png' >");
                    break;
                    default:
                    $("#weatherMark").html("<img src='http://openweathermap.org/img/w/01n.png' >");
                }
             }
        );
    });
});

</script>
--%>
</body>