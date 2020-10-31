package Modulos.DataSistema;

import java.util.ArrayList;
import java.util.Arrays;
import Modulos.Herramientas.Usuarios;


public class DataSistema {
    public static ArrayList<Clientes> ListaClientes = new ArrayList<Clientes>();

    public static ArrayList<Productos> ListaProductos= new ArrayList<Productos>();

    public static ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>(20);
    public static ArrayList<Orden>ListaOrden=new ArrayList<Orden>(20);

    public static int i=0;
    public static String temp="";

    public DataSistema() {

    }

    public void addCliente(Clientes cl){ ListaClientes.add(cl);}
    public void addProducto(Productos pr){
        ListaProductos.add(pr);
    }
    public void addUsuarios(Usuarios us){
        ListaUsuarios.add(us);
    }
    public void addOrden(Orden oc){ListaOrden.add(oc);}

    public ArrayList<Clientes> getListaClientes() {return ListaClientes;}
    public ArrayList<Usuarios> getListaUsuarios() {return ListaUsuarios;}
    public ArrayList<Productos> getListaProductos(){return ListaProductos;}
    public ArrayList<Orden>getListaOrden(){return ListaOrden;}
    

    
    public Productos getVerProducto(int view){ return ListaProductos.get(view);}
    public Clientes getVerCliente(int view){return ListaClientes.get(view);}
    public Orden getVerOrden(int view){return ListaOrden.get(view);}
    public int getVerPrecio(int view){return ListaProductos.get(view).getPrecio();}

    public void getEliminarCliente(int view){ ListaClientes.remove(view); }
    public void getEliminarProducto(int view){ ListaProductos.remove(view); }
    public void getEliminarOrden(int view){ ListaOrden.remove(view); }
    
    public void LimpiarArrayClientes(){ListaClientes.clear();}
    public void LimpiarArrayProductos(){ListaProductos.clear();}

    public String toString() {
        for(Clientes tempclientes: ListaClientes){
            i++;
            temp+="\nCliente "+i+" "+tempclientes.toString();

        }
        return temp;
    }


    public String toStringPr() {
        for(Productos temproducto: ListaProductos){
            i++;
            temp+=temproducto.toString();

        }
        return temp;
    }
    public String toStringOc(){
        for(Orden temporden: ListaOrden){
            i++;
            temp+=temporden.toString();
        }
        return temp;
    }

}
