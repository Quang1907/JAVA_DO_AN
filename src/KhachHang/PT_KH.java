package KhachHang;

import java.util.*;

//kế thừa interface Infomation
//sd LinkedList
public class PT_KH implements Infomation {
	Scanner sc = new Scanner(System.in);
	public void khoiTao(LinkedList<KhachHang> KH) {
		KH.add(new KhachHang(1,"Le Van Quang",23 ,"Huong Chu", "0708050907"));
		KH.add(new KhachHang(5,"Nguyen Hoang Long",14 ,"Huong An", "0933877521"));
		KH.add(new KhachHang(3,"Le Quang Hai",18 ,"Huong Toan", "0356550781"));
		KH.add(new KhachHang(2,"Tran Thi Hong",26 ,"Huong Tra", "0372643522"));
		KH.add(new KhachHang(4,"Ha Van Phong",35,  "Huong Xuan", "0112345612"));
	}
	public void print(LinkedList<KhachHang> KH) {
		for (KhachHang khachHang : KH) {
			System.out.println(khachHang);
		}
	}
	public void Sort(LinkedList<KhachHang> KH) {
		Collections.sort(KH, Collections.reverseOrder());
		print(KH);
	}
	public void deleteKH(LinkedList<KhachHang> KH, int k) {
		KH.removeIf(KhachHang -> KhachHang.getMaKH()  == k);
		print(KH);
	}
	public void finKH(LinkedList<KhachHang> KH, int k) {
		for (KhachHang khachHang : KH) {
			if(khachHang.getMaKH() == k) {
				System.out.println(khachHang.toString());
			}
		}
	}
	public void KhachHang(LinkedList<KhachHang> KH) {
		khoiTao(KH);
		while(true) {
			System.out.println("                         DANH MỤC KHÁCH HÀNG                               ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  1 - Xem thông tin khách hàng   |   2 - Sắp xếp danh sách khách hàng      ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  3 - Xóa thông tin khách hang   |   4 - Tìm khách hàng                    ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  5 - Nhấn phím bất kỳ để trở về |                                         ");
			System.out.println("___________________________________________________________________________");
			System.out.println("\nChọn chức năng cần thực hiện :");
			int i = sc.nextInt();
			if(i == 1 ) {
				System.out.println("Hiển thị thông tin khách hàng: ");
				print(KH);
			}else if(i == 2) {
				System.out.println("Danh sách sắp xếp tăng dần theo mã khách hàng: ");
				Sort(KH);
			}else if(i == 3) {
				System.out.println("Nhập mã khách hàng cần xóa: ");
				int n = sc.nextInt();
				System.out.println("Danh sách khách hàng sau khi xóa: ");	
				deleteKH(KH, n);
			}else if(i == 4) {
				System.out.println("Nhập mã khách hàng cần tìm: ");
				int c = sc.nextInt();
				System.out.println("Hiển thị khách hàng: ");
				finKH(KH, c);
			}else break;
		}
	}

}