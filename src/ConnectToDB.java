/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectToDB {
	private static String Host = "jdbc:derby://localhost:1527/sample";
	public static Connection con;
	private static String uName = "app";
	private static String uPass= "app";

	public ConnectToDB() throws SQLException {
		this.con = DriverManager.getConnection( Host, uName, uPass);
	}
}
