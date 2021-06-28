package NhaCungCap;

public class NhaCungCap {
	private String MaNCC;
	private String TenNCC;
	public NhaCungCap(String maNCC, String tenNCC) {
		MaNCC = maNCC;
		TenNCC = tenNCC;
	}
	@Override
	public String toString() {
		return "Ma nha cung cap: " + MaNCC + ", Ten hang: " + TenNCC;
	}
}
