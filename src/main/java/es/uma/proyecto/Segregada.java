package es.uma.proyecto;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Segregada extends Fintech{
	private double comision;

	public Segregada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Segregada(String estado, Date fechaApertura, Date fechaCierre, String clasificacion) {
		super(estado, fechaApertura, fechaCierre, clasificacion);
		// TODO Auto-generated constructor stub
	}

	public Segregada(double comision) {
		super();
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Segregada [comision=" + comision + "]";
	}
	
	
}
