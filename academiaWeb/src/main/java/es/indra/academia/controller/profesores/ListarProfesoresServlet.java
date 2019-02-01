package es.indra.academia.controller.profesores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.indra.academia.model.entities.Profesor;
import es.indra.academia.model.service.ProfesorService;

/**
 * Servlet implementation class ListarAlumnosServer
 */
@WebServlet("/admin/profesores/listado.html")
public class ListarProfesoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = LogManager.getLogger(ListarProfesoresServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarProfesoresServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.log.info("Se recibe una petición para listar profesores");
		ProfesorService profesorService = ProfesorService.getInstance();

		List<Profesor> profesores = profesorService.findAll();

		request.setAttribute("listado", profesores);
		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/listado.jsp");
		this.log.debug("Se obtienen todos los profesores de BBDD y se mandan al jsp");
		dispacher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProfesorService profesorService = ProfesorService.getInstance();
		String patron = request.getParameter("patron");
		List<Profesor> profesores = null;
		if (patron != null && !patron.equals("")) {
			profesores = profesorService.findProfesoresPatron(patron);
		} else {
			profesores = profesorService.findAll();
		}

		request.setAttribute("listado", profesores);

		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/listado.jsp");
		dispacher.forward(request, response);
	}

}