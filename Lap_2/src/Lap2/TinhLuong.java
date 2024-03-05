package Lap2;

import java.util.Scanner;

public class TinhLuong {
	private String TenNV;
	private float Luong;
	private final float LUONG_THUONG =2000;
	private final float KPI=0.1f; 
	private final float LUONG_MOT_NGAY=500;
	private int NgayLamViec;
	private float DoanhThu;
	Scanner sc=new Scanner(System.in);
	public String getTen() {
		return TenNV;
	}
	public void setTen(String ten) {
		TenNV=ten;
	}
	public double getNgayLam() {
		return NgayLamViec;
	}
	public void setNgayLam(int ngaylam) {
		NgayLamViec=ngaylam;
	}
	
	
	public float getDoanhThu() {
		return DoanhThu;
	}
	public void setDoanhThu(float doanhthu) {
		DoanhThu=doanhthu;
	}
	float tinhluong() {
		return NgayLamViec*LUONG_MOT_NGAY;
	}
	float tinhluong(float LUONG_THUONG,float KPI) {
		
		if(DoanhThu==0) {
			Luong=tinhluong()-KPI*tinhluong();
			return Luong;}
		else  { if(DoanhThu>15000) {
			Luong=tinhluong()+KPI*DoanhThu+LUONG_THUONG;
			return Luong;
		}
		else Luong =tinhluong()+KPI*DoanhThu;
		return Luong;
	}	
			
		
	}
}
	
	
	
	

	

	 
	
		
	

