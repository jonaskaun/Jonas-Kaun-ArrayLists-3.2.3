import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rotCreature = new ArrayList<String>();
        rotCreature.add("Tun Tun Tun Sahur");
        rotCreature.add("Bombini Goosini");
        rotCreature.add("Tralalero Tralala");
        rotCreature.add("Bombardiro Crocodilo");
        rotCreature.add("Cappuccino Assassino");
        rotCreature.add("Chimpanzini Bananini");
        int indexTemp;
        int t = 0;
        int maxIndex;
        String input;
        boolean quit = false;
        while(quit == false){
            maxIndex = rotCreature.size();
            System.out.println(rotCreature);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit? :::  Index values begin at 0");
            input = sc.nextLine();
            if (input.equals("a")){
                System.out.println("What would you like to add?");
                input = sc.nextLine();
                rotCreature.add(input);
            }
            else if (input.equals("i")){
                System.out.println("\nWhat would you like to insert?");
                input = sc.nextLine();
                System.out.println("At what index would you like to insert it?");
                indexTemp = sc.nextInt();
                if (indexTemp<= maxIndex){
                    rotCreature.set(indexTemp,input);
                }
                else{
                    System.out.println("\ninvalid index\n");
                }

            }
            else if (input.equals("r")){
                System.out.println("\nRemove by (v)alue, or (i)ndex");
                input = sc.nextLine();
                if (input.equals("v")){
                    System.out.println("Which value do you want to remove?");
                    input = sc.nextLine();
                    rotCreature.remove(input);

                }
                else if (input.equals("i")){
                    System.out.println("Which index would you like to remove?");
                    indexTemp = sc.nextInt();
                    if(indexTemp<= maxIndex){
                        rotCreature.remove(indexTemp);
                    }

                }
                else{
                    System.out.println("invalid input");
                }

            }
            else if (input.equals("p")){
                System.out.println("What value would you like to repace?");
                input = sc.nextLine();
                indexTemp =rotCreature.indexOf(input);
                rotCreature.remove(indexTemp);
                System.out.println("What would you like to replace it with?");
                input = sc.nextLine();
                rotCreature.add(indexTemp, input);


            }
            else if (input.equals("q")){
                quit = true;
            }
            else{
                System.out.println("invalid input");
            }


            t++;
        }
        System.out.print("\nYour final list is:");
        System.out.print("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.print("\n"+rotCreature+"\n");
        System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.print("\nThanks for playing! :)");


        sc.close();
    }
    
}
