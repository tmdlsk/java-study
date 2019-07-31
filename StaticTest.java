public class StaticTest {
    static int i = 0;
}
class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
    public static void main(String[] args){
        Incrementable inc = new Incrementable();
        inc.increment();
        System.out.println(StaticTest.i);
    }
}
