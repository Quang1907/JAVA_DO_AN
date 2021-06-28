package NhanVien;
//thừa kế
public class NhanVien_IT extends NhanVien{
	public NhanVien_IT(int maNV, String tenNV, String cMND, String sDT, String diachi, String ngaySinh) {
		super(maNV, tenNV, cMND, sDT, diachi, ngaySinh);
	}
	static class Inner {
		public void inAn() {
			System.out.println("Nhan vien IT");
		}
	}
}
