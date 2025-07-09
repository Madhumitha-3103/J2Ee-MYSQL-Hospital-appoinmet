package Projectpack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connectionclass.Sqlconnection;

/**
 * Servlet implementation class Updateview
 */
@WebServlet("/Updateview")
public class Updateview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Sqlconnection ref=new Sqlconnection();
		try {
			ref.insert(Integer.parseInt(request.getParameter("appNo")),request.getParameter("patientName"),Integer.parseInt(request.getParameter("patientAge")),
					request.getParameter("patientDob"),request.getParameter("doctorName"),request.getParameter("dateandtime"));
		}catch(Exception e) {
			System.out.println(e);
		}
		response.sendRedirect("Detretrive");
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
