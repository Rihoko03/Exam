package tool;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









@WebServlet("/FrontController")
public class FrontController extends HttpServlet{




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			String path = request.getServletPath().substring(1);
			String name = path.replace(".a", "A").replace('/', '.');
			System.out.println("★ servlet path ->" + request.getServletPath());
			System.out.println("★ class name ->" + name);

			Action action = (Action) Class.forName(name).getDeclaredConstructor().newInstance();
			action.execute(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		doGet(request, response);
	}
}




























