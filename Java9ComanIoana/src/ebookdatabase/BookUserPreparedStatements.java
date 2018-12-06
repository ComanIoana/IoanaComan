/*
 * Adding and displaying data regarding books and users
 */
package ebookdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadatabaseconnection.ApelPreparedStatements;

/**
 *
 * @author AJC
 */
public class BookUserPreparedStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String user = "ebook";
        String password = "ebook";
        String url = "jdbc:derby://localhost:1527/eBook;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        try
        {
            try {
                Class driverClass = Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ApelPreparedStatements.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            String ssnUserTest = "'1770621052326'";
            String ssnUser = "1770621052326";
            String rating = "2";
            String isbn = "9781449472399";
            String id = "75965";
            statement = connection.createStatement();
            String query = "SELECT SSN FROM USERS WHERE SSN = "+ssnUserTest;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())             
                insertUser(ssnUser);
            else{
                System.out.println("User having SSN "+ssnUser+" is already in our DB.");
            }
            statement = connection.createStatement();
            query = "SELECT ID FROM EBOOKS_RATINGS_USERS WHERE ID = "+id;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())             
                insertEbookUser(id, rating, ssnUser, isbn);
            else{
                System.out.println("User and eBook connection having ID "+id+" is already in our DB.");
            }  
            connection.commit();
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            query = "SELECT EBOOKS_RATINGS_USERS.ID_SSN, EBOOKS.TITLE, EBOOKS_RATINGS_USERS.ID_RATING\n" +
                            "FROM EBOOKS_RATINGS_USERS, EBOOKS\n" +
                            "WHERE EBOOKS_RATINGS_USERS.ID_ISBN=EBOOKS.ISBN\n" +
                            "ORDER BY TITLE";
            resultSet = statement.executeQuery(query);
            if (resultSet!=null)
            {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$-18s %2$-50s %3$-1s","SSN", "TITLE", "RATING");
                System.out.println(sb.toString());
                System.out.println("=================="+ "==================="+ "========================="+ "=====================");
                while(resultSet.next()){
                    String currentSSN = resultSet.getString(1);
                    String currentTitle = resultSet.getString(2);
                    String currentRating = resultSet.getString(3);
                    sb = new StringBuilder();
                    formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-18s %2$-50s %3$-1s",currentSSN, currentTitle, currentRating);
                    System.out.println(sb.toString());
                }
            }
            else
            {
                System.out.println("No rows found in ResultSet");
            }
        } 
        catch (SQLException ex)
        {
            ex.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ApelPreparedStatements.class.getName()).log(Level.SEVERE, null, ex1);
            }  
        }        
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (Exception ex){ex.printStackTrace();}
            }
        }
    }
    /**
     * Methods call a database stored insert with parameters prepared statement
     * @param sSSN
     * @throws SQLException
     */
    public static void insertUser(String sSSN) throws SQLException {
        String user = "ebook";
        String password = "ebook";
        String url = "jdbc:derby://localhost:1527/eBook;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String DML = "";
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            DML = "INSERT INTO USERS VALUES (?)";
            PreparedStatement pstmnt;
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sSSN);
            pstmnt.execute();
        }
        catch (ClassNotFoundException | NumberFormatException | SQLException ex)
        {
            throw new SQLException();
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }
            if (statement == null)
            {
            } else {
                try
                {
                    statement.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }
        }
    } 
 
    /**
     *
     * @param sID
     * @param sRating
     * @param SSN
     * @param sISBN
     * @throws SQLException
     */
    public static void insertEbookUser(String sID, String sRating, String SSN, String sISBN) throws SQLException {
        String user = "ebook";
        String password = "ebook";
        String url = "jdbc:derby://localhost:1527/eBook;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String DML = "";
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            DML = "INSERT INTO EBOOKS_RATINGS_USERS VALUES (?, ?, ?, ?)";
            PreparedStatement pstmnt;
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setInt(1, Integer.parseInt(sID) );
            pstmnt.setShort(2, Short.parseShort(sRating));
            pstmnt.setString(3, SSN);
            pstmnt.setString(4, sISBN);
            pstmnt.execute();
        }
        catch (ClassNotFoundException | NumberFormatException | SQLException ex)
        {
            throw new SQLException(); 
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){ex.printStackTrace();}
            }
        }
    }    
}
