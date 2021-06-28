package HangHoa;

public class IOS extends HangHoa {
	static final String tenHH = "IOS";
	public IOS(int maHH, int soluong, String phienbanHH,double dongianhap, double dongiaban, String tenHH) {
		super(maHH, soluong, tenHH,phienbanHH, dongianhap, dongiaban);
	}
	static class Inner {
		public void inAn() {
			System.out.println("SmartPhone");
		}
	}
}
