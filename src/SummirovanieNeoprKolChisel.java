import java.util.Scanner;
public class SummirovanieNeoprKolChisel {
	public static void main(String[] args) {
		int x = 0, result = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число 0 для получения результата\n");
		for( ; ; ) {
			System.out.print("Введите число: ");
			x = in.nextInt();
			if(x==0) break;
			result+=x;
			in.close();}
		System.out.println("Сумма чисел равна: " + result);
	}
}
