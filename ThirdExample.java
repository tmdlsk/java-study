public class ThirdExample {
    static boolean test1(int val){
        System.out.println("test1("+val+")");
        System.out.println("result:"+(val<1));
        return val<1;
    }
    static boolean test2(int val){
        System.out.println("test2("+val+")");
        System.out.println("result:"+(val>2));
        return val>2;
    }
    static boolean test3(int val){
        System.out.println("test3("+val+")");
        System.out.println("result:"+(val>0));
        return val>0;
    }
    public static void main(String[] args){
        boolean a = test1(0) && test2(1) && test3(1);
        System.out.println(a);
    }
}
