package Modulos.Herramientas;

import Modulos.DataSistema.DataSistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import javax.swing.JOptionPane;



public class VariablesGlobales {
	
	


    /*ARRAY LIST GLOBA DE DATASISTEMA*/
    public static GestionBDDs gestion = new GestionBDDs();
    public static DataSistema dt = new DataSistema();
    public static DataSistema arrayclientes = new DataSistema();
    public DataSistema arrayempresa = new DataSistema();
    public static DataSistema arrayProductos = new DataSistema();
    public DataSistema arrayListaOrden = new DataSistema();
    public String categoria [] = {"Aceites y Lubricantes", "Llantas","Accesorios"};
    
    
    public static final String DRIVER_DB = "org.postgresql.Driver";
    
    public static final String USER_DB = "postgres";
    public static final String  URL_BDD = "jdbc:postgresql://localhost:5432/BDDProyecto3";
    public static final String PASSWORD_DB = "wilson";
    public static Connection conn;
    
    static{
        try {
            try {
        	Class.forName(DRIVER_DB);	
            }catch(ClassNotFoundException ex) {
            	JOptionPane.showConfirmDialog(null, "NO PODEMOS ENCONTRAR EL DRIVER DE POSTGRES");
            }
            conn = DriverManager.getConnection(URL_BDD, USER_DB, PASSWORD_DB);
            
        } catch (SQLException e) {
        	JOptionPane.showConfirmDialog(null, "NO PODEMOS ENCONTRAR LA BDD");
            e.printStackTrace();
        }
        }
    }
    

    
    /*public void conectar(){
    	try {
    		conn = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
    		JOptionPane.showMessageDialog(null, "Estas Conectado");
    	}catch(SQLException ex) {
    		JOptionPane.showMessageDialog(null, ex);
    	}
    }*/
    
 
