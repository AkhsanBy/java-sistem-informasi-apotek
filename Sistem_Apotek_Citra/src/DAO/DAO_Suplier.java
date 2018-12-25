/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Koneksi.DataBase;
import Model.Suplier;
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
public class DAO_Suplier implements Model_DAO<Suplier> {
    
    public DAO_Suplier() {
        connection = DataBase.KoneksiDB();
    }
    
    Connection connection;
    String INSERT = "INSERT into suplier (kdsuplier, nmsuplier, alamat, telpsuplier) values(?,?,?,?)";
    String UPDATE = "UPDATE suplier SET nmsuplier=?, alamat=?, telpsuplier=? WHERE kdsuplier=?";
    String DELETE = "DELETE from suplier WHERE kdsuplier=?";
    String SELECT = "SELECT * from suplier";
    String CARI = "SELECT * from suplier WHERE kdsuplier LIKE ?";
    String COUNTER = "SELECT max(kdsuplier) as kode FROM suplier";
    
    @Override
    public int autonumber(Suplier object) {
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

    @Override
    public void insert(Suplier object) {
        PreparedStatement statement = null;
       try {
           statement = connection.prepareStatement(CARI);
           statement.setInt(1, object.getKode());
           ResultSet rs = statement.executeQuery();
           if (rs.next()) //jika data sudah pernah disimpan
               JOptionPane.showMessageDialog(null,"Data sudah pernah di dimpan!");
           else {  //Jika data belum pernah disimpan
               PreparedStatement statement2 = null;
               statement2 = connection.prepareStatement(INSERT);
               statement2.setInt(1, object.getKode());
               statement2.setString(2, object.getNama());
               statement2.setString(3, object.getAlamat());
               statement2.setString(4, object.getTelp());               
               statement2.executeUpdate();
               JOptionPane.showMessageDialog(null,"Data berhasil Di simpan!");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           try {
               statement.close();
           } catch (SQLException ex) {
               Logger.getLogger(DAO_Suplier.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }

    @Override
    public void update(Suplier object) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);
            statement.setString(1, object.getNama());
            statement.setString(2, object.getAlamat());
            statement.setString(3, object.getTelp());           
            statement.setInt(5, object.getKode());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();        
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Suplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void delete(Integer kode) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setInt(1, kode);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();        
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Suplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Suplier> getAll() {
        List<Suplier> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Suplier>();
            statement = connection.prepareStatement(SELECT);
             ResultSet rs = statement.executeQuery();
             
             while(rs.next()) {
                 Suplier s = new Suplier();
                 s.setKode(rs.getInt("kdsuplier"));
                 s.setNama(rs.getString("nmsuplier"));
                 s.setAlamat(rs.getString("alamat"));
                 s.setTelp(rs.getString("telpsuplier"));
                 list.add(s);
             } 
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Suplier> getCari(String key) {
        List<Suplier> list = null;
        PreparedStatement statement = null;
        try {
            list = new ArrayList<Suplier>();
            statement = connection.prepareStatement(CARI);
            statement.setString(1, "%"+key+"%");
            ResultSet rs = statement.executeQuery();
             
             while(rs.next()) {
                 Suplier s = new Suplier();
                 s.setKode(rs.getInt("kdsuplier"));
                 s.setNama(rs.getString("nmsuplier"));
                 s.setAlamat(rs.getString("alamat"));
                 s.setTelp(rs.getString("telpsuplier"));
                 list.add(s);
             } 
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;       
    }


}
