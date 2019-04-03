 public class ABC {
 public static void main(String[] args) {
 int [] x = {0,0,0,0};
 int c = 0;
 for(int i = 0; i < 4; i++) x[0] = i;
 for(int i = 0; i < 4; ++i) x[1] = i;
 c = 0; while(c++ < 3) x[2] = c;
 c = 0; do { x[3] = c; } while(++c < 4);
 for(int i: x) System.out.print(i + " ");
 }
 } 