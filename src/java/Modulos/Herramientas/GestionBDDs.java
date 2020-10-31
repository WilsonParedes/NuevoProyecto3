package Modulos.Herramientas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modulos.DataSistema.Clientes;
import Modulos.DataSistema.*;
import Modulos.DataSistema.Productos;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionBDDs {

    
        //Session
       
	    public ArrayList<Clientes> getBDDClientes(){
	        try {
                    VariablesGlobales.arrayclientes.LimpiarArrayClientes();
	            Statement statement = VariablesGlobales.conn.createStatement();
	            String consulta = " SELECT nit, dpi, nombre, fechanac, genero, estadocivil, nombreempresa, contactoempresa, tipocliente"+
	                              " FROM bddclientes";
	            ResultSet rs = statement.executeQuery(consulta);
	            while(rs.next()){
                        VariablesGlobales.arrayclientes.addCliente(new Clientes(rs.getString("nombre"), rs.getString("nit"), rs.getString("fechanac"),
                                rs.getString("genero"), rs.getString("estadocivil"),rs.getInt("tipocliente"),rs.getString("dpi"),rs.getString("nombreempresa"),
                                rs.getString("contactoempresa")));
	            }
                    rs.close();
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return VariablesGlobales.arrayclientes.getListaClientes();
	    }
            
            
            
            
            public ArrayList<Productos> getBDDProductos(){
	        try {
                    VariablesGlobales.arrayProductos.LimpiarArrayProductos();
	            Statement statement = VariablesGlobales.conn.createStatement();
	            String consulta = " SELECT nombreproducto, marca, categoria, precio"+
	                              " FROM bddproductos";
	            ResultSet rs = statement.executeQuery(consulta);
	            while(rs.next()){
                        VariablesGlobales.arrayProductos.addProducto(new Productos(rs.getString("categoria"),rs.getString("nombreproducto"),
                        rs.getString("marca"),rs.getInt("precio")));
	            }
                    rs.close();
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return VariablesGlobales.arrayProductos.getListaProductos();
	    }

	    /**
	     * M�todo sirve para persistir las carreras en la base de datos
     * @param clientes
     * @param clienteempresa
     * @param producto
	     */
	    public void saveCarrera(ClienteIndividual clientes,ClienteEmpresa clienteempresa,Productos producto){              
                String dml="";
                
                if(clientes!=null){
                    String temporalclientesIndividual="INSERT INTO bddclientes(nit, dpi, nombre, fechanac, genero, estadocivil,tipocliente) "
                                        	+ "   VALUES("+"'" + clientes.getNit()+"'"+ ",'"+ clientes.getDpi()+"'" +
                                                ",'" + clientes.getNombre() + "'"+ ",'" + clientes.getFecha()+ "'" + ",'" + clientes.getGenero()+ "'"+
                                                ",'" + clientes.getEstadocivil()+"'" + ",'" + clientes.getTipo()+ "')";
                    dml=temporalclientesIndividual;
                }
                if(clienteempresa!=null){
                    String temporalClientesEmpresa="INSERT INTO bddclientes(nit, nombre, fechanac, genero, estadocivil, nombreempresa, contactoempresa, tipocliente) "
                                        	+ "   VALUES("+"'" + clienteempresa.getNit()+"'" +",'" + clienteempresa.getNombre() + "'"+ ",'" + clienteempresa.getFecha()+ "'" + ",'" + clienteempresa.getGenero()+ "'"+
                                                ",'" + clienteempresa.getEstadocivil()+"'"+",'" + clienteempresa.getRazonsocial()+ "'"+",'" + clienteempresa.getContacto()+ "'"+ ",'" + clienteempresa.getTipo()+ "')";
                    dml=temporalClientesEmpresa;
                }
                if(producto!=null){
                    String temporalProductos="INSERT INTO bddproductos(nombreproducto, marca, categoria, precio) "
                                        	+ "   VALUES("+"'"+ producto.getProducto() +"'"+",'" + producto.getMarca() + "'" + 
                                                ",'" + producto.getCategoria()+ "'"+ ","+ producto.getPrecio() + ")";
                    dml=temporalProductos;
                }
                
                try {
                    
                    Statement statement = VariablesGlobales.conn.createStatement();	   
                    
                    System.out.println("dml = " + dml);
                    statement.executeUpdate(dml);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
	    }
                
            /*Modificación de datos*/
        
        public void eliminarRegistro(String distintivoBdd,String variableeliminacion){
            String eliminarregistro ="";
            if(distintivoBdd.equalsIgnoreCase(VariablesGlobales.BDDCLIENTES)){
                String temporalclientes="DELETE FROM bddclientes WHERE nit="+"'"+ variableeliminacion +"'"; 
                    eliminarregistro=temporalclientes;
                }else{
                String temporalproductos="DELETE FROM bddproductos WHERE nombreproducto="+"'"+ variableeliminacion +"'"; 
                    eliminarregistro=temporalproductos;
                }
            try{
                Statement statement = VariablesGlobales.conn.createStatement();
                statement.executeUpdate(eliminarregistro);
                System.out.println("REGISTRO ELIMINADO CON EXITO");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        
        
            /*Busqueda preparada para productos*/
        public ArrayList<Productos> busquedapreparadaProductos(String nombreproducto){
            VariablesGlobales.arrayProductos.LimpiarArrayProductos();
            
            String miconsultapreparada="SELECT nombreproducto,marca,categoria,precio FROM bddproductos WHERE nombreproducto=? ";
                try {
                    PreparedStatement miConsulta = VariablesGlobales.conn.prepareStatement(miconsultapreparada);
                    
                    miConsulta.setString(1, nombreproducto);
                    
                    ResultSet rs = miConsulta.executeQuery();
                    
                    while(rs.next()){
                        VariablesGlobales.arrayProductos.addProducto(new Productos(rs.getString("categoria"),rs.getString("nombreproducto"),
                        rs.getString("marca"),rs.getInt("precio")));
                    }
                    rs.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GestionBDDs.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                return VariablesGlobales.arrayProductos.getListaProductos();
        }
        
        
        
        
        public ArrayList<Clientes> busquedapreparadaClientes(String nitcliente){
            VariablesGlobales.arrayclientes.LimpiarArrayClientes();
            
            String miconsultapreparada="SELECT nit, dpi, nombre, fechanac, genero, estadocivil, nombreempresa, contactoempresa, tipocliente FROM bddclientes WHERE nit=? ";
                try {
                    PreparedStatement miConsulta = VariablesGlobales.conn.prepareStatement(miconsultapreparada);
                    
                    miConsulta.setString(1, nitcliente);
                    
                    ResultSet rs = miConsulta.executeQuery();
                    
                    while(rs.next()){
                        VariablesGlobales.arrayclientes.addCliente(new Clientes(rs.getString("nombre"), rs.getString("nit"), rs.getString("fechanac"),
                                rs.getString("genero"), rs.getString("estadocivil"),rs.getInt("tipocliente"),rs.getString("dpi"),rs.getString("nombreempresa"),
                                rs.getString("contactoempresa")));
                    }
                    
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestionBDDs.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                return VariablesGlobales.arrayclientes.getListaClientes();
        }
        
         /*metodo que filtra la BDD cliente y empresa*/
        public ArrayList<Clientes> busquedapreparadaClientesFiltroBDD(int filtroBDD){
            VariablesGlobales.arrayclientes.LimpiarArrayClientes();
            
            String miconsultapreparada="SELECT nit, dpi, nombre, fechanac, genero, estadocivil, nombreempresa, contactoempresa, tipocliente FROM bddclientes WHERE tipocliente=? ";
                try {
                    PreparedStatement miConsulta = VariablesGlobales.conn.prepareStatement(miconsultapreparada);
                    
                    miConsulta.setInt(1, filtroBDD);
                    
                    ResultSet rs = miConsulta.executeQuery();
                    
                    while(rs.next()){
                        VariablesGlobales.arrayclientes.addCliente(new Clientes(rs.getString("nombre"), rs.getString("nit"), rs.getString("fechanac"),
                                rs.getString("genero"), rs.getString("estadocivil"),rs.getInt("tipocliente"),rs.getString("dpi"),rs.getString("nombreempresa"),
                                rs.getString("contactoempresa")));
                    }
                    
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestionBDDs.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                return VariablesGlobales.arrayclientes.getListaClientes();
        }
        
        

        public void modificarregistro(String distintivoBDD, String buscarElemento, String cambiarElemento){
             String scriptmodificar="";
            
            if(distintivoBDD.equalsIgnoreCase(VariablesGlobales.BDDCLIENTES)){
                scriptmodificar = "UPDATE bddclientes SET nombre="+"'"+cambiarElemento+"'"+" WHERE nit="+"'"+buscarElemento+"';";
            }else{
                scriptmodificar = "UPDATE bddproductos SET nombreproducto="+"'"+cambiarElemento+"'"+" WHERE nombreproducto="+"'"+buscarElemento+"';";   
            }
            try{
                Statement registroamodificar = VariablesGlobales.conn.createStatement();
                registroamodificar.executeUpdate(scriptmodificar);
                System.out.println("REGISTRO MODIFICADO CON EXITO");
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }
        
	}

    

        


