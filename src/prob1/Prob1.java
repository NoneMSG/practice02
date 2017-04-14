//package prob1;
//import java.util.*;
//public class Prob1 {
//	static int one=1, five=5, ten=10, ften=50, onehd=100, fivehd=500, oneth=1000,fiveth=5000, tenth=10000, fiftyth=50000;
//	public static void main(String[] args) {
//		
//		System.out.print("금액 입력: ");
//		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//			
//		cal(money,0);
//		
//	}
//	static void cal(int money, int change){
//		int leftmny = money-change;
//		if(leftmny>=fiftyth){
//			int num = leftmny/fiftyth;
//			leftmny = leftmny % fiftyth;
//			System.out.println("5만원:" +num);
//		}
//		if(leftmny>=tenth){
//			int num = leftmny/tenth;
//			leftmny = leftmny % tenth;
//			
//			System.out.println("1만원:" +num);
//		}
//		if(leftmny>=fiveth){
//			int num = leftmny/fiveth;
//			leftmny = leftmny % fiveth;
//			System.out.println("5천원:" +num);
//		}
//		if(leftmny>=oneth){
//			int num = leftmny/oneth;
//			leftmny = leftmny % oneth;
//			System.out.println("천원:" +num);
//		}
//		if(leftmny>=fivehd){
//			int num = leftmny/fivehd;
//			leftmny = leftmny % fivehd;
//			System.out.println("오백원:" +num);
//		}
//		if(leftmny>=onehd){
//			int num = leftmny/onehd;
//			leftmny -= leftmny % onehd;
//			System.out.println("백원 :" +num);
//		}
//		if(leftmny>=ften){
//			int num = leftmny/ften;
//			leftmny = leftmny % ften;
//			System.out.println("오십원:" +num);
//		}
//		if(leftmny>=ten){
//			int num = leftmny/ten;
//			leftmny = leftmny % ten;
//			System.out.println("십원:" +num);
//		}
//		if(leftmny>=five){
//			int num = leftmny/five;
//			leftmny = leftmny % five;
//			System.out.println("오원:" +num);
//		}
//		if(leftmny>=one){
//			int num = leftmny/one;
//			leftmny = leftmny % one;
//			System.out.println("일원:" +num);
//		}
//	}
//}
////int fifthousand = money / 50000 ;
////money -= 50000*fifthousand;
////
////int onethousand = money / 10000 ;
////money -= 10000*onethousand;
////
////int fityhund = money / 5000;
////money -= 5000*fityhund;
////
////int tenehund = money / 1000;
////money -= 1000*tenehund;
////
////int fiveh = money / 500;
////money -=500*fiveh;
////
////int oneh = money / 100;
////money -=100*oneh;
////
////int fifty = money / 50;
////money -=500*fifty;