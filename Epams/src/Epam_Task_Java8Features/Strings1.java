
package Epam_Task_Java8Features;
import java.util.*;
import java.util.stream.Stream;
public class Strings1{
public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter String:");
	int n=ob.nextInt();
	String s[]=new String[n];
	System.out.println("Enter  the strngs: ");
	for(int j=0;j<n;j++) {
		s[j]=ob.next();
	}
	strings(s);
	
}

static void strings(String[] s) {
	Stream<String> st=Stream.of(s);
	System.out.println("strings starting: ");
	st.filter(p->p.startsWith("a")).filter(p->(p.length()==3)).peek(p->System.out.println(p)).count();
}
}