package asi;

public class gerente extends Empleado {
//hija
	private String  departamento;
	
	public gerente (String nombre,double sueldo,String departamento) {
		super(nombre,sueldo);// llamando al padre
		
		this.departamento=departamento;
	}
	// el override ayuda a modificar cambiar
	// metodo del padre
	@Override
	public String obtenerDetalle() {
		return super.obtenerDetalle()+",departamento:"+this.departamento;
		// el comportamiento se esta modificando se agrego el departamento desde la 
		
	}
}
