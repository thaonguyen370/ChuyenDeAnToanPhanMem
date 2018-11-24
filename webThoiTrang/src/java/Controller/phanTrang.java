/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.sanPhamDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thao
 */
@WebServlet(name = "phanTrang", urlPatterns = {"/phanTrang"})
public class phanTrang extends HttpServlet {

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

        String pageid=request.getParameter("pageid");
          sanPhamDao x = new sanPhamDao();          
            int l = x.DS_SP().size();  
            int pages;
            if (l < 8) {
                pages = 1;
            } else {
                pages = l / 8;
                if (l % 8 != 0) {
                    pages += 1;
                }
            }
            int id=1;
            try {
             id=Integer.parseInt(pageid);
        } catch (Exception e) {
            id=1;
        }
            
           
            if(id<=pages){
              
                 RequestDispatcher dispatcher=request.getRequestDispatcher("products1.jsp");
                 request.setAttribute("DSHienThi",x.DS_hienThi(id, 8));
                 if((id+1)>pages){
                     request.setAttribute("next",id);
               
                 }else{
                 request.setAttribute("next",id+1);
                 
                 }
                 if((id-1)<1){
                       request.setAttribute("previous",id);
                 }else{
                     request.setAttribute("previous",id-1);
                 }
                
                 dispatcher.forward(request, response);
              //   response.sendRedirect("products1.jsp");
            }else{
                 response.sendRedirect("products1.jsp");
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
