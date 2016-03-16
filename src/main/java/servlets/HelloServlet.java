package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		double kwota = Double.parseDouble(request.getParameter("kwota"));
		int raty = Integer.parseInt(request.getParameter("raty"));
		double oprocentowanie = Double.parseDouble(request.getParameter("oprocentowanie"));
		int oplata = Integer.parseInt(request.getParameter("oplata"));
		String rodzaj = request.getParameter("rodzaj");
		double odsetki = 0;
		double kapital = 0;
		double rata = 0;
		double q = 0;
		if(rodzaj.equalsIgnoreCase("malejaca"))
		{
			kapital = kwota/raty;
			for( int i = raty; i>0; i--){
				
				odsetki = kwota*oprocentowanie/raty*12;				
				rata = kapital + odsetki;
				kwota = kwota - rata;
				response.setContentType("text/html");
				response.getWriter().println("<h1>Nr raty " +i + "<br>Kwota kapitalu "
						+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
						+ q + "</h1>");
			}

		}
		
		if(rodzaj.equalsIgnoreCase("stala"))
		{
			
				odsetki = kwota/oprocentowanie/raty;
				kapital = kwota/10;
				q = 1 + (oprocentowanie/raty/12);
				rata = kwota * Math.pow(q, raty) * (q-1) / (Math.pow(q, raty-1));
				response.setContentType("text/html");
				response.getWriter().println("<h1>Kwota kapitalu "
					+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
					+ "</h1>");
			
		}
		if(kwota==0 || raty==0 || oprocentowanie==0 || rodzaj==null || rodzaj==(""))
		{
			response.sendRedirect("/");
		}
		/*
		if(oplata==null || oplata.equals(""))
		{
			response.sendRedirect("/");
		}
		if(rodzaj==null || rodzaj.equals(""))
		{
			response.sendRedirect("/");
		}*/
		//response.setContentType("text/html");
		//response.getWriter().println("<h1>Kwota kapitalu "
				//+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
				//+ q + "</h1>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		double kwota = Double.parseDouble(request.getParameter("kwota"));
		int raty = Integer.parseInt(request.getParameter("raty"));
		double oprocentowanie = Double.parseDouble(request.getParameter("oprocentowanie"));
		int oplata = Integer.parseInt(request.getParameter("oplata"));
		String rodzaj = request.getParameter("rodzaj");
		double odsetki = 0;
		double kapital = 0;
		double rata = 0;
		double q = 0;
		if(rodzaj.equalsIgnoreCase("malejaca"))
		{
			kapital = kwota/raty;
			for( int i = raty; i>0; i--){
				
				odsetki = kwota*oprocentowanie/raty*12;				
				rata = kapital + odsetki;
				kwota = kwota - rata;
				response.setContentType("text/html");
				response.getWriter().println("<h1>Nr raty " +i + "<br>Kwota kapitalu "
						+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
						+ q + "</h1>");
			}

		}
		
		if(rodzaj.equalsIgnoreCase("stala"))
		{
			
				odsetki = kwota/oprocentowanie/raty;
				kapital = kwota/10;
				q = 1 + (oprocentowanie/raty/12);
				rata = kwota * Math.pow(q, raty) * (q-1) / (Math.pow(q, raty-1));
				response.setContentType("text/html");
				response.getWriter().println("<h1>Kwota kapitalu "
					+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
					+ "</h1>");
			
		}
		if(kwota==0 || raty==0 || oprocentowanie==0 || rodzaj==null || rodzaj==(""))
		{
			response.sendRedirect("/");
		}
		/*
		if(oplata==null || oplata.equals(""))
		{
			response.sendRedirect("/");
		}
		if(rodzaj==null || rodzaj.equals(""))
		{
			response.sendRedirect("/");
		}*/
		//response.setContentType("text/html");
		//response.getWriter().println("<h1>Kwota kapitalu "
				//+ kapital + "<br>Kwota odsetek " + odsetki  + "<br>Kwota raty" + rata  + "<br>" + oplata  + "<br>" + rodzaj
				//+ q + "</h1>");
		}
	}
