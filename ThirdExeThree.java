import java.util.*;
public class ThirdExeThree {
    public static void main(String[] args){
        Random rand = new Random();
        int v,s,t;
        s = rand.nextInt(100);
        t = rand.nextInt(100)+1;
        v = s/t;
        System.out.println(s);
        System.out.println(t);
        System.out.println(v);
    }
}
