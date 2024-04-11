package model;

import until.Configs;

public class NhanVienFullTime extends NhanVien {
	private int ngayLamThem,loaiChucVu;
	public NhanVienFullTime(String ten) {
		this.ten=ten;
	}
	public NhanVienFullTime(String ten,int ngayLamThem) {
		this.ten=ten;
		this.ngayLamThem=ngayLamThem;
	}
	public void setLoaiChucVu(int loaiChucVu ) {
		if(loaiChucVu==Configs.NHAN_VIEN_SEP) {
			this.loaiChucVu=loaiChucVu;
		}
		else 
			this.loaiChucVu=loaiChucVu;
		}
	 @Override
	public String loaiNhanVien() {
		if(loaiChucVu==Configs.NHAN_VIEN_SEP) {
			return "Sep";
		}
		else 
			return "NhanVien";
		
	
	}
	public void tinhLuong() {
		if(loaiChucVu==Configs.NHAN_VIEN_SEP) {
			luong= Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP+Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
		}else 
			luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH+Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
		
		
	}
}
