/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author thao
 */
public class Ddos implements ServletRequestListener, HttpSessionListener{
public static int soLuongRequest=0;
public static int soLuonSession=0;
public static chong_brute_force x=new chong_brute_force("Ddos", 0, (long)System.currentTimeMillis(), (long)System.currentTimeMillis(), true);
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        soLuongRequest++;
        x.setSoLan(soLuongRequest);
        x.setThoiGianLanCuoi((long)System.currentTimeMillis());
        if(soLuongRequest>10&& (x.getThoiGianLanCuoi()-x.getThoiGianLanDau())/soLuongRequest<6000){
          
            try{
                System.out.println("phat hien so luot request tang bay thuong");
            }catch(Exception e){
                 System.out.println("loi ko gui duoc");
            }
           if(x.isFlag_sec()){
               x.setFlag_sec(false);
                 new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(60000);
                    x.setSoLan(0);
                    x.setThoiGianLanCuoi((long)System.currentTimeMillis());
                    x.setThoiGianLanDau((long)System.currentTimeMillis());
                    soLuongRequest=0;
                    x.setFlag_sec(true);
                } catch (Exception e) {
                }
                
               }
        }).start();
           }
           
        }
       
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        soLuonSession++;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
