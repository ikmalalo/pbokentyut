/*
 0* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ikmal
 */

import Database.DatabaseConnection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mahasiswa {
    final private String NIM;
    final private String Nama_Mahasiswa;
    final private String Password;

    private static String currentID_Mahasiswa;

    public Mahasiswa(String NIM, String Nama_Mahasiswa, String Password) {
        this.NIM = NIM;
        this.Nama_Mahasiswa = Nama_Mahasiswa;
        this.Password = Password;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama_Mahasiswa() {
        return Nama_Mahasiswa;
    }

    public String getPassword() {
        return Password;
    }
    
     public static String getCurrentID_Mahasiswa() {
        return currentID_Mahasiswa;
    }
     
    public static final boolean loginMahasiswa(String NIM, String password) {
        Connection conn = DatabaseConnection.getInstance().getConnection(); // Menggunakan Singleton untuk mendapatkan koneksi
        try {
            String query = "SELECT * FROM mahasiswa WHERE NIM = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query); // Menggunakan koneksi dari Singleton
            preparedStatement.setString(1, NIM); // Gunakan setInt untuk NIM karena tipenya adalah int
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                currentID_Mahasiswa = resultSet.getString("ID_Mahasiswa");
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Login Gagal! NIM atau password salah.");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login Gagal! " + e.getMessage());
        }
        return false;
    }
}
