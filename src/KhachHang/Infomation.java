package KhachHang;

import java.util.*;
//sử dụng Interface một kiểu dữ liệu tham chiếu trong Java,nó là tập hợp các phương thức abstract (trừu tượng)
//sử dụng LinkedList
public interface Infomation {
	public void khoiTao(LinkedList<KhachHang> KH);
	public void print(LinkedList<KhachHang> KH);
}
