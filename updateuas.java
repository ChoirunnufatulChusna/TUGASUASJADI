/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chusna_1855201016;

import pertemuan10.*;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class updateuas {

    Koneksiuas konek = new Koneksiuas();

    public void update(String kb, String nb, int hrg, int jmlh) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update barang1 set namabarang = '" + nb + "'where kodebarang = '" + kb + "'";
            String sql_alamat = "update barang1 set harga = '" + hrg + "'where kodebarang = '" + kb + "'";
            String sql_jk = "update barang1 set jumlah = '" + jmlh + "'where kodebarang = '" + kb + "'";
            String sql_nim1 = "update barang1 set kodebarang = '" + kb + "'where namabarang = '" + nb + "'";
            String sql_nim2 = "update barang1 set kodebarang = '" + kb + "'where harga = '" + hrg + "'";

            statement.executeUpdate(sql_nim1);
            statement.executeUpdate(sql_nim2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
