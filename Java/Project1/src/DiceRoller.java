import java.util.Random;
public class DiceRoller{
    Random random; //declared globally
    int number;
    DiceRoller(){
        Random random=new Random();
        int number=0;
        roll();
    }
    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}
