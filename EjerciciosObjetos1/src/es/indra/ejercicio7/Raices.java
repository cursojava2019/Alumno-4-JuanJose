package es.indra.ejercicio7;

public class Raices {
	
	private Integer a, b, c;

	public Raices(Integer a, Integer b, Integer c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		Double result1 = Math.sqrt(getDiscriminante());
		Double result2 = Math.sqrt(getDiscriminante());
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public void obtenerRaiz() {
		Double result = Math.sqrt(getDiscriminante());
		
		System.out.println(result);
	}
	
	public Double getDiscriminante() {
		Double discriminante = (Math.pow(b, 2)-4*a*c);
		return discriminante;
	}
	
	public Boolean tieneRaices() {
		if(getDiscriminante() >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void calcular() {
		Double result1 = (-b + Math.sqrt(getDiscriminante()) / (2*a));
		Double result2 = (-b + Math.sqrt(getDiscriminante()) / (2*a));
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
	
}
