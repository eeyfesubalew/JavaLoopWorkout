public class BottleOfBeer {
    public static void main(String[] args) {
        sing();
    }

    public static void sing() {
        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall," + i + " bottles of beer! take one down, pass it around" + (i - 1) + ", bottles of beer on the wall!");
        }
        
    }
}
