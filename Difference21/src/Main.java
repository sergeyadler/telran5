
public class Main {

	public static void main(String[] args) {
		System.out.println(diff21(22));
		System.out.println(diff21(1));
		System.out.println(diff21(0));
	}

	public static int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}
}
