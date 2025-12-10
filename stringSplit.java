import java.io.*;
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		String [] op = UserMainCode.splitString(s,ch);
		Arrays.stream(op).forEach(x->System.out.println(x));
	}
}
class UserMainCode {
	public static String [] splitString (String s,char ch){
		String [] inparr = s.split(""+ch);
		String [] op = new String[inparr.length];
		int i=0;
		for(String str : inparr){
			/*StringBuilder sb = new StringBuilder(s);
			sb = sb.reverse();
			String s1 = sb.toString();
			op[i++] = s1.toLowerCase();*/
			op[i++] = new StringBuilder(str).reverse().toString().toLowerCase();
		}
		return op;
	}
}