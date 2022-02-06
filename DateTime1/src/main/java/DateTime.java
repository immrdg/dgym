

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateTime
 */
public class DateTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 1);
		//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		//writing html in the stream  
		pw.println("<html><body><h1>");  
		pw.println(dft.format(LocalDateTime.now()));  
		pw.println("</h1></body></html>");  
		  
		pw.close();//closing the stream  
	}

}
