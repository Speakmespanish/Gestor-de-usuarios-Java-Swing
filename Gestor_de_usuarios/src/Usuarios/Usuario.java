package Usuarios;

public class Usuario {

	String Nombre, Correo, Contrasena;
	
	
	public Usuario () {
		
	}
	
	public Usuario (String Nombre, String Correo, String Contrasena) {
		
		this.Nombre = Nombre;
		this.Correo = Correo;
		this.Contrasena = Contrasena;
	}
	
	public String getNombre() {
		
		return Nombre;
	}
	
	public String getCorreo() {
		
		return Correo;
	}
	
	public String getContrasena() {
		
		return Contrasena;
	}
	
	public void setNombre(String Nombre) {
		
		this.Nombre = Nombre;
	}
	
	public void setCorreo(String Correo) {
		
		this.Correo = Correo;
	}
	
	public void setContrasena(String Contrasena) {
		
		this.Contrasena = Contrasena;
	}
	
	@Override
	public String toString() {
		return Nombre;
	}
}
