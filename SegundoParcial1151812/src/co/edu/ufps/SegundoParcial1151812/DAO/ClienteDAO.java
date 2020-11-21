package co.edu.ufps.SegundoParcial1151812.DAO;

import co.edu.ufps.SegundoParcial1151812.Conexion.Conexion;
import co.edu.ufps.SegundoParcial1151812.model.Cliente;

public class ClienteDAO 
extends Conexion<Cliente> 
implements GenericDAO{	

	public ClienteDAO() {	
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

}
