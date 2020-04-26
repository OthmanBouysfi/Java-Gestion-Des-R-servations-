package com.rsv.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rsv.beans.Client;
import com.rsv.beans.Reservation;

/**
 * Servlet implementation class creer_rsc
 */
@WebServlet("/creer_rsc")
public class creer_rsv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creer_rsv() {
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
		String type = request.getParameter("type");
		String option = request.getParameter("option");
		Double prix;
		
		String message;
		try {
			prix = Double.parseDouble(request.getParameter("prix"));
		}catch(NumberFormatException e){
			prix = 0.5;
			
		}
		if(nom.trim().isEmpty() || prenom.trim().isEmpty() || email.trim().isEmpty() || telephone.trim().isEmpty() || type.trim().isEmpty() || option.trim().isEmpty() || prix==0.5 ) {
	       message="vous devez remplire tous les champs SVP !!";
			
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/reservation.jsp").forward(request , response);
			
		}else {
			message="Réservation Avec Succés";
			request.setAttribute("message", message);
			Client client = new Client();
			Reservation reservation = new Reservation();
			
			reservation.setType(type);
			reservation.setOption(option);
			reservation.setPrix(prix);
			
			
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setEmail(email);
			client.setTelephone(telephone);
			
			client.setReservation(reservation);
		
			request.setAttribute("client", client);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/inforsv.jsp").forward(request , response);
		}
		
	}

}
