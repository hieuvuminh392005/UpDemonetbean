/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu2;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class RepositoriesNhanVien {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<ModelNhanVien> getAll(){
        sql ="select MaNV,HoTen,MatKhau,VaiTro from NhanVien";
        ArrayList<ModelNhanVien> list = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                String maNV;
                String matKhau;
                String hoTen;
                boolean vaiTro;
                maNV = rs.getString(1);
                matKhau = rs.getString(2);
                hoTen = rs.getString(3);
                vaiTro = rs.getBoolean(4); 
                ModelNhanVien nv = new ModelNhanVien(maNV, matKhau, hoTen, vaiTro);
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
