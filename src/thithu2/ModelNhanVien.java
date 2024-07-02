/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu2;

/**
 *
 * @author ADMIN
 */
public class ModelNhanVien {
    private String maNV;
    private String matKhau;
    private String hoTen;
    private Boolean vaiTro;

    public ModelNhanVien() {
    }

    public ModelNhanVien(String maNV, String matKhau, String hoTen, Boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
          this.getMaNV(),this.matKhau,this.getHoTen(),this.vaiTro ? "Cán Bộ" : "Nhân Viên"
        };
    }
}
