public class ExerciseEleven {

}
class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
    public static void main(String[] args){
        AllTheColorsOfTheRainbow atcotr = new AllTheColorsOfTheRainbow();
        atcotr.changeTheHueOfTheColor(1);
        System.out.println(atcotr.anIntegerRepresentingColors);

    }
}