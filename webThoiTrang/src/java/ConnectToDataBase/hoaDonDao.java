/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToDataBase;

import Model.gioHang_sp;
import Model.hoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thao
 */
public class hoaDonDao {
    
    public boolean add(hoaDon hoaDon1) {
        connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("INSERT into hoadon VALUES('" + hoaDon1.getEmail() + "', '" + hoaDon1.getTenNguoiNhan() + "', '" + hoaDon1.getDiaChiNguoiNhan() + "', '" + hoaDon1.getThoiGianNhan()+ "', '" + hoaDon1.getSoDT() + "', '" + hoaDon1.getMaSP() + "', '" + hoaDon1.getTenSP() + "', '" + hoaDon1.getTongTien() + "')");
            if (val == 1) {
                System.out.println("thanh cong");
                x.closeConnection();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<hoaDon> list() {
        ArrayList<hoaDon> v = new ArrayList<>();
        try {
            connection x = new connection();
            Statement st = x.statement();
            ResultSet res = st.executeQuery("SELECT * FROM hoadon");
            while (res.next()) {
                String email = res.getString("email");
                String nguoiNhan = res.getString("tenNguoiNhan");
                String diaChi = res.getString("diaChi");
                String thoiGian = res.getString("thoiGian");
                String soDT = res.getString("soDT");
                String maSP = res.getString("maSP");
                String tenSP = res.getString("tenSP");
                String tongTien = res.getString("tongTien");
                v.add(new hoaDon(email, nguoiNhan, diaChi, thoiGian, soDT, maSP, tenSP, tongTien));
            }
           
            x.closeConnection();
            return v;
        } catch (SQLException ex) {
            return null;
            // Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    public boolean removeToEmail(String email) {
         connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("DELETE FROM hoadon WHERE email='"+email+"'");
            if (val == 1) {
                System.out.println("thanh cong");
                x.closeConnection();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
