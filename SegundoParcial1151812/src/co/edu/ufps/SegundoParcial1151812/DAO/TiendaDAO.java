package co.edu.ufps.SegundoParcial1151812.DAO;

import co.edu.ufps.SegundoParcial1151812.Conexion.Conexion;
import co.edu.ufps.SegundoParcial1151812.model.Tienda;

public class TiendaDAO 
extends Conexion<Tienda> 
implements GenericDAO{	

	public TiendaDAO() {	
		super(Tienda.class);
		// TODO Auto-generated constructor stub
	}
}
