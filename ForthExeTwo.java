public class ForthExeTwo {
    public static void main(String[] args){
        int i;
        int num[] = new int[25];
        for(i=1;i<25;i++)
            num[i] = (int)(Math.random()*100);
        for (int j=0;j<num.length-1;j++)
            if (num[j] < num[j+1])
                System.out.println("xiao");
            else if (num[j] > num[j+1])
                System.out.println("dayu");
            else
                System.out.println("dengyu");
    }
}
