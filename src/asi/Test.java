package asi;

import asi.*;
public class Test {
	
	public static void main(String[] args) {
		gerente gerente1 = new gerente (" Elsa",5000," sistemas");
		System.out.println(" gerente1= " + gerente1.obtenerDetalle());
		// heredanto de la clase padre obtener detalle
	   
		Empleado empleado1= new Empleado(" Mary",2000);
		System.out.println("empleado1 ="+empleado1.obtenerDetalle());
		
		
	}

}
