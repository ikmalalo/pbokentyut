package Model;

import Database.DatabaseConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Surat {
    private final String ID_Mahasiswa;
    private final String Isi_Surat;
    private final String Jenis_Surat;
    private final File FileSurat;
    private String Status_Surat; 

    // Constructor
    public Surat(String ID_Mahasiswa, String Isi_Surat, String Jenis_Surat, File FileSurat) {
        this.ID_Mahasiswa = ID_Mahasiswa;
        this.Isi_Surat = Isi_Surat;
        this.Jenis_Surat = Jenis_Surat;
        this.FileSurat = FileSurat;
        this.Status_Surat = "Pending"; // Set status to "Pending" automatically
    }

    // Getter methods

    public String getID_Mahasiswa() {
        return ID_Mahasiswa;
    }
    
    public String getIsi_Surat() {
        return Isi_Surat;
    }

    public String getJenis_Surat() {
        return Jenis_Surat;
    }
    
    public File getFileSurat() {
        return FileSurat;
    }

    public String getStatus_Surat() {
        return Status_Surat;
    }

    public void mengirimSurat() throws FileNotFoundException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        try {
            FileInputStream FileSuratInput = new FileInputStream(this.getFileSurat());
            String query = "INSERT INTO surat (ID_Mahasiswa, Isi_Surat, Jenis_Surat, Status_Surat, FileSurat) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.getID_Mahasiswa());
            preparedStatement.setString(2, this.getIsi_Surat());
            preparedStatement.setString(3, this.getJenis_Surat());
            preparedStatement.setString(4, this.getStatus_Surat()); 
            preparedStatement.setBinaryStream(5, FileSuratInput, (int) this.getFileSurat().length());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Surat Berhasil Dikirim");
            } else {
                JOptionPane.showMessageDialog(null, "Surat Gagal Dikirim. Format Tidak Benar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Mengirim: " + e.getMessage());
        }
    }
}