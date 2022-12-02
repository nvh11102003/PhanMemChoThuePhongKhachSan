
package com.mycompany.viewModels;


public class ChiTietPhongViewModel {
    private String maPhong;
    private String moTa;
    private String thongTin;
    private float giaPhong;
    private int soKhachToiDa;
    private String anh1;
    private  String anh2;

    public ChiTietPhongViewModel() {
    }

    public ChiTietPhongViewModel(String maPhong, String moTa, String thongTin, float giaPhong, int soKhachToiDa, String anh1, String anh2) {
        this.maPhong = maPhong;
        this.moTa = moTa;
        this.thongTin = thongTin;
        this.giaPhong = giaPhong;
        this.soKhachToiDa = soKhachToiDa;
        this.anh1 = anh1;
        this.anh2 = anh2;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoKhachToiDa() {
        return soKhachToiDa;
    }

    public void setSoKhachToiDa(int soKhachToiDa) {
        this.soKhachToiDa = soKhachToiDa;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }
    
    
}
