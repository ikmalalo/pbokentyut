/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ikmal
 */
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;

public class Dosen {
    final private String NIP;
    final private String Nama_Dosen;
    final private String Password;

    public Dosen(String NIP, String Nama_Dosen, String Password) {
        this.NIP = NIP;
        this.Nama_Dosen = Nama_Dosen;
        this.Password = Password;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama_Dosen() {
        return Nama_Dosen;
    }

    public String getPassword() {
        return Password;
    }
    
    public static final boolean loginDosen(String NIP, String Password) {
        Connection conn = DatabaseConnection.getInstance().getConnection(); // Menggunakan Singleton untuk mendapatkan koneksi
        try {
            String query = "SELECT * FROM dosen WHERE NIP = ? AND Password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query); // Menggunakan koneksi dari Singleton
            preparedStatement.setString(1, NIP); 
            preparedStatement.setString(2, Password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Login Gagal! NIP atau password salah.");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login Gagal! " + e.getMessage());
        }
        return false;
    }
    
    public static void comboboxdosen(JComboBox<String> comboboxpilihdosen){
        comboboxpilihdosen.removeAllItems();
        try {
            // Membuat koneksi ke database
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT nama_dosen FROM dosen"; // Query SQL untuk mengambil nama dosen
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Tambahkan setiap nama dosen ke ComboBox
            while (rs.next()) {
                comboboxpilihdosen.addItem(rs.getString("nama_dosen"));
            }

            // Tutup ResultSet dan Statement
            rs.close();
            stmt.close();

        } catch (Exception e) {
            // Tampilkan pesan kesalahan jika ada
            e.printStackTrace();
        }
    }
}

