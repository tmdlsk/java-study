class Console {
    float a ;
}
//别名现象
public class ThirdExeTwo {
    public static void main(String[] args){
        Console c1 = new Console();
        Console c2 = new Console();
        c1.a = 2.3f;
        c2.a = 1.2f;
        System.out.println(c1.a);
        System.out.println(c2.a);
        c1 = c2;
        System.out.println(c1.a);
        System.out.println(c2.a);
        c1.a = 3.1f;
        System.out.println(c1.a);
        System.out.println(c2.a);
    }
}
