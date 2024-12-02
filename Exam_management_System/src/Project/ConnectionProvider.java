/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
//import java.lang.System.Logger;
import java.sql.*;

/**
 *
 * @author atharvachavhan
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        String url,name,pass;
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/qems";
            pass = "priyanka96";
                 
            con = DriverManager.getConnection(url,"root",pass);
            //con.close();
            //Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/","root","@Svlad2305");
            //System.out.print(con);
            return con;   
        }
        catch(ClassNotFoundException ex){
            System.out.print("Class not found");
            //Logger.getLogger ();
            return null;
        }
        catch(SQLException e){
            return null;
        }
    }
    
}
