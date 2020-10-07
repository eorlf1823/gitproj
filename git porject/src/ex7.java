import java.util.Scanner;


public class ex7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num;
		while(true){
			System.out.print("exit를 입력하면 종료합니다.");
			num=s.next();
			if(num.equals("exit")){
				break;
			}
			
		}System.out.println(num);

	}

}
