public class TryCatch {
	public static void main(String[] args) {
		int x = 0;
		try {
		x = Integer.parseInt("Динара");
		System.out.println(x);
	}
		catch(NumberFormatException e) {
			System.out.println("Не удалось преобразовать строку в число.");
		}
	}
}
