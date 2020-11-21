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

import co.edu.ufps.SegundoParcial1151812.DAO.ClienteDAO;

import co.edu.ufps.SegundoParcial1151812.model.Cliente;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ClienteDAO clienteDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	clienteDao = new ClienteDAO();
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action=request.getParameter("action");
		
		
		System.out.println(action);
		try {
		switch(action) {
		case "nuevo":
			registrarCliente(request,response);
			break;
		case "registro":
			formularioRegistro(request,response);
			break;
		case "login":
			formularioLogin(request,response);
			break;
			
		case "validar":
			validarLogin(request, response);			
			break;
			
		case "borrarEmpleado":
			//borrarEmpleado(request,response);
			break;
		
        case "editar":
            //editarEmpleado(request, response);
            break; 
       
	
		default: 
			//list(request,response);
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
	private void registrarCliente(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		        String nombre = request.getParameter("nombre");
		        String email = request.getParameter("email");
		        String clave = request.getParameter("clave");
		        
		        Cliente c1= new Cliente(0,nombre,email,clave);        
		        clienteDao.insert(c1);
		        //response.sendRedirect("registrar.jsp?op=1");
		        //el op=1 es una variable string con el valor de 1 que le mando a la clase registrar.jsp
		        
		        response.sendRedirect("index.jsp");     
		      
		}
	private void formularioRegistro(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("registroCliente.jsp");
		        dispatcher.forward(request, response);
		    }
	private void formularioLogin(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		        dispatcher.forward(request, response);
		    }
	private void validarLogin(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
	
			String correo=request.getParameter("email");
			String clave=request.getParameter("clave");
			Integer r=0;		
			
			List<Cliente> listaCliente= clienteDao.list();
			for (Cliente iterador : listaCliente) {			 
				if(iterador.getEmail().equals(correo) && iterador.getClave().equals(clave) ) {
					response.sendRedirect("RegistrarTienda.jsp");
				}
				else {
					System.out.println("CREDENCIALES INCORRECTOS");
				}	
				
			}			
		
		
		        
		    }
	
	

}
