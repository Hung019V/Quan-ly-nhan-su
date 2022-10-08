/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vy746
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> arr = new ArrayList<>();
    
    public DanhSachNhanVien(){
        arr.add(new NhanVienBanHang(100,"Ban Hang","NV01","Vy01","03/05/2021",3.0));
        arr.add(new NhanVienBanHang(70,"Ban Hang","NV02","Vy02","15/07/2021",2.0));
        arr.add(new NhanVienQuanLy("Quan ly NS",5.0,"Quan Ly","NV03","Vy03","20/01/2020",5.0));
        arr.add(new NhanVienQuanLy("Giam Doc",7.0,"Quan Ly","NV04","Vy04","10/08/2020",7.0));
    }

    public boolean themVaoDanhSach(NhanVien nv) {
        return arr.add(nv);
    }

    public ArrayList<NhanVien> layDSNV() {
        return arr;
    }

    public NhanVien timNVTheoMaNV(String maNV) {
        for (NhanVien nv : arr) {
            if (nv.getMaNV().equalsIgnoreCase(maNV.trim())) {
                return nv;
            }
        }
        return null;
    }

    public boolean xoaNVTheoMaNV(String maNV) {
        for (NhanVien nv : arr) {
            if (nv.getMaNV().equalsIgnoreCase(maNV.trim())) {
                arr.remove(nv);
                return true;
            }
        }
        return false;
    }

    public int timNVBanHangNhieuNhat() {
        int maxValue = 0;
        for (NhanVien nv : arr) {
            if (nv instanceof NhanVienBanHang) {
                NhanVienBanHang nvbh = (NhanVienBanHang) nv;
                if (nvbh.getSoSanPhamBan() > maxValue) {
                    maxValue = nvbh.getSoSanPhamBan();
                }
            }
        }
        return maxValue;
    }

    public ArrayList<NhanVien> layDSNVBanHangNhieuNhat() {
        ArrayList<NhanVien> dsMoi = new ArrayList<>();
        for (NhanVien nv : arr) {
            if (nv instanceof NhanVienBanHang) {
                NhanVienBanHang nvbh = (NhanVienBanHang) nv;
                if (nvbh.getSoSanPhamBan() == timNVBanHangNhieuNhat()) {
                    dsMoi.add(nv);
                }
            }
        }
        return dsMoi;
    }
}
