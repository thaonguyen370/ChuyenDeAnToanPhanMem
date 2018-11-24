/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.gioHangDao;
import ConnectToDataBase.sanPhamDao;
import Model.gioHang_sp;
import Model.sanPham;
import Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jboss.weld.servlet.SessionHolder;

/**
 *
 * @author thao
 */
@WebServlet(name = "gioHang", urlPatterns = {"/gioHang"})
public class gioHang extends HttpServlet {

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
        String maHang = request.getParameter("maHang");
        String tenHang = request.getParameter("tenHang");
        String maXoa = request.getParameter("maXoa");
        String emailXoa = request.getParameter("emailXoa");
        String ghiChuXoa=request.getParameter("ghiChuXoa");

        ArrayList<gioHang_sp> ListGioHang;
        PrintWriter out = response.getWriter();

        sanPhamDao x = new sanPhamDao();
        gioHangDao y = new gioHangDao();
        HttpSession session = request.getSession();
 
        if (session.getAttribute("KH") != null) {
                   user user = (user) session.getAttribute("KH");
        ListGioHang = y.list(user.getEmail());
            if (tenHang != null) {
                
                ArrayList<sanPham> DS = x.DS_SP();
                //them vao gio hang
                for (sanPham s : DS) {
                    if (s.getMa().equals(maHang)) {
                        Calendar calendar = Calendar.getInstance();
                        gioHang_sp ss = new gioHang_sp(user.getEmail(), String.valueOf(calendar.getTime()), s.getMa(), s.getTen(), s.getLoai(), s.getGiaCu(), s.getGiaMoi(), s.getSize(), s.getMau(), s.getAnhTruoc(), s.getAnhSau(), s.getNgaySanXuat(), s.getHangSX(), s.getGioiTinh(), String.valueOf(calendar.getTimeInMillis()));
                        ListGioHang.add(ss);
                        y.add(ss);
                        break;
                    }
                }
                session.setAttribute("gioHang", ListGioHang);
                RequestDispatcher dispatcher = request.getRequestDispatcher("products1.jsp");

                dispatcher.forward(request, response);
            }
            if(maXoa!=null&&emailXoa!=null){
                ListGioHang.clear();
                
                if(y.remove(maXoa,emailXoa,ghiChuXoa)){
                    ListGioHang = y.list(user.getEmail());
                    session.setAttribute("gioHang", ListGioHang);
                RequestDispatcher dispatcher = request.getRequestDispatcher("checkout.jsp");

                dispatcher.forward(request, response);
                }
               
            }else{
                 response.sendRedirect("index.jsp");
            }

        } else {
            response.sendRedirect("login.jsp");
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
