/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.gioHangDao;
import ConnectToDataBase.hoaDonDao;
import Model.gioHang_sp;
import Model.hoaDon;
import Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "thanhToanHang", urlPatterns = {"/thanhToanHang"})
public class thanhToanHang extends HttpServlet {

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
        HttpSession session=request.getSession();
        hoaDonDao hoaDonDao1=new hoaDonDao();
     String action=request.getParameter("action");
     if(action.equals("thanhToan")){
         String tenNguoiNhan=request.getParameter("TenNguoiNhan");
         String diaChi=request.getParameter("diaChi");
         String ThoiGianNhan=request.getParameter("ThoiGianNhan");
         String soDT=request.getParameter("SODT");
         //loc xss,csrf
         diaChi=diaChi.replaceAll("<|>|Script|/", "");
         if(session.getAttribute("gioHang")!=null){

             ArrayList<gioHang_sp> list=(ArrayList<gioHang_sp>)session.getAttribute("gioHang");
             String maSP1="";
             String tenSp1="";
             int tongTien=0;
             for(gioHang_sp y:list){
                 maSP1+=y.getMa()+" ";
                 tenSp1+=y.getTen()+" ";
                 tongTien+=Integer.parseInt(y.getGiaMoi());
             }
             hoaDon x=new hoaDon(list.get(0).getEmail(), tenNguoiNhan, diaChi.toString(), ThoiGianNhan, soDT, maSP1, tenSp1, String.valueOf(tongTien));
             hoaDonDao1.add(x);
             new gioHangDao().removeGioHangTheoEmail(list.get(0).getEmail());
             session.setAttribute("gioHang", null);
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
