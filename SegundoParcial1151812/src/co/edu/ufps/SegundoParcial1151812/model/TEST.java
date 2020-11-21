package co.edu.ufps.SegundoParcial1151812.model;

import co.edu.ufps.SegundoParcial1151812.DAO.ClienteDAO;
import co.edu.ufps.SegundoParcial1151812.DAO.TiendaDAO;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiendaDAO tiendaDao=new TiendaDAO();
		ClienteDAO clienteDao = new ClienteDAO();
		
		Cliente cliente1 = new Cliente(0,"Reinaldo Beltran","reinaldosb@ufps.edu.co","115");
		clienteDao.insert(cliente1);
		
		
		Tienda tienda= new Tienda(0,"123","Camisas Elegantes","elegantes@gmail.com","www.facebook.com","https://www.culturadigital.cl/wp/wp-content/uploads/2008/08/autor-portada.jpg","lema1","n1","Reinaldo SALAZAR","www.google.com");
		tiendaDao.insert(tienda);
		
	
		
	}

}
