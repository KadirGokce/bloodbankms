 package bloodbankms;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
   /* public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/BloodBankMS";
        String user = "root";
        String password = "23071991.a";
        return DriverManager.getConnection(url, user, password);
    }
}*/
    
    public static void main(String[] args){
        
        final String DB_URL="jdbc:mysql://localhost:3306/BloodBankMS";
        final String USERNAME="root";
        final String PASSWORD="23071991.a";
        Connection conn=null;
        Statement stat=null;
           
        
        try {
            
            String sql = "SELECT * FROM bloodbankms.donor;";
            //ResultSet rs = stat.executeQuery(sql);
            
            conn=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            System.out.println("Veritabani baglantisi gerceklestirildi.");
            stat=(Statement) conn.createStatement();
            
            
            } 
            catch (SQLException ex) 
            {
                System.out.println("Veritabani baglantisi gerceklesmedi.");
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
     public static void insertData(String name, String email) {
        try (Connection connection = MySqlConnection.getConnection()) {
            String sql = "INSERT INTO donor (donor_adi, donor_soyadi, donor_tck, donor_anne, donor_baba, donor_cinsiyet, donor_dogumtarihi, donor_kangrubu, donor_tup) VALUES (1, 9)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Veri Ekleme Başarılı.");
                } else {
                    System.out.println("Veri Ekleme Başarısız.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void updateData(int id, String newName, String newEmail) {
    try (Connection connection = MySqlConnection.getConnection()) {
        String sql = "UPDATE donor SET donor_adi = ?, donor_soyadi = ? , donor_soyadi = ? , donor_tck = ?, donor_anne = ?, donor_baba = ?, donor_cinsiyet = ?, donor_dogumtarihi = ?, donor_kangrubu = ?, donor_tup = ?, WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setString(2, newEmail);
            preparedStatement.setInt(3, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                    System.out.println("Veri Ekleme Başarılı.");
                } else {
                    System.out.println("Veri Ekleme Başarısız.");
                }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
     public static void deleteData(int id) {
    try (Connection connection = MySqlConnection.getConnection()) {
        String sql = "DELETE FROM your_table WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("Failed to delete data.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
