public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }
    public static void main(String[] args){
        Storage sto = new Storage();
        int s = sto.storage("lpl");
        System.out.println(s);
    }
}
