
import Modulos.DataSistema.Clientes;
import Modulos.Herramientas.GestionBDDs;
import Modulos.Herramientas.VariablesGlobales;
import java.sql.*;
import Modulos.DataSistema.*;

public class Prueba {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*try {
			//crear conexion
			Connection conectar = DriverManager.getConnection(VariablesGlobales.URL_DB,VariablesGlobales.USER_DB, VariablesGlobales.PASSWORD_DB);
			
			// segundo paso
			Statement miState = conectar.createStatement();
			
			//Ejecutar la instrucci�n
			
			ResultSet miResulset = miState.executeQuery("SELECT * FROM bddclientes");
			
			//Recorrer el ResulSet
			while(miResulset.next()) {
				System.out.println(miResulset.getInt("idcliente")+ " "+ miResulset.getString("nit") + " "+ miResulset.getString("nombre"));				
			}
		}catch(Exception e) {
			System.out.println("No conecta");
			e.printStackTrace();
		}*/

 /*System.out.println(gestion.getBDDClientes().toString());*/
    String cambiarElemento="Llantas 17 rin";
    String buscarElemento="Llantas 18 rin";
        ClienteIndividual clienteindividual = new ClienteIndividual("215173990101", "wilson paredes", "hola", "hola", "hola", "hola",1);
        
    }
    
}
