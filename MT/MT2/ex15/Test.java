public class Test {
 int y=2;
 static int z=3;
 public static void main(String args[])
 {
 Test t = new Test();
 ABC v = new ABC();
 Test t1 = new Test();
 t.m1(v,t1);
 System.out.println(t.z + " " + t.y);
 }
 public void m1(ABC v, Test t1) {
 t1.z=v.x;
 t1.y=5;
 }
} 
