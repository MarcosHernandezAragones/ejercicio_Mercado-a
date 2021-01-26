package Ejercicio_tienda;

public class main {

	public static void main(String[] args) {
		
		Almacen c = new Almacen("JuanfranS.L");
		
		System.out.println("precio total de las bebidas " + c.calcularPrecioTotal());
		System.out.println("precio total de las bebidas por marca " + c.calcularPrecioMarca());
		
	}

}
