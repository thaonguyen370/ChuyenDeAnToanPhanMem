/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectToDataBase.sanPhamDao;
import Model.sanPham;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author thao
 */
@WebServlet(name = "uploadSP", urlPatterns = {"/uploadSP"})
@MultipartConfig(maxFileSize = 16177215)
public class uploadSP extends HttpServlet {

    String chuoi = "";
    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "anh";

    // upload settings
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String tenSanPham = "";
        String loaiSP = "";
        String giaCu = "";
        String giaMoi = "";
        String kichThuoc = "";
        String mauSac = "";
        String anhTruoc = "";
        String anhSau = "";
        String ngaySanXuat = "";
        String ngayHetHan = "";
        String hangSX = "";
        String gioiTinhNam = "";
        String gioiTinhNu = "";
        String gioiTinhKhac = "";
        String soLuong = "";
        // checks if the request actually contains upload file

        if (!ServletFileUpload.isMultipartContent(request)) {
            // if not, we stop here
            PrintWriter writer = response.getWriter();
            writer.println("Error: Form must has enctype=multipart/form-data.");
            writer.flush();
            return;
        }

        // configures upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // sets memory threshold - beyond which files are stored in disk 
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // sets temporary location to store files
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);

        // sets maximum size of upload file
        upload.setFileSizeMax(MAX_FILE_SIZE);

        // sets maximum size of request (include file + form data)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // constructs the directory path to store upload file
        // this path is relative to application's directory
//        String uploadPath = getServletContext().getRealPath("")
//                + File.separator + UPLOAD_DIRECTORY;
        String uploadPath = "C:\\Users\\thao\\Desktop\\webThoiTrang\\web\\images";

        // creates the directory if it does not exist
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {
            // parses the request's content to extract file data
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);
            //String zz=request.getParameter("title");

            if (formItems != null && formItems.size() > 0) {

                // iterates over form's fields
                for (FileItem item : formItems) {
                    // processes only fields that are not form fields
                    if (item.getFieldName().equals("tenSP")) {
                        tenSanPham = item.getString();
                    }
                    if (item.getFieldName().equals("loaiSP")) {
                        loaiSP = item.getString();
                    }
                    if (item.getFieldName().equals("giaCu")) {
                        giaCu = item.getString();
                    }
                    if (item.getFieldName().equals("giaMoi")) {
                        giaMoi = item.getString();
                    }
                    if (item.getFieldName().equals("kichThuoc")) {
                        kichThuoc = item.getString();
                    }
                    if (item.getFieldName().equals("mauSac")) {
                        mauSac = item.getString();
                    }
                    if (item.getFieldName().equals("anhTruoc")) {
                        Calendar calendar = Calendar.getInstance();

                        String[] fileName1 = new File(item.getName()).getName().split("\\.");
                        String fileName = fileName1[0] + String.valueOf(calendar.getTimeInMillis()) + "truoc.jpg";
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);

                        // saves the file on disk
                        item.write(storeFile);
                        request.setAttribute("message",
                                "Upload has been done successfully >>" + UPLOAD_DIRECTORY + "/" + fileName);
                        anhTruoc = "images/"+fileName;

                    }
                    if (item.getFieldName().equals("anhsau")) {
                        Calendar calendar = Calendar.getInstance();

                        String[] fileName1 = new File(item.getName()).getName().split("\\.");
                        String fileName = fileName1[0] + String.valueOf(calendar.getTimeInMillis()) + "sau" + ".jpg";
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);

                        // saves the file on disk
                        item.write(storeFile);
                        request.setAttribute("message",
                                "Upload has been done successfully >>" + UPLOAD_DIRECTORY + "/" + fileName);
                        anhSau = "images/"+fileName;

                    }
                    if (item.getFieldName().equals("ngaySX")) {
                        ngaySanXuat = item.getString();
                    }
                    if (item.getFieldName().equals("ngayHetHan")) {
                        ngayHetHan = item.getString();
                    }
                    if (item.getFieldName().equals("hangSX")) {
                        hangSX = item.getString();
                    }
                    if (item.getFieldName().equals("nam")) {
                        gioiTinhNam = item.getString();
                    }
                    if (item.getFieldName().equals("nu")) {
                        gioiTinhNu = item.getString();
                    }
                    if (item.getFieldName().equals("khac")) {
                        gioiTinhKhac = item.getString();
                    }
                    if (item.getFieldName().equals("soLuong")) {
                        soLuong = item.getString();
                    }

                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "There was an error: " + ex.getMessage());
        }
        int x=0;
        try {
            x=Integer.parseInt(soLuong);
        } catch (Exception e) {
            x=0;
        }
      
        if(x>0&&anhSau.length()>0&&anhTruoc.length()>0&&tenSanPham.length()>0){
            for(int i=0;i<x;i++){
        sanPham sp=new sanPham("", tenSanPham, loaiSP, giaCu, giaMoi, kichThuoc, mauSac, anhTruoc, anhSau, ngaySanXuat, hangSX, gioiTinhNu, "");
        sanPhamDao abc=new sanPhamDao();
        abc.themSP(sp);
            }

        response.sendRedirect("admin/tabel_sp.jsp");
        }else{
             response.sendRedirect("admin/form_themSP.jsp");
        }


    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
