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
public class NhanVienBanHang extends NhanVien{
    private int soSanPhamBan;

    public NhanVienBanHang() {
    }

    public NhanVienBanHang(int soSanPhamBan, String loaiNV, String maNV, String tenNV, String ngayVaoLam, double HSL) {
        super(loaiNV, maNV, tenNV, ngayVaoLam, HSL);
        this.soSanPhamBan = soSanPhamBan;
    }

    public int getSoSanPhamBan() {
        return soSanPhamBan;
    }

    public void setSoSanPhamBan(int soSanPhamBan) {
        this.soSanPhamBan = soSanPhamBan;
    }

    @Override
    public double tinhLuongThucNhan() {
        if (soSanPhamBan > 100) {
            return HSL * 1150 + 1000;
        } else if (50 <= soSanPhamBan && soSanPhamBan <= 100) {
            return HSL * 1150 + 500;
        } else {
            return HSL * 1150 + 0;
        }
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +super.toString()+ "soSanPhamBan=" + soSanPhamBan + '}';
    }
    public Object[] toArray()
    {
        return new Object[]{loaiNV,maNV,tenNV,ngayVaoLam,HSL,soSanPhamBan,null,null,tinhLuongThucNhan()};
    }
}
