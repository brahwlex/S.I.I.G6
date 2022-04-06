package es.uma.proyecto;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Cliente extends Usuario{

    @Column(name= "Identificación", unique = true, nullable = false)
    private int Identificacion;

    @Column(name= "Tipo_Cliente", nullable = false)
    private String Tipo_Cliente;

    @Column(name= "Estado", nullable = false)
    private String Estado;

    @Column(name= "Fecha_Alta", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date Fecha_Alta;

    @Temporal(TemporalType.DATE)
    private Date Fecha_Baja;

    @Column(name= "Direccion", nullable = false)
    private String Direccion;

    @Column(name= "Codigo_Postal", nullable = false)
    private int Codigo_Postal;

    @Column(name= "Ciudad", nullable = false)
    private String Ciudad;

    @Column(name= "País", nullable = false)
    private String País;
    
    @OneToMany (mappedBy = "dueño")
    private List<Fintech> cuentas_fintech;
    
    


    public Cliente(int id, int identificacion, String tipo_Cliente, String estado, Date fecha_Alta,
                   Date fecha_Baja, String direccion, int codigo_Postal, String ciudad, String país) {
        super(id);
        Identificacion = identificacion;
        Tipo_Cliente = tipo_Cliente;
        Estado = estado;
        Fecha_Alta = fecha_Alta;
        Fecha_Baja = fecha_Baja;
        Direccion = direccion;
        Codigo_Postal = codigo_Postal;
        Ciudad = ciudad;
        País = país;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public String getTipo_Cliente() {
        return Tipo_Cliente;
    }

    public String getEstado() {
        return Estado;
    }

    public Date getFecha_Alta() {
        return Fecha_Alta;
    }

    public Date getFecha_Baja() {
        return Fecha_Baja;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getCodigo_Postal() {
        return Codigo_Postal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getPaís() {
        return País;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Identificacion=" + Identificacion +
                ", Tipo_Cliente='" + Tipo_Cliente + '\'' +
                ", Estado='" + Estado + '\'' +
                ", Fecha_Alta='" + Fecha_Alta + '\'' +
                ", Fecha_Baja='" + Fecha_Baja + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Codigo_Postal=" + Codigo_Postal +
                ", Ciudad='" + Ciudad + '\'' +
                ", País='" + País + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cliente cliente = (Cliente) o;

        return Identificacion == cliente.Identificacion;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Identificacion;
        return result;
    }
}


