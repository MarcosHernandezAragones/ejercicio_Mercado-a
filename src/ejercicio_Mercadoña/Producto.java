package ejercicio_Mercadoña;

public class Producto {
	
	protected String nombre;
	protected String descripcion;
	protected String codigo;
	
	
	public Producto(String nombre, String descripcion, String codigo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return  "Producto nombre " + nombre + ", descripcion=" + descripcion + ", codigo" + codigo;
	}
	
	
	
	
}
