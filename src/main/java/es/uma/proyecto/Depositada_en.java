package es.uma.proyecto;

public class Depositada_en {

	@Column(name = "Saldo", nullable = false)
	private float saldo;
	 @ManyToOne
	 private Referencia referencia;
	 @ManyToOne
	 private Pooled pooled;
	
	public Depositada_en(float saldo) {
		this.saldo = saldo;
	}
	
	public Depositada_en() {
		super();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

	@Override
	public String toString() {
		return "Depositada_en [saldo=" + saldo + "]";
	}
	
}
