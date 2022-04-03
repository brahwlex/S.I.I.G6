package es.uma.proyecto;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Pooled extends Fintech{

	public Pooled() {
		super();
	}

	public Pooled(String estado, Date fechaApertura, Date fechaCierre, String clasificacion) {
		super(estado, fechaApertura, fechaCierre, clasificacion);
	}

}
