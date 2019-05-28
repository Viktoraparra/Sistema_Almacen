package com.viktoraparra.connectors;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class ConnectorMySQL {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/DBAlmacen"+"?useTimezone=true&serverTimezone=UTC";
    private static String user="********";
    private static String pass="********";
    private static Connection conn=null;

    public ConnectorMySQL() {}
    
    public synchronized static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,pass);
                // Para confirmar establecimiento de conexion
                //JOptionPane.showMessageDialog(null, "ya se conecto","Información",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    }
}
