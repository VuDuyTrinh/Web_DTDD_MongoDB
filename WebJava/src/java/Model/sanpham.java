/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SUALAPTOP24h.NET
 */
public class sanpham {

    private String maid;
    private int id;
    private String tenloai;

    public String getMaid() {
        return maid;
    }

    public void setMaid(String maid) {
        this.maid = maid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    public sanpham(String maid, int id, String tenloai) {
        this.maid = maid;
        this.id = id;
        this.tenloai = tenloai;
    }

    public sanpham() {
    }
   

}
