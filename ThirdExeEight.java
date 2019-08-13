public class ThirdExeEight {
    public static void main(String[] args) {
        final int constant1 = 0xaaaaaaaa;
        final int constant2 = 0x55555555;
        int i = 0;
        System.out.println(Integer.toBinaryString(constant1));
        System.out.println(Integer.toBinaryString(constant2));

        System.out.println("~constant1 = " + ~constant1);
        System.out.println("~constant2 = " + ~constant2);
        System.out.println("constant1 & constant2 = " + Integer.toBinaryString(constant1 & constant2));
        System.out.println("constant1 | constant2 = " + Integer.toBinaryString(constant1 | constant2));
        System.out.println("constant1 ^ constant2 = " + Integer.toBinaryString(constant1 ^ constant2));
        i = constant1;
        i &= constant2;
        System.out.println("i &= constant2 : " + Integer.toBinaryString(i));
        i = constant1;
        i |= constant2;
        System.out.println("i |= constant2 : " + Integer.toBinaryString(i));
        i = constant1;
        i ^= constant2;
        System.out.println("i ^= constant2 : " + Integer.toBinaryString(i));
    }
}
