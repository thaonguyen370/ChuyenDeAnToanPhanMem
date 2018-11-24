/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author thao
 */
public class chong_brute_force {
    private String user;
    private int SoLan;
    private long thoiGianLanDau;
    private long thoiGianLanCuoi;
    private boolean flag_sec;
    public chong_brute_force() {
    }

    public chong_brute_force(String user, int SoLan, long thoiGianLanDau, long thoiGianLanCuoi, boolean flag_sec) {
        this.user = user;
        this.SoLan = SoLan;
        this.thoiGianLanDau = thoiGianLanDau;
        this.thoiGianLanCuoi = thoiGianLanCuoi;
        this.flag_sec = flag_sec;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getSoLan() {
        return SoLan;
    }

    public void setSoLan(int SoLan) {
        this.SoLan = SoLan;
    }

    public long getThoiGianLanDau() {
        return thoiGianLanDau;
    }

    public void setThoiGianLanDau(long thoiGianLanDau) {
        this.thoiGianLanDau = thoiGianLanDau;
    }

    public long getThoiGianLanCuoi() {
        return thoiGianLanCuoi;
    }

    public void setThoiGianLanCuoi(long thoiGianLanCuoi) {
        this.thoiGianLanCuoi = thoiGianLanCuoi;
    }

    public boolean isFlag_sec() {
        return flag_sec;
    }

    public void setFlag_sec(boolean flag_sec) {
        this.flag_sec = flag_sec;
    }

    
    
}
