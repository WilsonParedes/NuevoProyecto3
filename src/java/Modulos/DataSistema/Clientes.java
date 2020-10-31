package Modulos.DataSistema;

import Modulos.Herramientas.Utilerias;
public class Clientes implements Utilerias {
    private static int sigIdCliente=1;
    public int id;
    public String nombre;
    public String nit;
    public String fecha;
    public String genero;
    public String estadocivil;
    public int tipo;
    public String razonsocial;
    public String contacto;
    public String dpi;

    public Clientes() {
        this.id = sigIdCliente++;
    }

    public Clientes(String nombre, String nit, String fecha, String genero, String estadocivil,int tipo, String dpi,String razonsocial, String contacto){
        this();
        this.nombre = nombre;
        this.nit = nit;
        this.fecha = fecha;
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.tipo = tipo;
        this.dpi = dpi;
        this.razonsocial = razonsocial;
        this.contacto = contacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }


    public int getId() {
        return id;
    }

    public String getNit() {
        return nit;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {return nombre;}

    public String getFecha() {
        return fecha;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
    
    

    @Override
    public String toString(){
        return "\n["+getNombreClase()+"]"+"\tID:"+id+"\nNombre Completo:" + nombre +
                "\tNit: "+nit+"\tFecha: "+fecha+"\tGenero: "+genero+"\tEstado Civil: "+estadocivil + "Tipo " + tipo + "Dpi " + dpi+ "Razon social" + razonsocial + "Contacto"  + contacto;
    }


}
