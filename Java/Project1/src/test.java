import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        //Basic:
        /*System.out.println("\"Hello, World!\"");
        System.out.println("Nice to meet you!");*/

        /* */

        //Taking inputs:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=sc.nextLine();
        System.out.println("What is your age? ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favourite food? ");
        String food=sc.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your favourite food is: "+food);
        sc.close();*/

        /* */

        //Math ops:
        /*double x=10;
        double y=33.33;
        double z=Math.sqrt(x);
        System.out.println(z);*/

        /* */

        //Random numbers:
        /*Random r=new Random();
        int x=r.nextInt(6)+1; //range from 0 to (5+1)
        System.out.println(x);*/

        /* */

        //Arrays:
        /*String[][] cars=new String[3][3];
        cars[0][0]="#1";
        cars[2][1]="#3";
        System.out.println(cars[2][1]);*/

        /* */

        //String methods:
        /*String name="Bro";
        //boolean res=name.equals("Bro"); //checks if equal
        //int res=name.length(); //length of string
        //char res=name.charAt(1); //returns character at that index
        //int res=name.indexOf("B"); //returns index of the character
        //boolean res=name.isEmpty(); //returns if string empty or not
        //String res=name.toUpperCase(); //converts to uppercase
        //String res=name.toLowerCase(); //converts to lowercase
        //String res=name.trim(); //removes all of the empty space
        //String res=name.replace('o','a'); //replaces old char with a new char
        System.out.println(res);*/

        /* */

        //Wrapper classes: provides a way to use primitive data types as reference data types
                        // refernce data types contain useful methods
        /*Boolean a=true;
        Character b='@';
        Integer c=123;
        Double d=3.14;*/

        /* */

        //ArrayList: a resizable array [only stores reference data types]
        /*ArrayList<String> food= new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.set(0,"hotdog");
        food.remove(1);
        food.clear();
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }*/

        //2D ArrayList:
        /*ArrayList<ArrayList<String>> gList=new ArrayList();

        ArrayList<String> bkList=new ArrayList();
        bkList.add("Pasta");
        bkList.add("Garlic bread");
        bkList.add("Donuts");

        ArrayList<String> prList=new ArrayList();
        prList.add("Tomatoes");
        prList.add("Cucumber");
        prList.add("Peppers");

        ArrayList<String> drList=new ArrayList();
        drList.add("Soda");
        drList.add("Coffee");

        gList.add(bkList);
        gList.add(prList);
        gList.add(drList);

        System.out.println(gList.get(0).get(1));*/

        /* */

        //printf: to control and display text to the console window
        /*boolean myBool=true;
        char myChar='@';
        String myS="Bro";
        int myInt=50;
        double myDouble=1000;
        System.out.printf("%b\n",myBool);
        System.out.printf("%.2f\n",myDouble); //precision
        System.out.printf("Hello %10s\n",myS); //width
        System.out.printf("%+20f",myDouble); //flags*/

        /* */

        //final keyword: value cannot be changed when declared
        /*final int PI=3145;*/

        /* */

        //Object Oriented Programming: 

        //Objects: refer to file_name- Car.java
        /*Car myCar1=new Car();
        Car myCar2=new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        myCar1.drive();
        myCar1.brake();*/


        //Constructors: refer to file_name- Human.java
        /*Human human1=new Human("Rick",65,70);
        Human human2=new Human("Morty",16,50);

        System.out.println(human2.name);
        human1.eat();*/


        //Variable scope: refer to file_name- DiceRoller.java


        //Overloaded constructors: refer to file_name- Pizza.java
        /*Pizza pizza=new Pizza("thicc crust","tomato","mozzerella","peperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);*/


        //toString() method: refer to file_name- Car.java
                        //Returns a string that "textually represents" an object
       /*Car car=new Car();
        System.out.println(car.toString());*/
        
        
        //Array of objects:
        



        

        





    }
}
