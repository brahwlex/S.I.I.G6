package es.uma.proyecto;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;

public class Individual extends Cliente{



    @Column(name= "Nombre", nullable = false)
    private String Nombre;

    @Column(name= "Apellido", nullable = false)
    private String Apellido;

    @Column(name= "Contraseña", nullable = false)
    private String Contraseña;

    @Temporal(TemporalType.DATE)
    private Date Fecha_Nacimiento;

    public Individual(int id, int identificacion, String tipo_Cliente, String estado, String fecha_Alta, String fecha_Baja,
                      String direccion, int codigo_Postal, String ciudad, String país, String nombre, String apellido,
                      String contraseña, Date fecha_Nacimiento) {
        super(id, identificacion, tipo_Cliente, estado, fecha_Alta, fecha_Baja, direccion, codigo_Postal, ciudad, país);
        Nombre = nombre;
        Apellido = apellido;
        Contraseña = contraseña;
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", Fecha_Nacimiento=" + Fecha_Nacimiento +
                '}';
    }



}
