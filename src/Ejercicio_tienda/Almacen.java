package Ejercicio_tienda;

import java.util.Arrays;

public class Almacen{
	
	private String nombre;
	private Bebida mEstanteria [][];
	
	
	public Almacen(String nombre) {
		super();
		this.nombre = nombre;
		this.mEstanteria = new Bebida[5][5];
		mEstanteria[0][0]= new Azucarada("1",3.0,11,"Pepsi",5,true);
		mEstanteria[0][1]= new Agua("2", 3, 10, "Agua", "Murcia");
	}
	
	public float calcularPrecioTotal() {
		float precioTotal=0;
		
		for (Bebida[] bebidas : mEstanteria) {
			for (Bebida bebida : bebidas) {
				if (bebida !=null) {
					precioTotal += bebida.getPrecio();
				}
			}
		}
		
		return precioTotal;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Almacen nombre " + nombre + ", mEstanteria " + Arrays.toString(mEstanteria);
	}
	
	
}
