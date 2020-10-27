package Modulos.DataSistema;
import Modulos.Herramientas.Utilerias;
public class Productos implements Utilerias {
    public int id;
    private static int sigIdProducto=2000;
    public String categoria;
    public String producto;
    public String marca;
    public int precio;


    public Productos(){
        this.id= sigIdProducto++;
    }

    public Productos(String categoria, String producto, String marca, int precio) {
        this();
        this.categoria = categoria;
        this.producto = producto;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setNombreProducto(String producto){this.producto = producto; }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProducto() {
        return producto;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "["+getNombreClase()+"]"+"\nID: "+id+"\tCategoria: "+categoria+"\tProducto: "+producto+"\tMarca: "
                +marca+"\tPrecio: Q"+precio;
    }

}



