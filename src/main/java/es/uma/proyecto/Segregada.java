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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(comision);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Segregada other = (Segregada) obj;
		if (Double.doubleToLongBits(comision) != Double.doubleToLongBits(other.comision))
			return false;
		return true;
	}
	
	
}
