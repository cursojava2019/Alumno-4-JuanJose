package es.indra.ejercicio6;

public class Ejercicio6Main {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("j23453", "libro1", "Juan Pérez", 200);
		Libro l2 = new Libro("87dkd", "libro2", "Jorge Jiménez", 400);
		
		String libroMasPaginas = "";
		
		if(l1.getNumPaginas() > l2.getNumPaginas()) {
			libroMasPaginas = l1.toString();
		}else if(l2.getNumPaginas() > l1.getNumPaginas()){
			libroMasPaginas = l2.toString();
		}else {
			libroMasPaginas = "Ambos libros tienen el mismo número de páginas";
		}
		
		System.out.println("Libro con más páginas: ");
		System.out.println(libroMasPaginas);
	}

}
