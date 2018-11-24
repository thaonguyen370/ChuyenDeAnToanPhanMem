/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToDataBase;

import Model.sanPham;
import Model.user;
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
public class sanPhamDao {

    public ArrayList<sanPham> xx = new ArrayList<>();

    public ArrayList<sanPham> DS_SP() {
        ArrayList<sanPham> list = new ArrayList<>();
        try {
            connection x = new connection();
            Statement st = x.statement();

            ResultSet res = st.executeQuery("SELECT * FROM sanpham");
            while (res.next()) {
                String ma = res.getString("ma");
                String Ten = res.getString("ten");
                String loai = res.getString("loai");
                String giaCu = res.getString("giaCu");
                String giaMoi = res.getString("giaMoi");
                String size = res.getString("size");
                String mau = res.getString("mau");
                String anhTruoc = res.getString("anhTruoc");
                String anhSau = res.getString("anhSau");
                String NgaySanXuat = res.getString("ngaySanXuat");
                String hangSX = res.getString("hangSX");
                String gioiTinh = res.getString("gioiTinh");
                String ghiChu = res.getString("ghiChu");
                xx.add(new sanPham(ma, Ten, loai, giaCu, giaMoi, size, mau, anhTruoc, anhSau, NgaySanXuat, hangSX, gioiTinh, ghiChu));

                list.add(new sanPham(ma, Ten, loai, giaCu, giaMoi, size, mau, anhTruoc, anhSau, NgaySanXuat, hangSX, gioiTinh, ghiChu));

            }
            x.closeConnection();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(sanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<sanPham> DS_hienThi(int page, int limit) {
        ArrayList<sanPham> zz = new ArrayList<>();
        for (int i = (page - 1) * limit; i < page * limit; i++) {
            if (i < xx.size()) {
                zz.add(xx.get(i));
            } else {
                break;
            }
        }

        return zz;
    }

    public boolean xoaSP(String ma) {
        connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("DELETE FROM sanpham WHERE ma='" + ma + "'");
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

    public boolean themSP(sanPham sp) {
        connection x = new connection();
        Statement st = x.statement();
        int val;
        try {
            val = st.executeUpdate("INSERT into sanpham VALUES(null, '" + sp.getTen() + "', '" + sp.getLoai() + "', '" + sp.getGiaCu() + "', '" + sp.getGiaMoi() + "', '" + sp.getSize() + "', '" + sp.getMau() + "', '" + sp.getAnhTruoc() + "', '" + sp.getAnhSau() + "', '" + sp.getNgaySanXuat() + "', '" + sp.getHangSX() + "', '" + sp.getGioiTinh() + "', '" + sp.getGhiChu() + "')");
            if (val == 1) {
                x.closeConnection();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(sanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
