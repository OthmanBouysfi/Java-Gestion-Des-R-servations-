package com.rsv.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rsv.beans.Client;

/**
 * Servlet implementation class creer_client
 */
@WebServlet("/creer_client")
public class creer_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creer_client() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom"); 
		String prenom = request.getParameter("prenom"); 
		String email = request.getParameter("email"); 
		String telephone = request.getParameter("telephone"); 
		
		String message;
		
		if (nom.trim().isEmpty() || prenom.trim().isEmpty() || email.trim().isEmpty() || telephone.trim().isEmpty()) {
			
			message="vous devez remplire tous les champs SVP !!";
			
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/inscription.jsp").forward(request , response);
			
			
		}else {
			message="Inscription Avec Succés";
			request.setAttribute("message", message);
			Client client = new Client();
			
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setEmail(email);
			client.setTelephone(telephone);
			
			request.setAttribute("client", client);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/infoclient.jsp").forward(request , response);

		}
	}

}
