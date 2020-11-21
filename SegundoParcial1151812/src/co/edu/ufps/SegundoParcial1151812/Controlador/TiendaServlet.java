package co.edu.ufps.SegundoParcial1151812.Controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import co.edu.ufps.SegundoParcial1151812.DAO.TiendaDAO;
import co.edu.ufps.SegundoParcial1151812.model.Tienda;

/**
 * Servlet implementation class TiendaServlet
 */
@WebServlet("/TiendaServlet")
public class TiendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TiendaDAO tiendaDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
		tiendaDao = new TiendaDAO();
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
		
		
		System.out.println(action);
		try {
		switch(action) {
		case "nueva":
			registrarTienda(request,response);
			break;
		case "buscar":
			//buscar(request,response);
			break;
		case "formularioRegistro":
			//formularioRegistro(request,response);
			break;
			
		case "formularioBuscar":
			//formularioBuscar(request, response);			
			break;
			
		case "borrarEmpleado":
			//borrarEmpleado(request,response);
			break;
		
        case "editar":
            //editarEmpleado(request, response);
            break; 
       
	
		default: 
			list(request,response);
			break;	
		}
		}catch (SQLException ex) {
            throw new ServletException(ex);
        } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
private void list(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		
		List<Tienda> listaTienda= tiendaDao.list();
		request.setAttribute("lista", listaTienda);
		System.out.println(listaTienda);
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}	
private void registrarTienda(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        String nombre=request.getParameter("nombreT");
	        
	        String lema=request.getParameter("lemaT");
	        
	        String descripcion=request.getParameter("descripcionT");
	        
	        String email=request.getParameter("emailT");
	        
	        String clave=request.getParameter("claveT");
	        
	        String propietario=request.getParameter("propietarioT");
	        
	        String facebook=request.getParameter("facebookT");
	        
	        String web=request.getParameter("webT");
	        
	        String imagen=request.getParameter("imagenT");
	        
	        
	        Tienda tienda=new Tienda(0,clave,descripcion,email,facebook,imagen,lema,nombre,propietario,web);
	        tiendaDao.insert(tienda);
	        response.sendRedirect("index.jsp");     
		      
	    }


}
