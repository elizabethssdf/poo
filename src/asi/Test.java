package asi;

import asi.gerente;
public class Test {
	
	public static void main(String[] args) {
		gerente gerente1 = new gerente (" Elsa",5000," sistemas");
		System.out.println(" gerente1= " + gerente1.obtenerDetalle());
		// heredanto de la clase padre obtener detalle
		
		gerente gerente2 = new gerente ("Nancy",7000,"emfermeria");
		System.out.println(" gerente2=" +gerente2.obtenerDetalle());
		
		gerente gerente3 = new gerente ("Jose",3000," huachiman");
		System.out.println(" gerente3 ="+gerente3.obtenerDetalle());
		
		gerente gerente4= new gerente (" Yolanda",4000," recursos humanos");
		System.out.println(" gerente4 ="+gerente4.obtenerDetalle());
		
	}

}
