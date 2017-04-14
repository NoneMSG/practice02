//package prob4;
//
//import java.util.Scanner;
//
//public class Prob4 {
//
//	public static void main(String[] args) {
//		char[] c1 = reverse("Hello World");
//		printCharArray(c1);
//
//		char[] c2 = reverse("Java Programming");
//		printCharArray(c2);
//
//
//	}
//	
//	public static char[] reverse(String str) {
//		char[] nstr = new char[str.length()] ;
//		String n1="";
//		for(int i = str.length()-1 ; i >= 0 ; --i){
//			n1 += str.charAt(i);
//		}
//		for(int i = 0 ; i < str.length(); ++i){
//			nstr[i]=n1.charAt(i);
//		}
//		return nstr;
//	}
//
//	public static void printCharArray(char[] array){
//		/* 코드를 완성합니다 */
//		for(int i = 0 ; i< array.length; ++i){
//			System.out.print(array[i]);
//		}System.out.println();
//	}
//}
