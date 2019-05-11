import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


public class login extends HttpServlet {

	private Object userMap;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   response.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
	        response.setContentType("text/html");//设置输出的文件类型
	       
		  
		PrintWriter out = response.getWriter();
		String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if(username.equals("zhangsan")){
        	if(password.equals("password")){
       		 request.getRequestDispatcher("iii").forward(request, response);	
       	}
        	else{
               	  out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
             		out.println("<HTML>");
             		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
             		out.println("  <BODY>");
             		 out.println("密码错误");
              	  out.println("<a href='login.html'>请给我登录一家伙</a></br>");
             	
             		out.println("  </BODY>");
             		out.println("</HTML>");
             		out.flush();
             		out.close();
               	 
                 	// response.sendRedirect("");
                 } 
       }else{
              response.sendRedirect("zhuce.html");//注册
             }  
      
		out.flush();
		out.close();
       }   
}
		
		
        	
        	
        
		
		
	
	


