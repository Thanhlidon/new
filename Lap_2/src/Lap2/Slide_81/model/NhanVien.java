package model;

public class NhanVien {
	protected String ten;
	protected long luong;
	public NhanVien() {
		
	}
	public NhanVien(String ten) {
		this.ten=ten;
	}
	protected String loaiNhanVien(){
		return" ";
	}
	public void xuatThongTin() {
		System.out.print("Ten nhan vien: "+ten+"\n"+"Loai nhan vien: "+loaiNhanVien()+"\n"+"Luong: "+luong);
	}
}
