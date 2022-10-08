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
public class NhanVien implements INhanVien{
    protected String loaiNV, maNV, tenNV;
    protected String ngayVaoLam;
    protected double HSL;

    public NhanVien() {
    }

    public NhanVien(String loaiNV, String maNV, String tenNV, String ngayVaoLam, double HSL) {
        this.loaiNV = loaiNV;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngayVaoLam = ngayVaoLam;
        this.HSL = HSL;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }

    @Override
    public double tinhLuongThucNhan() {
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "loaiNV=" + loaiNV + ", maNV=" + maNV + ", tenNV=" + tenNV + ", ngayVaoLam=" + ngayVaoLam + ", HSL=" + HSL + '}';
    }
    public Object[] toArray()
    {
        return new Object[]{loaiNV,maNV,tenNV,ngayVaoLam,HSL};
    }
}
