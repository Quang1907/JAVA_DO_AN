package advance.dev;
import java.io.*;
import java.util.*;
import HangHoa.*;
import KhachHang.*;
import NhaCungCap.*;
import NhanVien.*;

public class Management {

	public static void Hanghoa(List<HangHoa> HH) {
		PT_HH hanghoa = new PT_HH();
		hanghoa.HangHoa(HH);
	}
	public static void Nhacungcap(List<NhaCungCap> NCC) throws IOException {
		PT_NCC nhacungcap = new PT_NCC();
		nhacungcap.nhacungcap(NCC);
	}
	public static void Khachhang(LinkedList<KhachHang> KH) {
		PT_KH khachhang = new PT_KH();
		khachhang.KhachHang(KH);
	}
	public static void Nhanvien(List<PT_NV> NV) {
		Scanner sc = new Scanner(System.in);
		NhanVien[] nv = new NhanVien[5];
		nv[0] = new NhanVien(11, "Quang", "123123", null, "Hue", "19/07/1998");
		nv[1] = new NhanVien(33, "Hoang", "456456", null, "Da Nang", "26/03/1992");
		nv[2] = new NhanVien(44, "Hai", "789789", null, "Quang Nam", "06/06/2006");
		nv[3] = new NhanVien(22, "Hung", "456123", null, "Quang Ngai", "1998");
		nv[4] = new NhanVien(55, "Hoa", "789456", null, "Ha Noi", "20/02/2002");
		PT_NV nhanvien = new PT_NV(nv);
		NV.add(nhanvien);
		while(true) {
			System.out.println("                         DANH MỤC NHÂN VIÊN                                ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  1 - Xem danh sách nhân viên |            2 - Copy danh sach nhan vien    ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  3 - Chỉnh sửa thông tin NV  |            4 - Nhấn số bất kỳ để thoát     ");
			System.out.println("\nChọn chức năng cần thực hiện :");
			int n = sc.nextInt();
			if(n == 1) {
				nhanvien.inAn();
			}else if(n == 2) {
				System.out.println("Copy danh sach nhan vien: ");
				NhanVien[] nv1 = nv.clone();
				PT_NV nhanvien1 = new PT_NV(nv1);
				NV.add(nhanvien1);
				nhanvien1.inAn();
			}else if(n == 3) {
				System.out.println("Nhan ma nhan vien muon sua: ");
				int i = sc.nextInt();
				nhanvien.edit(i);
			}else break;
		}
		
	
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<NhaCungCap> NCC = new ArrayList<>();
		List<HangHoa> HH = new ArrayList<>();
		LinkedList<KhachHang> KH = new LinkedList<>();
		List<PT_NV> NV = new ArrayList<>();
		while(true) {
			System.out.println("\n                    CHƯƠNG TRÌNH QUẢN LÝ BÁN HÀNG                        ");
			System.out.println("___________________________________________________________________________");
			System.out.println("            1 - Hàng hóa         |            2 - Nhà cung cấp             ");
			System.out.println("___________________________________________________________________________");
			System.out.println("            3 - Khách hàng       |            4 - Nhân viên                ");
			System.out.println("___________________________________________________________________________");
			System.out.println("            5 - Exit             |                                         ");
			System.out.println("\nVui lòng chọn mục cần thao tác : ");
			int n = sc.nextInt();
			if (n == 1 ) {
				Hanghoa(HH);
			} else if(n == 2){
				Nhacungcap(NCC);
			}else if(n == 3){
				Khachhang(KH);
			}else if(n == 4){
				Nhanvien(NV);
			}else if(n == 5) {
				System.out.println("Đã đóng chương trình");
				break;
			}
		}
	}
}
