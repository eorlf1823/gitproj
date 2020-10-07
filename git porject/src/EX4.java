import java.util.Scanner;


public class EX4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;
		int sum=0;
		int num=0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.:");
	
		while(true){
			num=s.nextInt();
			if(num==-1){
				break;
				
			}
			sum=sum+num;
			i++;
			
		
	}
		System.out.printf("정수의 개수는 %d개이며,합은 %d이고 평균은 %.2f입니다.",i,sum,(double)sum/i);
}
}
