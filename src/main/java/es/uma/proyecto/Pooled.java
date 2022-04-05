package es.uma.proyecto;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Pooled extends Fintech{

	public Pooled() {
		super();
	}

	@Override
	public String toString() {
		return "Pooled [getEstado()=" + getEstado() + ", getFechaApertura()=" + getFechaApertura()
				+ ", getFechaCierre()=" + getFechaCierre() + ", getClasificacion()=" + getClasificacion()
				+ ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getIBAN()=" + getIBAN()
				+ ", getSWIFT()=" + getSWIFT() + ", getClass()=" + getClass() + "]";
	}



	

}
