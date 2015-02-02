/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionmysql;

/**
 *
 * @author Kote
 */
public interface DatosConexion {
    public static final ConectarMySQL CONEXION = new ConectarMySQL("localhost","proyectotienda","root","hector");
}
