
import  java.util.*;

public class remStack {
    public static void main(String[] args) {
    	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("15/04/2024");
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position : ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}
