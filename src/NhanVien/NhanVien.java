package NhanVien;
//Cloneable copy nội dung
public class NhanVien implements Cloneable{
	 int maNV;
	 String TenNV, CMND,SDT,Diachi,NgaySinh;
	public NhanVien(int maNV, String tenNV, String cMND, String sDT, String diachi, String ngaySinh) {
		super();
		this.maNV = maNV;
		this.TenNV = tenNV;
		this.CMND = cMND;
		this.SDT = sDT;
		this.Diachi = diachi;
		this.NgaySinh = ngaySinh;
	}
	public int getMaNV() {
		return maNV;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public void inNV() {
		System.out.println("Mã Nhân viên: " + maNV + ", Tên Nhân viên: " + TenNV + ", CMND: " + CMND + ", SDT: " + SDT + ", Địa chỉ: " + Diachi
				+ ", Ngày sinh: " + NgaySinh);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
