import java.io.IOException;
//import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
public class FileInputOutput {

	public static void main(String[] args) throws IOException{
		Scanner fin = new Scanner(Path.of("C:\\Users\\Dinara\\Dropbox\\Мой ПК (Lenovo-PC)\\Desktop\\ChernovikEclipse.txt"), StandardCharsets.UTF_8);
		while(fin.hasNextLine())
		System.out.println(fin.nextLine());
		fin.close();
		
		
		/*PrintWriter fout = new PrintWriter(("C:\\Users\\Dinara\\Dropbox\\Мой ПК (Lenovo-PC)\\Desktop\\myFile2.txt"), StandardCharsets.UTF_8);
		fout.write("Hello, Welcome to Dinara's World");
		fout.close();*/
	}

}
