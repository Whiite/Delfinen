/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mikkel
 */
public class Results {
    // Swimming results.
    // There exists Competitive results and Training results.

    // Metode to input the competitive results into the Database
    public void registerTResults(String id, int distance, double time, String date) {
        DBConnector conn = null;
        Connection connection;
        String query = "";
        ResultSet rs = null;

        // Puts the data into the DataBase while catching the errors if present
        try {
            conn = new DBConnector();
            query = "INSERT INTO `delfinen`.`konkurrence_results` VALUE (`" + id + "`, `" + distance + "`, `" + time + "`, `" + date + "`);";
            connection = conn.getConnection();
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

        } catch (SQLException ex) {

        } catch (Exception ex) {

        }
    }

    // Metode to input date from Trainning results into the DataBase
    public void registerKResults(String id, String competition, String placement, double time) {
        DBConnector conn = null;
        Connection connection;
        String query = "";
        ResultSet rs = null;

        // Puts the data into the DataBase while catching the errors if present
        try {
            conn = new DBConnector();
            query = "INSERT INTO `delfinen`.`trainnings_res` VALUES (`" + id + "`, `" + competition + "`, `" + placement + "`, `" + time + "`);";
            connection = conn.getConnection();
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

        } catch (SQLException ex) {

        } catch (Exception ex) {

        }
    }

    // Metode to find Trainning results inside the Database
    public void findTResults(String id) {
        DBConnector conn = null;
        Connection connection;
        String query = "";
        ResultSet rs = null;
        ArrayList<String> tResults = new ArrayList<>();

        // Takes data from the Database and matches it with id 
        try {
            conn = new DBConnector();
            query = "SELECT * FROM `delfinen`.`trainnings_res` where `member_id` = `" + id + "`;";
            connection = conn.getConnection();
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

            // To-Do Return
        } catch (SQLException ex) {

        } catch (Exception ex) {

        }
    }

    // Metode to find Competitive results inside the Database
    public void findKResults(String id) {
        DBConnector conn = null;
        Connection connection;
        String query = "";
        ResultSet rs = null;
        ArrayList<String> kResults = new ArrayList<>();

        // Takes data from the Database and matches it with id
        try {
            conn = new DBConnector();
            query = "SELECT * FROM `delfinen`.`konkurrence_results` WHERE `member_id` = `" + id + "`;";
            connection = conn.getConnection();
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

            // To-Do return 
        } catch (SQLException ex) {

        } catch (Exception ex) {

        }
    }

}
