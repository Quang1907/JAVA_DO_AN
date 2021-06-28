package HangHoa;
public class HangHoa{
	String tenHH , phienbanHH;
	int soluong, maHH;
	double dongianhap, dongiaban;
	public HangHoa(int maHH, int soluong, String tenHH,String phienbanHH, double dongianhap, double dongiaban) {
		this.maHH = maHH;
		this.soluong = soluong;
		this.tenHH = tenHH;
		this.phienbanHH=phienbanHH;
		this.dongianhap = dongianhap;
		this.dongiaban = dongiaban;
	}
	public int getMaHH() {
		return maHH;
	}
	public double getDongiaban() {
		return dongiaban;
	}
	public void setDongianhap(double dongianhap) {
		this.dongianhap = dongianhap;
	}
	public void setDongiaban(double dongiaban) {
		this.dongiaban = dongiaban;
	}
	@Override
	public String toString() {
		return "Mã hàng hóa : " + maHH + ", Số lượng : " + soluong + ", Phiên bản : " + phienbanHH + ", Giá nhập vào : " + dongianhap
				+ ", Giá bán ra : " + dongiaban + ", Tên hãng: " + tenHH;
	}

}
