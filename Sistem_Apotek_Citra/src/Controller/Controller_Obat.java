/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DAO.DAO_Obat;
import Model.Obat;
import View.MObat;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praktek
 */
public class Controller_Obat{
   
    MObat form;
    DAO_Obat model;
    List<Obat> list;
    String[] header;
    
    public Controller_Obat(MObat form) {
        this.form = form;
        model = new DAO_Obat();
        list  = model.getAll();
        header = new String[]{"KODE OBAT", "NAMA OBAT", "SATUAN", "HARGA", "STOK", "PEMASOK", "KODE KATEGORI", "NAMA KATEGORI"};
        
        form.getTblbarang().setShowGrid(true);
        form.getTblbarang().setShowVerticalLines(true);
        form.getTblbarang().setGridColor(Color.blue);
    }
    
    public void isicombokategori() {
        form.getCmbkategori().removeAllItems();
        form.getCmbkategori().addItem("--Pilih--");
        for(Obat B : model.isicombokat()) {
            form.getCmbkategori().addItem(B.getNamakategori());
        }
    }
    
    public void isicombopemasok() {
        form.getCmbpemasok().removeAllItems();
        form.getCmbpemasok().addItem("--Pilih--");
        for(Obat B : model.isicombopemsok()) {
            form.getCmbpemasok().addItem(B.getNamapemasok());
        }
    }    
    
    public void tampilurutankode() {
        if (form.getCmbkategori().getSelectedIndex() > 0) {
            form.getTxtkdbarang().setText(String.valueOf(model.autonumber2(Integer.parseInt
            (form.getTxtnmkategori().getText()))));
        } 
    }
    
    public void tampilkategori() {
        if (form.getCmbkategori().getSelectedIndex() != 0) {
            for (Obat b : model.getkdkat(form.getCmbkategori().getSelectedItem().toString())) {
                form.getTxtnmkategori().setText(String.valueOf(b.getKodekategori()));
            }
        }
    }
    
    public void tampilpemasok() {
        if (form.getCmbpemasok().getSelectedIndex() != 0) {
            for (Obat b : model.getkdpemasok(form.getCmbpemasok().getSelectedItem().toString())) {
                //form.getTxtnmkategori().setText(String.valueOf(b.getKodekategori()));
            }
        }
    }  
    
    public void isiTable() {
        list = model.getAll();
        
        // script agar jtable gabisa di edit
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header) {
            public boolean  isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        
        Object[] data = new Object[header.length];
        for(Obat B : list) {
            data[0] = B.getKodebarang();
            data[1] = B.getNamabarang();
            data[2] = B.getSatuan();
            data[3] = B.getHarga();
            data[4] = B.getStok();
            data[5] = B.getNamapemasok();
            data[6] = B.getKodekategori();
            data[7] = B.getNamakategori();
            tblModel.addRow(data);
        }
        form.getTblbarang().setModel(tblModel);
    }
    
    public void reset() {
        form.getCmbkategori().setSelectedIndex(0);
        form.getTxtnmkategori().setText("");
        form.getTxtkdbarang().setText("");
        form.getTxtnmbarang().setText("");
        form.getCmbsatuan().setSelectedIndex(0);
        form.getTxtharga().setText("");
        form.getTxtstok().setText("");
        form.getTxtkatakunci().setText("");
        form.getTxtnmbarang().requestFocus();
        form.getTxtnmkategori().setEditable(false);
        form.getTxtkdbarang().setEditable(false);
        isicombokategori();
        tampilurutankode();
        isicombopemasok();
        isiTable();
    }
    
    public void isiField(int row) {
        form.getCmbkategori().setSelectedItem(list.get(row).getKodekategori());
        form.getTxtnmkategori().setText(Integer.toString(list.get(row).getKodekategori()));
        form.getTxtkdbarang().setText(list.get(row).getKodebarang());
        form.getTxtnmbarang().setText(list.get(row).getNamabarang());
        form.getCmbsatuan().setSelectedItem(list.get(row).getSatuan());
        form.getTxtharga().setText(String.valueOf(list.get(row).getHarga()));
        form.getTxtstok().setText(String.valueOf(list.get(row).getStok()));
        form.getCmbpemasok().setSelectedItem(list.get(row).getNamapemasok());
    }    

    public void insert() {
        Obat B = new Obat();
        B.setKodebarang(form.getTxtkdbarang().getText());
        B.setNamabarang(form.getTxtnmbarang().getText());
        B.setSatuan(form.getCmbsatuan().getSelectedItem().toString());
        B.setHarga(Integer.parseInt(form.getTxtharga().getText()));
        B.setStok(Integer.parseInt(form.getTxtstok().getText()));
        B.setNamapemasok(form.getCmbpemasok().getSelectedItem().toString());
        B.setKodekategori(Integer.parseInt(form.getTxtnmkategori().getText()));
        model.insert(B);
    }
    
    public void update() {
        Obat B = new Obat();
        int i =  Integer.parseInt(form.getTxtnmkategori().getText());
        B.setNamabarang(form.getTxtnmbarang().getText());
        B.setSatuan(form.getCmbsatuan().getSelectedItem().toString());
        B.setHarga(Integer.parseInt(form.getTxtharga().getText()));
        B.setStok(Integer.parseInt(form.getTxtstok().getText()));
        B.setNamapemasok(form.getCmbpemasok().getSelectedItem().toString());
        B.setKodekategori(i);
        B.setKodebarang(form.getTxtkdbarang().getText());
        model.update(B);
    }    
 
    public void delete() {
        if(!form.getTxtkdbarang().getText().trim().isEmpty()) {
            String id = (form.getTxtkdbarang().getText());
            model.delete(id);
        } 
        else {
            JOptionPane.showMessageDialog(form,"Pilih data yang akan dihapus!");
        
        }
    }
    
    public void isiTableCari() {
        list = model.getCari(form.getTxtkatakunci().getText().trim());
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
        Object[] data = new Object[header.length];
        
        for(Obat B : list) {
            data[0] = B.getKodebarang();
            data[1] = B.getNamabarang();
            data[2] = B.getSatuan();
            data[3] = B.getHarga();
            data[4] = B.getStok();
            data[5] = B.getNamapemasok();
            data[6] = B.getKodekategori();
            data[7] = B.getNamakategori();
            tblModel.addRow(data);
        }
        form.getTblbarang().setModel(tblModel);
    }
    
    
}
