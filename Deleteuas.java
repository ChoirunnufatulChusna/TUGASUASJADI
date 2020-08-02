/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chusna_1855201016;

import java.sql.Statement;
import pertemuan10.*;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Deleteuas {
    Koneksiuas status = new Koneksiuas();
    

    public void delete(String kodebarang) {

        try {
            status.koneksi();
            Statement statement = status.con.createStatement();

            String sql = "delete from barang1 where kodebarang = '" + kodebarang + "'" ;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
