/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Koneksi.DataBase;
import Model.Obat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author praktek
 */
public class DAO_Obat implements Model_DAO<Obat>{
    //private String CARIKATEGORI;
    
    public DAO_Obat() {
        connection = DataBase.KoneksiDB();
    }
    
    Connection connection;
    String INSERT = "INSERT into barang (kdbrg, nmbrg, satuan, hargabrg, stok, pemasok, kdkategori) values(?,?,?,?,?,?,?)";
    String UPDATE = "UPDATE barang SET nmbrg=?, satuan=?, hargabrg=?, stok=?, pemasok=?, kdkategori=?  WHERE kdbrg=?";
    String DELETE = "DELETE from barang WHERE kdbrg=?";
    String SELECT = "SELECT a.*, b.* from barang a, kategori b where a.kdkategori=b.kdkategori order by kdbrg";
    String CARI = "SELECT a.*, b.* from barang a, kategori b WHERE a.kdkategori=b.kdkategori and kdbrg like ?";
    String CARIKATEGORI = "SELECT * from kategori where kdkategori=?";
    String COMBO = "SELECT kdkategori from kategori order by convert(right(kdkategori,2),signed integer)";
    String COUNTER = "SELECT ifnull(max(convert(right(kdbrg,2), signed integer)),0) as kode,"
            + "ifnull(length(max(convert(right(kdbrg,2), signed integer))),0) as panjang "
            + "from barang where kdkategori=?";
    @Override
    public void insert(Obat object) {
       PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(CARI);
           statement.setString(1, object.getKodebarang());
           ResultSet rs = statement.executeQuery();
           if (rs.next()) //jika data sudah pernah disimpan
               JOptionPane.showMessageDialog(null,"Data sudah pernah di dimpan!");
           else {  //Jika data belum pernah disimpan
               PreparedStatement statement2 = null;
               statement2 = connection.prepareStatement(INSERT);
               statement2.setString(1, object.getKodebarang());
               statement2.setString(2, object.getNamabarang());
               statement2.setString(3, object.getSatuan());
               statement2.setInt(4, object.getHarga());
               statement2.setInt(5, object.getStok());
               statement2.setString(6, object.getNamapemasok());
               statement2.setInt(7, object.getKodekategori());
               statement2.executeUpdate();
               JOptionPane.showMessageDialog(null,"Data berhasil didimpan!");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           try {
               statement.close();
           } catch (SQLException ex) {
               Logger.getLogger(DAO_Obat.class.getName()).log(Level.SEVERE, null, ex);
           }
       }       
    }

