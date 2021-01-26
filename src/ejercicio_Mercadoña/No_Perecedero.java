package ejercicio_Mercadoña;

public final class No_Perecedero extends Producto{
	
	private int fecha_caducidad;

	public No_Perecedero(String nombre, String descripcion, String codigo, int fecha_caducidad) {
		super(nombre, descripcion, codigo);
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(int fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	@Override
	public String toString() {
		return "No_Perecedero fecha_caducidad " + fecha_caducidad;
	}
	
	
	
}
