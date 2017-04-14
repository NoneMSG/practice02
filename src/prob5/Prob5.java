package prob5;
import java.util.*;

public class Prob5 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int rnum = r.nextInt(100)+1;
		//int rnum=5;
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		int count=1;
		int min = 1;
		int max = 100;
		
		while(flag){
		System.out.print("숫자입력 :");
		int input = sc.nextInt();
		

		if(rnum==input){
			System.out.println("맞았습니다. 다시하실건가요?");
			String answer=sc.next();
			if(answer.equals("y") ){
				count=0;
				min = 1;
				max = 100;
				return ;
				
			}else if(answer.equals("n")){
				flag=false;
			}
		}else if(rnum < input){
			System.out.println(min+ "-" +max);
			System.out.println(count+">>"+input);
			System.out.println("더낮게");
			max = input;
			count++;
		}else if(rnum > input){
			System.out.println(min+"-"+max);
			System.out.println(count+">>"+input);
			System.out.println("더높게");
			min = input;
			count++;
		}
	
		}
	}

}