/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToDataBase;

import Model.user;
import java.security.MessageDigest;
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
public class account {
        public String md5(String MD5) {
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(MD5.getBytes());
        byte[] b=md.digest();
        StringBuffer sb=new StringBuffer();
        for(byte x: b){
            sb.append(Integer.toHexString(x & 0xff).toString());
        }
        return sb.toString();
        }catch(Exception e){
            return "123";
        }
        
    }
    public boolean DangKi(String user, String email, String password, String laiPassword, String quyen){
        if(user.length()<1||email.length()<1||password.length()<1||laiPassword.length()<1||password.equals(laiPassword)!=true){
            return false;
        }else{
                password=md5(password);
               connection x=new connection();
               Statement st=x.statement();
            try {
                int val = st.executeUpdate("INSERT into user VALUES('" + user + "', '" + email + "', '" + password + "', '" + quyen + "')");
                if(val==1)
                    return true;
                x.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
 public user kiemTra(String email, String password){
     if(email.length()<1||password.length()<1){
         return null;
     }else{
         try {
             password=md5(password);
             connection x=new connection();
             Statement st=x.statement();
             ResultSet res = st.executeQuery("SELECT * FROM user");
              
             while (res.next()) {
                 String mail = res.getString("email");
                 String pass = res.getString("password");
                 String user=res.getString("user");
                 if(mail.equals(email)&&password.equals(pass)){
                     user KH=new user(user, email, password);     
                     return KH;
                 }
             }
             x.closeConnection();
         } catch (SQLException ex) {
             return null;
            // Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
         }
     }        
    
     return null;
 }
 public boolean kiemTraADMIN(String email, String password){
         try {
             
             connection x=new connection();
             Statement st=x.statement();
             ResultSet res = st.executeQuery("SELECT * FROM user");
  //           ResultSet res2 = st.executeQuery("SELECT * FROM user where email='"+email +"' and password ='"+password+"'");
     
             while (res.next()) {
                 String mail = res.getString("email");
                 String pass = res.getString("password");
                 String user=res.getString("user");
                 String quyen=res.getString("quyen");
                 if(mail.equals(email)&&password.equals(pass)&&quyen.equals("admin")){
                     return true;
                 }
             }
//1' or '1'='1
//if(res2!=null){
//    return true;
//}
             x.closeConnection();
         } catch (SQLException ex) {
             return false;
            // Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
         }
          return false;
 }
 public ArrayList<user> DSUser(){
        try {
            ArrayList<user> al=new ArrayList<>();
            connection x=new connection();
            Statement st=x.statement();
            //           ResultSet res = st.executeQuery("SELECT * FROM user");
            ResultSet res = st.executeQuery("SELECT * FROM user where quyen='KhachHang'");
             while (res.next()) {
                 String mail = res.getString("email");
                 String pass = res.getString("password");
                 String user=res.getString("user");
                     user KH=new user(user, mail, pass); 
                     al.add(KH);
             }
            return al;
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
 }
 

}
