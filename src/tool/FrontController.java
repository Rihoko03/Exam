package tool;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









@WebServlet("/FrontController")
public class FrontController extends HttpServlet{




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletExcetion, IOException {
	//TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletExcetion, IOException {
		//TODO Auto-generated method stub
		doGet(request, response);
	}
}