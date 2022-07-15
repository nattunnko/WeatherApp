package weatherAPI;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String weather = (String) request.getAttribute("weather");
		String temp = (String) request.getAttribute("temp");
		String humidity = (String) request.getAttribute("humidity");

		if (weather == null ) {
			 request.setAttribute("weather", " ");
	    }
		if (temp == null ) {
			 request.setAttribute("temp", " ");
	    }
		if (humidity == null ) {
			 request.setAttribute("humidity", " ");
	    }

	    // JSPにforward
		String view = "/WEB-INF/view/index.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JsonJavaChangeTest jjct = new JsonJavaChangeTest();
		Weather weather = null;

		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
		// formから値を取得
	    String name = request.getParameter("cityRadio");
	    System.out.println(name);
	    weather = null;
	    weather = jjct.getWeather_info(name);

	    System.out.println(weather);
	    System.out.println(weather.weather.get(0).description);
	    request.setAttribute("weather", weather.weather.get(0).description);
	    request.setAttribute("temp", weather.main.temp);
	    request.setAttribute("humidity", weather.main.humidity);

		doGet(request, response);
	}

}
