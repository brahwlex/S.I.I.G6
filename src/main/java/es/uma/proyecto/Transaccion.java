package es.uma.proyecto;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Transaccion{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "ID Único")
	private int id_unq;
	@Temporal(TemporalType.DATE)
	@Column(name="fechaInstrucción", nullable = false)
	private Date fechaInstruccion;
	@Column(name="cantidad", nullable = false)
	private float cantidad;
	@Temporal(TemporalType.DATE)
	private Date fechaEjecucion;
	@Column(name="Tipo", nullable=false)
	private String tipo;//LO PONGO COMO STRING O LO PONEMOS CON NUMEMEROS¿?
	private float comision;//LO PONGO COMO FLOAT O COMO INT¿?
	private String internacional;
	
	public Transaccion(int id_unq, Date fechaInstruccion, float cantidad, Date fechaEjecucion, String tipo, float comision, String internacional) {
		this.id_unq = id_unq;
		this.fechaInstruccion = fechaInstruccion;
		this.cantidad = cantidad;
		this.fechaEjecucion = fechaEjecucion;
		this.tipo = tipo;
		this.comision = comision;
		this.internacional = internacional;
	}
	public Transaccion() {
		super();
	}
	
	public int getId_unq() {
		return id_unq;
	}
	public void setId_unq(int id_unq) {
		this.id_unq = id_unq;
	}
	public Date getFechaInstruccion() {
		return fechaInstruccion;
	}
	public void setFechaInstruccion(Date fechaInstruccion) {
		this.fechaInstruccion = fechaInstruccion;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}
	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	public String getInternacional() {
		return internacional;
	}
	public void setInternacional(String internacional) {
		this.internacional = internacional;
	}
	
	@Override
	public String toString() {
		return "ID unico: "+this.id_unq+" fecha_Instruccion: "+this.fechaInstruccion+" cantidad: "+this.cantidad+" fecha_Ejecución: "+this.fechaEjecucion+" tipo: "+this.tipo+" comision: "+this.comision+" internacional: "+this.internacional;
	}
	
}