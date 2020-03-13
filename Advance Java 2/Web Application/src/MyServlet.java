import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Anubhuti")
public class MyServlet extends HttpServlet {
 
 @Override
public void init() throws ServletException {
	System.out.println("from init -----it gets called only --always first");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from service----it vgets called multiple times");
	}
 @Override
	public void destroy() {
	 System.out.println("from destroy-----it gets called only once always last");
	}
	
}
