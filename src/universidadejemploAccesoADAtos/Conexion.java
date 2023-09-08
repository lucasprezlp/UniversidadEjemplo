
package universidadejemploAccesoADAtos;

import java.sql.*;
public class Conexion {

    private static final String url="jdbc:mariadb://localhost/";
    private static final String bd="universidad";
    private static final String usuario= "root";
    private static final String pass ="";
    
    private static Connection conn ;

    private Conexion() {}
    
    public static Connection getConexion() {
        if (conn == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conn = DriverManager.getConnection(url + bd + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + usuario + "&password=" + pass);

                //  System.out.println("Conexion Exitosa");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("No se ha podido conectar" + ex);
            }
        }
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("No se ha podido desconectar");
        }
    }
}
