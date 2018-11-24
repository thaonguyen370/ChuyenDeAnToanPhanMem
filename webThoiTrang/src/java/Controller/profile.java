/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.connection;
import static Model.Ddos.x;
import Model.chong_brute_force;
import Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author thao
 */
@WebServlet(name = "profile", urlPatterns = {"/profile"})
public class profile extends HttpServlet {
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
          boolean v=x.isFlag_sec();
        String action = request.getParameter("action");
        //va loi sqlinjection
       //action=action.replaceAll("or|and|--|#", "");
        HttpSession session = request.getSession();
        String xx=session.getId();
        response.setContentType("text/html;charset=UTF-8");
        //chong broken access control
       user action1=(user) session.getAttribute("KH");
      action=action1.getEmail();
        PrintWriter out = response.getWriter();
      
        boolean kk=true;
        if(v!=true){
            out.println("<div>May bạn đang bi lợi dụng tấn công ddos!</br></div>");
            kk=false;
        }
                
        if (!action.equals("khong co")&&kk==true) {

            try {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Thông tin cá nhân</title>");
                out.println("</head>");
                out.println("<body>");
                out.print("<div>" +action+"</div>");
                connection x = new connection();
                Statement st = x.statement();
                //           ResultSet res = st.executeQuery("SELECT * FROM user");
                ResultSet res = st.executeQuery("SELECT email, password FROM user WHERE email='" + action + " ' AND quyen='KhachHang'");
                out.println("<h1>Thông tin tài khoản</h1>");
                out.println("==========================================================");
                while (res.next()) {
                    String mail = res.getString("email");
                    String pass = res.getString("password");
                    out.println("<h1>Email: " + mail + "</h1>");
                    out.println("<h1>pass: " + pass + "</h1>");
                     out.println("<h1>session id: " + xx + "</h1>");
                  
                    out.println("==========================================================");

                }

                out.println("</body>");
                out.println("</html>");
            } catch (SQLException ex) {
                out.print("loi");
                //Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(v==true) {
            out.print("Bạn phải đăng nhập để xem thông tin!");
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
