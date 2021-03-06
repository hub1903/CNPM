package model;


import java.io.Serializable;

public class NCC implements Serializable{
	private int id;
	private String ten;
	private String diachi;
	private String sdt;
        
    public NCC() {
    }

    public NCC(int id, String ten, String diachi, String sdt) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public Object [] toObject(){
        return new Object[]{getId(), getTen(), getSdt(), getDiachi()};
    }
}

