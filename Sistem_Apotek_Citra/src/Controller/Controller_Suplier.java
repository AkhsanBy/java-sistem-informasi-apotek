/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DAO.DAO_Suplier;
import DAO.Model_DAO;
import Model.Suplier;
import View.MSuplier;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praktek
 */
public class Controller_Suplier {
    MSuplier form;
    Model_DAO<Suplier> model;
    List<Suplier> list;
    String[] header;
    
    public Controller_Suplier(MSuplier form) {
        this.form = form;
        model = new DAO_Suplier();
        list  = model.getAll();
        header = new String[]{"KODE", "NAMA PEMASOK", "ALAMAT", "TELEPON"};
        
        form.getTblsuplier().setShowGrid(true);
        form.getTblsuplier().setShowVerticalLines(true);
        form.getTblsuplier().setGridColor(Color.blue);       
    }
    
    public void tampilurutankode() {
        Suplier s = new Suplier();
        model.autonumber(s);
        form.getTxtkdsuplier().setText(String.valueOf(model.autonumber(s)));
    }
    
    public void reset() {
        form.getTxtkdsuplier().setText("");
        form.getTxtnmsuplier().setText("");
        form.getTxtalamatsuplier().setText("");
        form.getTxttelpsuplier().setText("");
        form.getTxtnmsuplier().requestFocus();
        form.getTxtkdsuplier().setEditable(false);
        tampilurutankode();
        isiTable();
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
        for(Suplier s : list) {
            data[0] = s.getKode();
            data[1] = s.getNama();
            data[2] = s.getAlamat();
            data[3] = s.getTelp();
            tblModel.addRow(data);
        }
        form.getTblsuplier().setModel(tblModel);
    }
    
    public void isiField(int row) {
        form.getTxtkdsuplier().setText(String.valueOf(list.get(row).getKode()));
        form.getTxtnmsuplier().setText(list.get(row).getNama());
        form.getTxtalamatsuplier().setText(list.get(row).getAlamat());
        form.getTxttelpsuplier().setText(list.get(row).getTelp());
    }
    
    public void insert() {
        Suplier s = new Suplier();
        s.setKode(Integer.parseInt(form.getTxtkdsuplier().getText()));
        s.setNama(form.getTxtnmsuplier().getText());
        s.setAlamat(form.getTxtalamatsuplier().getText());
        s.setTelp(form.getTxttelpsuplier().getText());
        model.insert(s);
    }
    
    public void update() {
        Suplier s = new Suplier();
        s.setKode(Integer.parseInt(form.getTxtkdsuplier().getText()));
        s.setNama(form.getTxtnmsuplier().getText());
        s.setAlamat(form.getTxtalamatsuplier().getText());
        s.setTelp(form.getTxttelpsuplier().getText());   
        model.update(s);
    }
    
    public void delete() {
        if(!form.getTxtkdsuplier().getText().trim().isEmpty()) {
            int kode = Integer.parseInt((form.getTxtkdsuplier().getText()));
            model.delete(kode);
        } 
        else {
            JOptionPane.showMessageDialog(form,"Pilih data yang akan dihapus!");
        
        }
    }
    
    public void isiTableCari() {
        list = model.getCari(form.getTxtkdsuplier().getText().trim());
        DefaultTableModel tblModel = new DefaultTableModel(new Object[][]{}, header);
        Object[] data = new Object[header.length];
        
        for(Suplier s : list) {
            data[0] = s.getKode();
            data[1] = s.getNama();
            data[2] = s.getAlamat();
            data[3] = s.getTelp();
            tblModel.addRow(data);
        }
        form.getTblsuplier().setModel(tblModel);
    }
    
}
