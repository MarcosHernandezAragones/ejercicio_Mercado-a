package ejercicio_Mercadoña;

public final class Perecedero extends Producto{
	
	private int fecha_caducidad;

	public Perecedero(String nombre, String descripcion, String codigo, int fecha_caducidad) {
		super(nombre, descripcion, codigo);
		this.fecha_caducidad = fecha_caducidad;
	}
	
	
	
}
