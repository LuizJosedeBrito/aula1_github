package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int n1=sc.nextInt();
			sc.nextLine(); //consome quebra de linha anterior
			String name=sc.nextLine();
			//char gender=sc.next().charAt(0);
			
			System.out.println(n1);
			System.out.println(name);
			
			sc.close();

	}

}
