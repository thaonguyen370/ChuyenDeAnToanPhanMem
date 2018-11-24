/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ConnectToDataBase.connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author thao
 */
public class push {

    public static void main(String[] args) throws SQLException {
        connection x = new connection();
        Statement st = x.statement();
        String ma="0";
        String Ten = "ao dep";
        String loai="ao";
        String giaCu="150000";
        String giaMoi="100000";
        String size="xl";
        String mau="do";
        String anhTruoc="images/s2.jpg";
        String anhSau="images/s1.jpg";
        String NgaySanXuat="1/1/2018";
        String hangSX="thao";
        String gioiTinh="nam";
        String ghiChu="50";
        for(int i=0;i<20;i++){
            ma=String.valueOf(i);
             int val = st.executeUpdate("INSERT into sanpham VALUES(null, '" + Ten + "', '" + loai + "', '" + giaCu + "', '" + giaMoi + "', '" + size + "', '" + mau + "', '" + anhTruoc + "', '" + anhSau + "', '" + NgaySanXuat + "', '" + hangSX + "', '" + gioiTinh + "', '" + ghiChu + "')");
             if(val==1){
                 System.out.println("thanh cong");
             }
        }
     
       
       
    
    }
}
