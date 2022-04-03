package es.uma.proyecto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Fintech extends Cuenta{
	private String estado;
	@Temporal(TemporalType.DATE)
	private Date fechaApertura;
	@Temporal(TemporalType.DATE)
	private Date fechaCierre;
	private String clasificacion;

	public Fintech() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fintech(Long iBAN, Long sWIFT) {
		super(iBAN, sWIFT);
		// TODO Auto-generated constructor stub
	}

	public Fintech(String estado, Date fechaApertura, Date fechaCierre, String clasificacion) {
		super();
		this.estado = estado;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;
		this.clasificacion = clasificacion;
	}



	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Fintech [estado=" + estado + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre
				+ ", clasificacion=" + clasificacion + "]";
	}
	
}
