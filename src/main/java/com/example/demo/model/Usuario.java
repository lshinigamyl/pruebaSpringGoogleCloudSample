package com.example.demo.model;

public class Usuario {
	
	private final String nombre;
	private final boolean estado;
	
	public Usuario(String nombre, boolean estado) {
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public String getNombre() {
		return nombre;
	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	public boolean isEstado() {
		return estado;
	}
//	public void setEstado(boolean estado) {
//		this.estado = estado;
//	}
}
