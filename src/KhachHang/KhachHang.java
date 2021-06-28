package KhachHang;
//Comparable trong java được sử dụng để sắp xếp các đối tượng của lớp do người dùng định nghĩa
public class KhachHang implements Comparable<KhachHang> {
	private int MaKH, Tuoi;
	private String TenKH,Diachi,SDT;
	public KhachHang(int maKH, String tenKH, int Tuoi, String diachi, String sDT) {
		super();
		this.MaKH = maKH;
		this.TenKH = tenKH;
		this.Diachi = diachi;
		this.SDT = sDT;
		this.Tuoi = Tuoi;
	}
	public int getMaKH() {
		return MaKH;
	}
	@Override
	public String toString() {
		return "Mã khách hàng: " + MaKH + ", Tên khách hàng: " + TenKH + ", Tuổi: " + Tuoi + ", Địa chỉ: " + Diachi + ", SDT: " + SDT;
	}
	//cài đặt tiêu chí để so sánh trong phương thức compareTo() để so sánh các đối tượng  với nhau,
	@Override
	public int compareTo(KhachHang o) {
		if (getMaKH() < o.getMaKH()) return 1; 
		else if(getMaKH() > o.getMaKH()) return -1;
		else return 0;
	}
}
