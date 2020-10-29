package Modulos.Herramientas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modulos.DataSistema.Clientes;
import Modulos.DataSistema.DataSistema;
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
	            String consulta = " SELECT nit, dpi, nombre , genero, estadocivil, fechanac"+
	                              " FROM bddclientes";
	            ResultSet rs = statement.executeQuery(consulta);
	            while(rs.next()){
                        VariablesGlobales.arrayclientes.addCliente((new Clientes(rs.getString("nombre"), rs.getString("nit"),
	            	rs.getString("fechanac"),rs.getString("genero"),rs.getString("estadocivil"),1)));
	            }
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
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return VariablesGlobales.arrayProductos.getListaProductos();
	    }

	    /**
	     * M�todo sirve para persistir las carreras en la base de datos
     * @param clientes
     * @param producto
	     */
	    public void saveCarrera(Clientes clientes,Productos producto){              
                String dml="";
                if(clientes!=null){
                    String temporalclientes="INSERT INTO bddclientes(idcliente, nit,nombre, genero, estadocivil,fechanac) "
                                        	+ "   VALUES("+ clientes.getId() + ",'" + clientes.getNit() + "'" + 
                                               ",'" + clientes.getNombre() + "'"+ ",'" + clientes.getGenero()+ "'" + ",'" + clientes.getEstadocivil() + "'"+
                                                ",'" + clientes.getFecha() + "')";
                    dml=temporalclientes;
                }else{
                    String temporalProductos="INSERT INTO bddproductos(nombreproducto, marca, categoria, precio) "
                                        	+ "   VALUES("+"'"+ producto.getProducto() +"'"+",'" + producto.getMarca() + "'" + 
                                                ",'" + producto.getCategoria()+ "'"+ ","+ producto.getPrecio() + ")";
                    dml=temporalProductos;
                }
                try {
                    String dml1="";
                    Statement statement = VariablesGlobales.conn.createStatement();	   
                    dml1=dml;
                    System.out.println("dml = " + dml);
                    statement.executeUpdate(dml);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
	    }
                
            /*Modificación de datos*/
        
        public void eliminarRegistro(String nombreproducto){
            try{
                String eliminarregistro = "DELETE FROM bddproductos WHERE nombreproducto="+"'"+ nombreproducto +"'";
                Statement statement = VariablesGlobales.conn.createStatement();
                System.out.println("EL REGISTRO HA SIDO ELIMINADO");
                statement.executeUpdate(eliminarregistro);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        
        
            /*Busqueda preparada para productos*/
        public ArrayList<Productos> busquedapreparadaProductos(String nombreproducto){
            VariablesGlobales.arrayProductos.LimpiarArrayProductos();
            
            String miconsultapreparada="SELECT nombreproducto,marca,categoria,precio FROM bddproductos WHERE nombreproducto=?";
                try {
                    PreparedStatement miConsulta = VariablesGlobales.conn.prepareStatement(miconsultapreparada);
                    
                    miConsulta.setString(1, nombreproducto);
                    
                    ResultSet rs = miConsulta.executeQuery();
                    
                    while(rs.next()){
                        VariablesGlobales.arrayProductos.addProducto(new Productos(rs.getString("categoria"),rs.getString("nombreproducto"),
                        rs.getString("marca"),rs.getInt("precio")));
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GestionBDDs.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                return VariablesGlobales.arrayProductos.getListaProductos();
        }

        
        
	}

    

        


