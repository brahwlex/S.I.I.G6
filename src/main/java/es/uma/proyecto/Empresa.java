package es.uma.proyecto;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.*;

public class Empresa extends Cliente{
	@Column(nullable=false)
	private String razon_social;

	public Empresa(int id, int identificacion, String tipo_Cliente, String estado, Date fecha_Alta, Date fecha_Baja,
			String direccion, int codigo_Postal, String ciudad, String país, String razon_social) {
		super(id, identificacion, tipo_Cliente, estado, fecha_Alta, fecha_Baja, direccion, codigo_Postal, ciudad, país);
		this.razon_social = razon_social;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(razon_social);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(razon_social, other.razon_social);
	}

	@Override
	public String toString() {
		return "Empresa [razon_social=" + razon_social + ", getIdentificacion()=" + getIdentificacion()
				+ ", getTipo_Cliente()=" + getTipo_Cliente() + ", getEstado()=" + getEstado() + ", getFecha_Alta()="
				+ getFecha_Alta() + ", getFecha_Baja()=" + getFecha_Baja() + ", getDireccion()=" + getDireccion()
				+ ", getCodigo_Postal()=" + getCodigo_Postal() + ", getCiudad()=" + getCiudad() + ", getPaís()="
				+ getPaís() + ", toString()=" + super.toString() + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ "]";
	}
	
	
}
	
	
	

