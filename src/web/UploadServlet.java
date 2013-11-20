package web;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class UploadServlet extends HttpServlet  {
	private String filePath;
	
	public void init(){
		filePath = getServletContext().getInitParameter(arg0)
	}
	

}
