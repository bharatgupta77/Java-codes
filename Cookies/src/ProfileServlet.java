

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		//Cookie ck[]=request.getCookies();
		
		HttpSession session=request.getSession(false);
		
		/*if(ck!=null) {
			out.println("welcome to your profile");
			ck[0].setMaxAge(10);
			response.addCookie(ck[0]);
		}
		
		else {
			out.println("unauthorized.....");
		}*/
		
		
		if(session!=null) {
			request.getSession(true);
			out.println("welcome");
			out.println(session.getId());
			int k=Integer( session.getAttribute("Count"));
			k++;
			
			
			out.println(k);
			//session.invalidate();
			
		}
		
		else {
			request.getSession();
			out.println("unauthorized.....");
		}
		
		
		
		
	}

	private int Integer(Object attribute) {
		// TODO Auto-generated method stub
		return 0;
	}

}
