package co.edu.ufps.SegundoParcial1151812.DAO;

import co.edu.ufps.SegundoParcial1151812.Conexion.Conexion;
import co.edu.ufps.SegundoParcial1151812.model.Cliente;
import co.edu.ufps.SegundoParcial1151812.model.Servicio;

public class ServicioDAO 
extends Conexion<Servicio> 
implements GenericDAO{	

	public ServicioDAO() {	
		super(Servicio.class);
		// TODO Auto-generated constructor stub
	}
}