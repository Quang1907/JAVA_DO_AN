package HangHoa;
import java.util.*;
public class PT_HH {
	Scanner sc = new Scanner(System.in);	
	public void display(List<HangHoa> HH) {
		HangHoa sp1=new HangHoa(1, 2, "Android", "a12", 200000, 250000);
		HangHoa sp2=new HangHoa(2, 3, "IOS", "i12", 204000, 250000);
		HangHoa sp3=new HangHoa(3, 4, "Android", "a13", 505000, 650000);
		HangHoa sp4=new HangHoa(4, 5, "IOS", "i13", 690000, 730000);
		HangHoa sp5=new HangHoa(5, 3, "Android", "a14", 89000, 990000);
		HH.add(sp1);
		HH.add(sp2);
		HH.add(sp3);
		HH.add(sp4);
		HH.add(sp5);
	}
	public void create(List<HangHoa> HH) {
		System.out.println("Lựa chọn mặc hàng cần thêm :");
		System.out.println("1 - Android");
		System.out.println("2 - IOS");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Nhập số lượng hàng hóa cần thêm :");
			int m=sc.nextInt();
			for (int i = 0; i < m; i++) {
				System.out.println("Nhập mã hàng Android " + (i+1) + " :");
				int maHH = sc.nextInt();
				System.out.println("Nhập số lượng sản phẩm : ");
				int soluong = sc.nextInt();
				System.out.println("Phiên bản sản phẩm Android : ");
				String phienbanHH = sc.next();
				System.out.println("Giá nhập hàng vào : ");
				double dongianhap = sc.nextDouble();
				System.out.println("Giá bán hàng ra : ");
				double dongiaban = sc.nextDouble();
				HangHoa android = new Android(maHH, soluong, phienbanHH, dongianhap, dongiaban, Android.tenHH);
				HH.add(android);
			}
		} else if(n == 2){
			System.out.println("Nhập số lượng hàng hóa cần thêm :");
			int o=sc.nextInt();
			for (int i = 0; i < o; i++) {
				System.out.println("Nhập mã hàng IOS " + (i+1) + " :");
				int maHH = sc.nextInt();
				System.out.println("Nhập số lượng sản phẩm: ");
				int soluong = sc.nextInt();
				System.out.println("Phiên bản sản phẩm IOS : ");
				String phienbanHH = sc.next();
				System.out.println("Giá nhập hàng vào: ");
				double dongianhap = sc.nextDouble();
				System.out.println("Giá bán hàng ra: ");
				double dongiaban = sc.nextDouble();
				HangHoa ios = new IOS(maHH, soluong,phienbanHH, dongianhap, dongiaban, IOS.tenHH);
				HH.add(ios);
			}
		}
	}
	public void print(List<HangHoa> HH) {
		System.out.println("Hiển thị thông tin hàng hóa: ");
		Iterator<HangHoa> itr = HH.iterator();
		while (itr.hasNext()) {
			HangHoa hangHoa = (HangHoa) itr.next();
			System.out.println(hangHoa);
		}
	}
	public void edit(List<HangHoa> HH) {
		System.out.println("Sửa giá hàng hóa");
		System.out.println("Nhập mã sản phẩm muốn sửa ");
		int maHH = sc.nextInt();
		HangHoa a = null;
		for (int i = 0; i < HH.size(); i++) {
			a = HH.get(i);
			if(maHH == a.getMaHH()) {
				System.out.println("Sửa giá nhập hàng vào:  ");
				double gianhap = sc.nextDouble();
				System.out.println("Sửa giá bán hàng ra ");
				double giaban = sc.nextDouble();
				a.setDongianhap(gianhap);
				a.setDongiaban(giaban);
			}
		}
	}
	public void delete(List<HangHoa> HH) {
		System.out.println("Xóa hàng hóa");
		System.out.println("Nhập mã sản phẩm muốn xóa: ");
		int maHH = sc.nextInt();
		HH.removeIf(HangHoa -> HangHoa.getMaHH() == maHH);
	}
	public HangHoa finMax(List<HangHoa> HH) {
		System.out.println("Sản phẩm có giá lớn nhất : ");
		HangHoa max = null;
		for (HangHoa hangHoa : HH) {
			if (max == null) {
				max = hangHoa;
			} else if(max.getDongiaban() < hangHoa.getDongiaban()) {
				max = hangHoa;
			}
		}
		return max;
	}
	public void HangHoa(List<HangHoa> HH) {
		display(HH);
		while(true) {
			System.out.println("                         DANH MỤC HÀNG HÓA                                ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  1 - Hiển thị danh sách hàng hóa|            2 - Thêm mới một sản phẩm    ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  3 - Sửa sản phẩm               |            4 - Xóa sản phẩm             ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  5 - Tìm sản phẩm có giá trị Max|            6 - Số bất kỳ để trở về	   ");
			System.out.println("___________________________________________________________________________");
			System.out.println("Chọn chức năng cần thực hiện :");
			int n = sc.nextInt();
			if (n == 1 ) {
				print(HH);
			} else if(n == 2){
				create(HH);
				print(HH);
			}else if(n == 3){
				edit(HH);
				System.out.println("Danh sách sản phẩm sau khi sửa: ");
				print(HH);
			}else if(n == 4){
				delete(HH);
				System.out.println("Danh sách sản phẩm sau khi xóa : ");
				print(HH);	
			}else if(n == 5){
				System.out.println(finMax(HH));
			}else {
				break;
			}
		}
	}
}

