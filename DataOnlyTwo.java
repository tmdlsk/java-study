public class DataOnlyTwo {
    int i;
    double d;
    boolean b;
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 1;
        data.d = 2.0;
        data.b = true;
        System.out.println(data.b);
        System.out.println(data.d);
        System.out.println(data.i);
    }
}
