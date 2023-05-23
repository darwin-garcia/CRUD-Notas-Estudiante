package co.edu.sena.Evaluacion.persistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Esta clase define los objetos necesarios para la conexion a la base de datos
 * Evaluacion Final 1694493
 * @author Darwin Garcia
 * @version: 30/06/2019
 */
public class Conexion {
    /*Campos de clase conexion*/
    private static String usuarioBase="root";/*Defino el usuario quien usa la base datos*/
    private static String passwdBase ="";/*En cualquier momento puede cambiar la contraseña del usuario de la base de datos */
    /**
     * Metodo que establece la conexion a la base de datos
     * @return con
     * @throws Exception 
     */
    public static Connection conectar() throws Exception{        
        try{/*El metodo Connection intenta conectarse a notas*/
            Class.forName("com.mysql.jdbc.Driver");/*Importo el Driver JDBC de la Carpeta Libreria*/
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notas",usuarioBase,passwdBase);
            return con;/*Si la conexion es exitosa*/
        }
        catch(Exception db){/*Cuando no puede conectarse a la base de datos*/
            db.printStackTrace();
            throw new Exception ("Error al conectar a la base de datos: "+db);/*Devuelve el error en la conexion de la base de datos*/
            
        }
    }/*Fin de la conexion*/   
    /**
     * Metodo que permite el cierre de conexion de la base de datos
     * @param ps Permite preparar la consulta SQL
     * @param rs Permite obtener los resultados de la consulta SQL
     * @param con Objeto que permite conectar la base de datos
     */
    public static void cerrar(PreparedStatement ps, ResultSet rs, Connection con){
        try{
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(con!=null){
                con.close();/*Cierro la conexion a la base de datos*/
            }
        }catch(Exception db){
            db.printStackTrace();
        }
    }/*Fin Metodo Cerrar*/
    public static void cerrar(PreparedStatement ps, ResultSet rs){
        cerrar(ps,rs,null);/*Llamo el metodo Cerrar*/
    }//Cierre del metodo cerrar
    public static void cerrar(PreparedStatement ps){
        cerrar(ps, null, null);/*Llamo el metodo Cerrar*/
    }//Cierre del metodo cerrar
    public static void cerrar(Connection con){
        cerrar(null,null,con);/*Llamo el metodo Cerrar*/
    }//Cierre del metodo cerrar
}/*Fin de la clase Conexion*/
