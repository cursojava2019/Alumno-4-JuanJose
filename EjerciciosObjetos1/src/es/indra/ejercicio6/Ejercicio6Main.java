package es.indra.ejercicio6;

public class Ejercicio6Main {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("j23453", "libro1", "Juan P�rez", 200);
		Libro l2 = new Libro("87dkd", "libro2", "Jorge Jim�nez", 400);
		
		String libroMasPaginas = "";
		
		if(l1.getNumPaginas() > l2.getNumPaginas()) {
			libroMasPaginas = l1.toString();
		}else if(l2.getNumPaginas() > l1.getNumPaginas()){
			libroMasPaginas = l2.toString();
		}else {
			libroMasPaginas = "Ambos libros tienen el mismo n�mero de p�ginas";
		}
		
		System.out.println("Libro con m�s p�ginas: ");
		System.out.println(libroMasPaginas);
	}

}
