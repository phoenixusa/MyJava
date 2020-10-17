import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int os = 0;
		System.out.print("Какой ОС вы полльзуетесь?\n\n"
				+"1 - Windows XP\n"
				+ "2 - Windows 8\n"
				+ "3 - Linux\n"
				+ "4 - MacOS\n"
				+ "Введите число соответствующее ответу: ");
		os = in.nextInt();
		switch(os) {
		case 1:
			System.out.println("Вы выбрали Windows XP");
			break;
		case 2:
			System.out.println("Вы выбрали Windows 8");
			break;
		case 3:
			System.out.println("Вы выбрали Linux");
			break;
		case 4:
			System.out.println("Вы выбрали Macintosh");
			break;
		default:
			System.out.println("Вы ничего не выбрали");
		}
		in.close();
	}

}
