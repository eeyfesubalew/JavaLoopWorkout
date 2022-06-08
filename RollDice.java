public class RollDice {
    public static void main(String[] args) {
        int dice1 = randomNumber();
        int dice2 = randomNumber();

        System.out.println("Dice 1: "+dice1);
        System.out.println("Dice 2: "+dice2);

        while(dice1!=dice2){
             dice1 = randomNumber();
             dice2 = randomNumber();

             System.out.println("Dice 1: "+dice1);
             System.out.println("Dice 2: "+dice2+"\n");
        }
        System.out.println("You rolled double!");
    }
    public static int randomNumber(){
        int num = (int)(Math.random()*5)+1;
        return num;
    }
}
