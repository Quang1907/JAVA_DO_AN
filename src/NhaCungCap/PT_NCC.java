package NhaCungCap;
import java.io.*;
import java.util.*;
//Serializable
//Exceptions
public class PT_NCC extends Infomation {	
	public void readFileNCC(List<NhaCungCap> NCC)  {
		try {
			//Tạo đối tượng luồng và liên kết nguồn dữ liệu
			FileInputStream fis = new FileInputStream("NhaCungCap.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// Đọc dữ liệu 
			String strLine = null;
			while ((strLine = br.readLine()) != null) {
				if(strLine.indexOf("#") == 0) {
					String MaNCC = strLine.substring(1, strLine.length());
					String TenNCC = br.readLine();
					NhaCungCap NCC1 = new NhaCungCap(MaNCC, TenNCC);
					NCC.add(NCC1);
				}
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Không tìm thấy file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void print(List<NhaCungCap> NCC) {
		for (NhaCungCap nhaCungCap : NCC) {
			System.out.println("Hiển thị thông tin: ");
			System.out.println(nhaCungCap);
		}
	}
	
	//ghi dữ liệu vào file
	public void create(List<NhaCungCap> NCC) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		File file;
		try {
			file = new File("NhaCungCap.txt");
			fos = new FileOutputStream(file, true);
			//nếu k có file thì sẽ tạo 1 file mới 
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("Thêm thông tin Nhà cung cấp ");
			System.out.println("Nhập số lượng nhà cung cấp cần thêm :");
			int n=sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Nhập mã NCC: ");
				String MaNCC = "\n#" +  sc.next();
				System.out.println("Nhập tên NCC: ");
				String TenNCC = "\n" + sc.next();
				byte[] byteMa = MaNCC.getBytes();
				byte[] byteTen = TenNCC.getBytes();
				//ghi dl
				fos.write(byteMa);
				fos.write(byteTen);
			}
			//Xả những gì được lưu trong bộ đệm. (Flush là đổ data vào stream mà ko đóng nó lại.) 
			fos.flush();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				if (fos != null)fos.close();
				System.out.println("Ghi thành công");
			} 
			catch (Exception ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}
	public void nhacungcap(List<NhaCungCap> NCC) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("                         DANH MỤC NHÀ CUNG CẤP                             ");
			System.out.println("___________________________________________________________________________");
			System.out.println("  1 - Xem danh sách nhà cung cấp |            2 - Thêm nhà cung cấp        ");
			System.out.println("___________________________________________________________________________");
			System.out.println("		    Nhấn số bất kỳ để thoát              ");
			System.out.println("\nChọn chức năng cần thực hiện :");
			int i = sc.nextInt();
			if (i == 1) {
				readFileNCC(NCC);
				print(NCC);
			} else if(i==2){
				create(NCC);
			}else break;
		}
	}
}
