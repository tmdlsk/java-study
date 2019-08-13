class Dog{
    String name;
    String says;
}
public class ThirdExeFour {
    public static void main(String[] args){
        Dog dogone = new Dog();
        Dog dogtwo = new Dog();
        dogone.name = "spot";
        dogone.says = "Ruff!";
        dogtwo.name = "scruffy";
        dogtwo.says = "Wurf!";
        System.out.println("first dog's name is " +dogone.name);
    }
}
