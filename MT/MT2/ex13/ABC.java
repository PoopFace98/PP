import java.util.*;

public class ABC {
	public static void main(String[] args) {
	List x = new ArrayList();
	x.add(2);
	List y = new ABC().m1(x);
	y.add(3);
	System.out.println(x);
	}
	public List m1(List z){
	z.add(4);
	return z;
	}
} 
