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
@WebServlet("/HelloServlet1")
public class HelloServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = (String) request.getAttribute("userName");

		JsonJavaChangeTest jjct = new JsonJavaChangeTest();
		Weather weather = null;
		try {
	    	weather = jjct.getWeather_info(name);
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }

		 if (name == null || "".equals(name)) {
		        request.setAttribute("userName",weather.name );
		    }

	    // JSPにforward
		String view = "/WEB-INF/view/index1.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
	    // formから値を取得
	    String name = request.getParameter("name");

	    request.setAttribute("userName", name);

	    doGet(request, response);
	}

}

