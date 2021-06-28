package NhanVien;

import java.util.*;

public class PT_NV {
	 Scanner sc = new Scanner(System.in);
	private   List<NhanVien> NV = new ArrayList<>();
	//sử dụng mảng
	public PT_NV(NhanVien arr[]) {
		for (int i = 0; i < arr.length; i++) {
			NV.add(arr[i]);
		}
	}
	public void inAn() {
		for (NhanVien nhanVien : NV) {
			nhanVien.inNV();
		}
		// local inner class
		NhanVien_IT.Inner inner = new NhanVien_IT.Inner();
		inner.inAn();
	}
	public void edit(int k) {
		for (NhanVien nhanVien : NV) {
			if(nhanVien.getMaNV() == k) {
				System.out.println("Nhập địa chỉ muốn thay thế: ");
				String n = sc.nextLine();
				nhanVien.setDiachi(n);
			}
		}
		inAn();
	}

}