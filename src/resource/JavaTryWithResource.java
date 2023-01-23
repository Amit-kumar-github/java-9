package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class JavaTryWithResource {

	public static void main(String[] args) throws IOException {
		InputStream inputStream=new FileInputStream("D:\\sts 14\\java 9\\src\\test.txt");
		Scanner scanner=new Scanner(inputStream);
		try(inputStream;scanner) {
			
			while(scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
	}
}
