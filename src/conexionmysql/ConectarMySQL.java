package conexionmysql;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author TLR
 */
public class ConectarMySQL {

     String nombre_BD, usuario, clave, servidor;
     Connection conexion;

    /**
     * @param nombre_BD nombre de la base de datos a la que nos conectaremos.
     * @param usuario usuario con el que nos conectaremos.
     * @param clave clave del usuario con el que nos conectaremos.
     */
    public ConectarMySQL( String servidor,String nombre_BD, String usuario, String clave) {
        this.servidor = servidor;
        this.nombre_BD = nombre_BD;
        this.usuario = usuario;
        this.clave = clave;
        
    }
    
    
    /**
    * Método encargado de la conexión a la base de datos.
    */
    public void conectar_BD() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/" + this.nombre_BD, this.usuario, this.clave);

            if (conexion != null) {
                JOptionPane.showMessageDialog(null, "Conectado a " + this.nombre_BD);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    
    /**
    * Método encargado de la desconexión de la base de datos.
    */
    public void desconectar_BD(){
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion: " + ex.getMessage());
        }
    }
    
    public ResultSet Consultar(String cadena_SQL){
        ResultSet rs=null;
        
        try { 
            Statement s = conexion.createStatement();
            rs = s.executeQuery (cadena_SQL);
            
        } catch (SQLException ex) { }
        
        return rs;
    }
    
    public void ejecutar(String cadenaSql){        
        try { 
            Statement s = conexion.createStatement();
            s.execute(cadenaSql);
            
        } catch (SQLException ex) { }
       
    }
     
}
