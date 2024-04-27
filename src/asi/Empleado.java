package asi;

public class Empleado {
	//padre
	protected String nombre;
	protected double sueldo;
	
	
	public Empleado (String nombre,double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		

	}
	//regresara 
	public String obtenerDetalle() {
		return "nombre:"+this.nombre+",sueldo:"+this.sueldo;
		
	}
	
	//usar get y set
	
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getsueldo () {
		return sueldo;
	}
	
	public void setsueldo(double sueldo) {
		
		this.sueldo = sueldo;
	}

}
	


