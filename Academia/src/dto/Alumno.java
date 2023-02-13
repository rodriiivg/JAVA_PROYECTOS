/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rodrigo valdes
 */
public class Alumno {
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaAlta;
    private String provincia;
    private String email;
    private String telefono;
    private String CP;
    private Date fechaUltFactura;
    private String calle;
    private String localidad;
    
     private SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
     public Alumno(String DNI, String nombre, String apellido1, String apellido2, String provincia, String email, String telefono, String CP, Date fechaUltFactura, Date fechaAlta, String calle, String localidad) {
        this.DNI = DNI;       
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.provincia = provincia;
        this.email = email;
        this.telefono = telefono;
        this.CP = CP;
        this.fechaAlta = fechaAlta;
        this.fechaUltFactura = fechaUltFactura;
        this.calle = calle;
        this.localidad = localidad;
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
     


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public Date getFechaUltFactura() {
        return fechaUltFactura;
    }

    public void setFechaUltFactura(Date fechaUltFactura) {
        this.fechaUltFactura = fechaUltFactura;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
    public String[] toArrayString()
    {
        String[] s = new String[12];
        s[0] = DNI;
        s[1] = nombre;
        s[2] = apellido1;
        s[3] = apellido2;
        s[4] = telefono;
        s[5] = email;
        s[6] = calle;
        s[7] = localidad;
        s[8] = provincia;
        s[9] = CP;
        s[10] = sdf.format(fechaAlta);
        s[11] = sdf.format(fechaUltFactura);
         return s;
    }
}
