import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=0,sum=0;
		int n;
		System.out.print("정수를 입력하세요:");
		do{
			
			n=s.nextInt();
			if(n==-1){
				break;
			}
			sum=sum+n;
			num++;
		}while(true);
		System.out.printf("정수의  개수는 %d개이며,합은 %d,평균은 %.2f입니다.",num,sum,(double)sum/num);
	    
	}

}
