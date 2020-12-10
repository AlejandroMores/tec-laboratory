package com.labtec.lab.greeting.model;

import java.io.Serializable;

public class Greeting implements Serializable {

	private  Long id;
	private String nombre;
	private String message;

	public Greeting() {
	}

	public Greeting(Long id, String nombre, String message) {
		this.id = id;
		this.nombre = nombre;
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