    @Override
    public void update(Obat object) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CARI);
            statement.setString(1, object.getKodebarang());
            ResultSet rs = statement.executeQuery();        
            if(rs.next())
            {
               statement = connection.prepareStatement(UPDATE);
               statement.setString(1, object.getNamabarang());
               statement.setString(2, object.getSatuan());
               statement.setInt(3, object.getHarga());
               statement.setInt(4, object.getStok());
               statement.setString(5, object.getNamapemasok());
               statement.setInt(6, object.getKodekategori());
               statement.setString(7, object.getKodebarang());
               statement.executeUpdate();
               JOptionPane.showMessageDialog(null,"Data berhasil di ubah!");
            } else {
               JOptionPane.showMessageDialog(null,"Kode barang tersebut belum pernah disimpan!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();        
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    //@Override
        public void delete(String id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil di hapus!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();        
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Obat> getAll() {
        List<Obat> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Obat>();
            statement = connection.prepareStatement(SELECT);
            ResultSet rs = statement.executeQuery();
             while(rs.next()) {
                 Obat b = new Obat();
                 b.setKodebarang(rs.getString("kdbrg"));
                 b.setNamabarang(rs.getString("nmbrg"));
                 b.setSatuan(rs.getString("satuan"));
                 b.setHarga(rs.getInt("hargabrg"));
                 b.setStok(rs.getInt("stok"));
                 b.setNamapemasok(rs.getString("pemasok"));
                 b.setKodekategori(rs.getInt("a.kdkategori"));
                 b.setNamakategori(rs.getString("nmkategori"));
                 list.add(b);
             } 
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
       
    }

    @Override
    public List<Obat> getCari(String key) {
        List<Obat> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Obat>();
            statement = connection.prepareStatement(CARI);
            statement.setString(1, "%"+key+"%");
            ResultSet rs = statement.executeQuery();
             
             while(rs.next()) {
                 Obat b = new Obat();
                 b.setKodebarang(rs.getString("kdbrg"));
                 b.setNamabarang(rs.getString("nmbrg"));
                 b.setSatuan(rs.getString("satuan"));
                 b.setHarga(rs.getInt("hargabrg"));
                 b.setStok(rs.getInt("stok"));
                 b.setKodekategori(rs.getInt("a.kdkategori"));
                 b.setNamakategori(rs.getString("nmkategori"));
                 list.add(b);
             } 
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list; 
    }
    
    @Override
    public int autonumber(Obat object) {
        PreparedStatement statement = null;
        int nomor = 0;
        try {
            statement = connection.prepareStatement(COUNTER);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) 
              nomor = rs.getInt("kode")+1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nomor;
    }
    
    //@Override
    public String autonumber2(Integer id) {
        PreparedStatement statement = null;
        //int nomor_berikutnya = 0;
        String urutan = "B" + id + "01";
        try {
            statement = connection.prepareStatement(COUNTER);
            statement.setInt(1, id);
            ResultSet rs2 = statement.executeQuery();
            if(rs2.next()) {
             
             urutan = "0" + (rs2.getInt("kode") + 1);
             urutan = "B" + id+urutan.substring(urutan.length()-2);
            /*
             nomor_berikutnya = rs2.getInt("kode")+1;
             if(rs2.getInt("kode")!=0) { // jika kode kategori sudah pernah ada
                    if(rs2.getInt("panjang") == 1) { // jika jumlah digitnya adalh 1
                        urutan = "B" + id + "0" + nomor_berikutnya;
                    } else if(rs2.getInt("panjang") == 2) { // jika jumlah digitnya adalah 2
                        urutan = "B" + id + nomor_berikutnya; 
                    }
             }
             else { //jika kode kategori belum pernah ada
                 urutan = "B" + id + "01";
             }
             */
             
            } else
                JOptionPane.showMessageDialog(null,"Data tidak ditemukan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urutan;
    } 
    
    
    public List<Obat> getkdkat(String nmkat) {
        PreparedStatement statement;
        List<Obat> list = null;
        try {
            list = new ArrayList();
            String CARIKATEGORI = "SELECT * FROM kategori where nmkategori=?";    
            statement = connection.prepareStatement(CARIKATEGORI);
            statement.setString(1, nmkat);
            ResultSet rs = statement.executeQuery();   
           
            while (rs.next()) {                         
                Obat b = new Obat();
                b.setKodekategori(rs.getInt("kdkategori"));
                list.add(b);            
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    } 
    
     public List<Obat> isicombokat() {
        PreparedStatement statement;
        List<Obat> list = null;
        try {
            list = new ArrayList();
            String TAMPILPELANGGAN = "SELECT * FROM kategori order by nmkategori";
            statement = connection.prepareStatement(TAMPILPELANGGAN);
            ResultSet rs = statement.executeQuery();              
            while (rs.next()) {
                Obat b = new Obat();  
                b.setNamakategori(rs.getString("nmkategori"));
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     
     // PEMASOK
     public List<Obat> getkdpemasok(String nmsup) {
        PreparedStatement statement;
        List<Obat> list = null;
        try {
            list = new ArrayList();
            String CARISUPLIER = "SELECT * FROM suplier where nmsuplier=?";    
            statement = connection.prepareStatement(CARISUPLIER);
            statement.setString(1, nmsup);
            ResultSet rs = statement.executeQuery();   
           
            while (rs.next()) {                         
                Obat b = new Obat();
                b.setNamapemasok(rs.getString("nmsuplier"));
                b.setKodepemasok(rs.getString("kdsuplier"));
                list.add(b);            
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     
     public List<Obat> isicombopemsok() {
        PreparedStatement statement;
        List<Obat> list = null;
        try {
            list = new ArrayList();
            String TAMPILSUPLIER = "SELECT * FROM suplier order by nmsuplier";
            statement = connection.prepareStatement(TAMPILSUPLIER);
            ResultSet rs = statement.executeQuery();              
            while (rs.next()) {
                Obat b = new Obat();  
                b.setNamapemasok(rs.getString("nmsuplier"));
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }  

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
