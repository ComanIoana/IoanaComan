/*
 * Adding and displaying data regarding books and authors
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
public class BookAuthorPreparedStatements {

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
            String isbnTest = "'978-606-789-042-6'";
            String isbn = "978-606-789-042-6";
            String title = "Unbroken";
            String pages = "473";
            String idType = "EPUB";
            String idQuality = "HIGH";
            String idGenre = "History";
            String ssnAuthorTest = "'2654865293250'";
            String ssnAuthor = "2654865293250";
            String firstName = "Laura";
            String surname = "Hillenbrand";
            String id = "86243";
            statement = connection.createStatement();
            String query = "SELECT ISBN FROM EBOOKS WHERE ISBN = "+isbnTest;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())             
                insertEbook(isbn, title, pages, idType, idQuality,idGenre);
            else{
                System.out.println("Ebook having ISBN "+isbn+" is already in our DB.");
            }
            statement = connection.createStatement();
            query = "SELECT SSN FROM BOOK_AUTHORS WHERE SSN = "+ssnAuthorTest;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                insertAuthor(ssnAuthor, firstName, surname);
            else{
                System.out.println("Author having SSN "+ssnAuthor+" is already in our DB.");
            }
            statement = connection.createStatement();
            query = "SELECT ID FROM EBOOKS_AUTHORS WHERE ID = "+id;
            resultSet = null;
            resultSet = statement.executeQuery(query);
            if (!resultSet.next())            
                insertEbookAuthor(id, isbn, ssnAuthor);        
            else{
                System.out.println("Author and eBook connection having ID "+id+" is already in our DB.");
            }            
            connection.commit();
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            query = "SELECT EBOOKS.ISBN, EBOOKS.TITLE,EBOOKS.ID_TYPE,EBOOKS.ID_QUALITY,EBOOKS.ID_GENRE, BOOK_AUTHORS.FIRST_NAME, BOOK_AUTHORS.SURNAME, EBOOKS_AUTHORS.ID \n" +
                            "FROM EBOOKS, BOOK_AUTHORS, EBOOKS_AUTHORS\n" +
                            "WHERE EBOOKS_AUTHORS.ID_ISBN=EBOOKS.ISBN AND EBOOKS_AUTHORS.ID_SSN=BOOK_AUTHORS.SSN";
            resultSet = statement.executeQuery(query);
            if (resultSet!=null)
            {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$-18s %2$-50s %3$-25s %4$-25s %5$-25s %6$-30s %7$-30s","ISBN", "TITLE", "TYPE", "QUALITY", "GENRE", "AUTHOR FIRST NAME", "AUTHOR SURNAME");
                System.out.println(sb.toString());
                System.out.println("=================="+ "==================="+ "========================="+ "======"+ "==============="+ "====================="+ "======================="+"=================="+ "==================="+ "=========================");
                while(resultSet.next()){
                    String currentISBN = resultSet.getString(1);
                    String currentTitle = resultSet.getString(2);
                    String currentType = resultSet.getString(3);
                    String currentQuality = resultSet.getString(4);
                    String currentGenre = resultSet.getString(5);
                    String currentName = resultSet.getString(6);
                    String currentSurname = resultSet.getString(7);
                    sb = new StringBuilder();
                    formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-18s %2$-50s %3$-25s %4$-25s %5$-25s %6$-30s %7$-30s",currentISBN, currentTitle, currentType, currentQuality, currentGenre, currentName, currentSurname);
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
     * @param sISBN
     * @param sTitle
     * @param sPages
     * @param sIdType
     * @param sIdGenre
     * @param sIdQuality
     * @throws SQLException
     */
    public static void insertEbook(String sISBN, String sTitle, String sPages, String sIdType, String sIdQuality, String sIdGenre) throws SQLException {
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
            DML = "INSERT INTO EBOOKS VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement pstmnt;
            pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sISBN);
            pstmnt.setString(2, sTitle);
            pstmnt.setInt(3, Integer.parseInt(sPages));
            pstmnt.setString(4, sIdType);
            pstmnt.setString(5, sIdQuality);
            pstmnt.setString(6, sIdGenre);
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
     * @param sSSN
     * @param sFirstName
     * @param sSurname
     * @throws SQLException
     */
    public static void insertAuthor(String sSSN, String sFirstName, String sSurname) throws SQLException {
        String user = "ebook";
        String password = "ebook";
        String url = "jdbc:derby://localhost:1527/eBook;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String DML = "INSERT INTO BOOK_AUTHORS VALUES (?, ?, ?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sSSN);
            pstmnt.setString(2, sFirstName);
            pstmnt.setString(3, sSurname);
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
    
    /**
     *
     * @param sID
     * @param sISBN
     * @param sSSN
     * @throws SQLException
     */
    public static void insertEbookAuthor(String sID, String sISBN, String sSSN) throws SQLException {
        String user = "ebook";
        String password = "ebook";
        String url = "jdbc:derby://localhost:1527/eBook;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String DML = "INSERT INTO EBOOKS_AUTHORS VALUES (?, ?, ?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setInt(1, Integer.parseInt(sID));
            pstmnt.setString(2, sISBN);
            pstmnt.setString(3, sSSN);
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
