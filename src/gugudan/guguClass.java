package gugudan;
import java.util.Scanner;

public class guguClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(2~9)");
		int guguNum = Integer.parseInt(scanner.nextLine());
		System.out.println("--------- " + guguNum + "단 ---------");
		
		for (int i=0; i<=9; i++) {
			int resultNum = guguNum * i;
			System.out.println(guguNum + " * " + i + " = " + resultNum);
		}
		
		System.out.println("------------------------------");
			
	}

}
