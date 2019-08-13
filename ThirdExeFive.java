import java.util.*;
class Coins{
    int num;
}
public class ThirdExeFive {
    public static void main(String[] args){
        Random rand = new Random();
        Coins coins = new Coins();
        coins.num = rand.nextInt(2);
        if (coins.num==0){
            System.out.println("正面");
        }
        else{
            System.out.println("背面");
        }
    }
}
