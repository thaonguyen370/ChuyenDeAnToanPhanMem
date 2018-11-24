/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.account;
import Model.Ddos;
import Model.chong_brute_force;
import Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author thao
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
private static ArrayList<chong_brute_force> al=new ArrayList<>();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        account taiKhoan = new account();
        if (action == null) {
            out.println("chua co gj");
        } else if (action.equals("login")) {
            String Email=request.getParameter("Email");
            String Password=request.getParameter("Password");
            if(Email.equals("admin")){
                if(taiKhoan.kiemTraADMIN(Email, Password)){

                     response.sendRedirect("admin/index.jsp");
                }else{
                    boolean flag_sec=true;
                    
                    for(chong_brute_force x: al){
                        if(x.getUser().equals("admin")){
                            x.setSoLan((x.getSoLan()+1));
                            x.setThoiGianLanCuoi((long)System.currentTimeMillis());
                            long t1=x.getThoiGianLanDau();
                            long t2=x.getThoiGianLanCuoi();
                            if(x.getSoLan()>5&&(t2-t1)/x.getSoLan()<100000){
                                x.setFlag_sec(false);
                                 response.sendRedirect("boc_lich.jsp");
                                 flag_sec=false;
                                 break;
                            }
                        }
                    }
                    if(flag_sec==true){
                        chong_brute_force a=new chong_brute_force(Email, 1,System.currentTimeMillis(), System.currentTimeMillis(),true);
                        al.add(a);
                        response.sendRedirect("login.jsp");
                    }
                     
                }
            }else{
                boolean flag=true;
                if(al.size()>0){
                    for(chong_brute_force x2: al){
                        if(x2.getUser().equals(Email)){
                            if(x2.isFlag_sec()!=true){
                                flag=false;
                               
                            }
                            break;
                        }
                    }
                }
              if(flag==true){            
              user x=taiKhoan.kiemTra(Email, Password);
            if(x!=null){
//                Cookie cookie=new Cookie("location",String.valueOf(Math.random()));
//                response.addCookie(cookie);
                HttpSession session= request.getSession();
                session.setAttribute("KH", x);    
                session.setAttribute("id", session.getId());
                //session.setMaxInactiveInterval(60);
                 response.sendRedirect("index.jsp");  
               
            }else{
                 boolean flag_sec=true;
                    
                    for(chong_brute_force x1: al){
                        if(x1.getUser().equals(Email)){
                            x1.setSoLan((x1.getSoLan()+1));
                            x1.setThoiGianLanCuoi((long)System.currentTimeMillis());
                            long t1=x1.getThoiGianLanDau();
                            long t2=x1.getThoiGianLanCuoi();
                            if(x1.getSoLan()>3&&(t2-t1)/x1.getSoLan()<100000){
                                x1.setFlag_sec(false);
                                 response.sendRedirect("boc_lich.jsp");
                                 flag_sec=false;
                                 new Thread(new Runnable() {
                                     @Override
                                     public void run() {
                                         try {
                                             Thread.sleep(60000);
                                             al.remove(x1);
                                         }catch (Exception e){
                                             System.out.println("loi thread");
                                     }
                                         
                                     }
                                 }).start();
                                 break;
                            }
                        }
                    }
                    if(flag_sec==true){
                        chong_brute_force a=new chong_brute_force(Email, 1,System.currentTimeMillis(), System.currentTimeMillis(),true);
                        al.add(a);
                        response.sendRedirect("login.jsp");
                    }
            }
            }
            }
            

        } else if (action.equals("res")) {
            String Username = request.getParameter("Username");
            String Email = request.getParameter("Email");
            String Password = request.getParameter("Password");
            String ConfirmPassword = request.getParameter("Confirm Password");
            
            if (taiKhoan.DangKi(Username, Email, Password, ConfirmPassword, "khachHang")) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("registered.jsp");
            }
        } else if (action.equals("logout")) {
               HttpSession session= request.getSession();
                if(session.getAttribute("KH")!=null){
                                 
                session.setMaxInactiveInterval(0);
                response.sendRedirect("index.jsp");
                }else{
                     response.sendRedirect("index.jsp");
                }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
