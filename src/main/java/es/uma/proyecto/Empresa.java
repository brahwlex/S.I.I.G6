package es.uma.proyecto;

import java.util.Objects;

import javax.persistence.*;

public class Empresa extends Cliente{
	@Column(nullable=false)
	private String razon_social;

	public Empresa(String razon_social) {
		super();
		this.razon_social = razon_social;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	
	
	
}
