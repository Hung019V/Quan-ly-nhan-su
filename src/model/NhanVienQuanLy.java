/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author vy746
 */
public class NhanVienQuanLy extends NhanVien{
    private String chucVu;
    private double phuCapChucVu;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(String chucVu, double phuCapChucVu, String loaiNV, String maNV, String tenNV, String ngayVaoLam, double HSL) {
        super(loaiNV, maNV, tenNV, ngayVaoLam, HSL);
        this.chucVu = chucVu;
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public double tinhLuongThucNhan() {
        return HSL * 1150 + phuCapChucVu;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy{" +super.toString()+ "chucVu=" + chucVu + ", phuCapChucVu=" + phuCapChucVu + '}';
    }
    public Object[] toArray()
    {
        return new Object[]{loaiNV,maNV,tenNV,ngayVaoLam,HSL,null,chucVu,phuCapChucVu,tinhLuongThucNhan()};
    }
}
