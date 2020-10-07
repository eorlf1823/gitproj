import java.util.Scanner;


public class ex6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		
		System.out.print("정수를 10개  입력하세요.\n");
		
		
		for(int i=0;i<10;i++){
			int n=s.nextInt();
			if(n<=0){
				continue;
			}
			sum=sum+n;
		}
		System.out.printf("양수의 합은 :%d",sum);
		

	}

}
