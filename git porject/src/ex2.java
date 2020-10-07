import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num;
		System.out.print("학점을 입력하세요.(A~D,F):");
		num=s.next();
		if(num.equals("A")){
			System.out.println("참 잘하셨습니다.");
		}else if(num.equals("B")){
				System.out.println("참 잘하셨습니다.");
		}else if(num.equals("C")){
			System.out.println("좀 더 노력하세요.");
		}else if(num.equals("D")){
			System.out.println("좀 더 노력하세요.");
		}else if(num.equals("F")){
			System.out.println("다음 학기에 다시 수강하세요.");
		}else{
			System.out.println("잚못된 학점입니다.");
}
	}
}
