public class MutipleRoll {
    public static void main(String[] args) {
        int roll = (int)(Math.random()*6)+1;
        int points=0;
        while(roll!=6){
            if(roll==4){
                System.out.println("No points keep rolling");
                roll = (int)(Math.random()*6)+1;
                continue;
            }
            System.out.println("You rolled "+roll +" got one point keep rolling");
            points++;
            roll = (int)(Math.random()*6)+1;
        }
        System.out.println("You rolled "+roll);
        if(points>3){
            System.out.println("You are lucky you won!");
        }else{
            System.out.println("You loose!");
        }
    }
}
