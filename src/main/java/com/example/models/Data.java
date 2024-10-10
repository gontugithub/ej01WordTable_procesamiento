package com.example.models;

public class Data {
	
	private String Nombre;
	private String Apellido;
	private String Edad;
	
	public Data(String nombre, String apellido, String edad) {
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Data [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
	}
	
	
	

}
