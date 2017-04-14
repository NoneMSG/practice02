package prob5;
import java.util.*;

public class Prob5 {

	public static void main(String[] args) {
		int count=0;
		Random r = new Random();
		
		//int rnum = r.nextInt(100)+1;
		int rnum=5;
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag){
		System.out.print("숫자입력 :");
		int input = sc.nextInt();
		
		if(rnum==input){
			System.out.println("맞았습니다. 다시하실건가요?");
			String answer=sc.next();
			if(answer.equals("y") ){
				flag=false;
			}
		}else if(rnum < input){
			System.out.println(input+"-"+100);
			System.out.println(count+">>"+input);
			System.out.println("틀렸습니다. 더낮게");
			count++;
		}else if(rnum > input){
			System.out.println(input+"-"+100);
			System.out.println(count+">>"+input);
			System.out.println("틀렸습니다. 더높게");
			count++;
		}
	
		}
	}

}