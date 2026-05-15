package JTGM;

public class Registro {

	public String producto;
	public String tipo;
	public int cantidad;
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	public Registro(String producto, String tipo, int cantidad) {
		this.producto = producto;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public Registro () {
		
		
	}
}
