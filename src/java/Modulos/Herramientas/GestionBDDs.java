package Modulos.Herramientas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modulos.DataSistema.Clientes;
import Modulos.DataSistema.DataSistema;
import Modulos.DataSistema.Productos;
public class GestionBDDs {

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

	    /**
	     * M�todo sirve para persistir las carreras en la base de datos
     * @param clientes
	     * @param carrera
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

	}


