

import java.util.Scanner;
public class PhoneNumberDirectory {

    public static void main(String[] args) {
        final int SET_VALUES = 30;
        Scanner keyboard = new Scanner(System.in);
        String newName, names = "";
        String phoneNums = null;
        int count = 0;
        String choice;
        String QUIT = "732";
        String [] nameList = {"Marshall", "Denise", "Charles", "Clarisa", "Donny",
                "Albert", "Abigail", "Quin", "Kathy", "Doris"};

        String [] phoneNumbers  = {"(724)-132-1434", "(234)-453-3422", "(675)-346-4344", "(445)-765-2536",
                "(828)-349-2535", "(454)-245-3545", "(343)-344-5120", "(470)343-1342", "(232) 211-1343",
                "(444) 045-1324" };
        System.out.println("Directions: ");
        System.out.print("1.) To retrieve a number, enter the first name of the individual, ");
        System.out.println(" and we will attempt to locate the number in our records.");
        System.out.println("2.) Otherwise, enter 732 any time to quit. " );
        System.out.println("3.) If the name for which is searched does not output a corresponding number, ");
        System.out.println("it has not been added to the directory. Enter 232 to add.");

        while(!names.equals(QUIT) && count < SET_VALUES)
        {   names = keyboard.nextLine();
            if(names.equals(SET_VALUES)){
                nameList[count]= names;
                nameList[count] = QUIT;
            }

            else if(names.equals("232")) {


                System.out.println("We did not find this name in our records.");
                System.out.println("To add, specify the name and number of the individual");
                System.out.println("Enter the number 232 to input the information.");
                System.out.println("Please enter 732 to exit the name addition process");
                System.out.println("Enter name & Number");
                names = keyboard.nextLine();
                System.out.println(names);
                nameList[count] = names;
                System.out.println("Number:");
                phoneNums = keyboard.nextLine();
                phoneNumbers[count] = phoneNums;
                System.out.println(" The name " + nameList[count]+ " with the number " +
                        phoneNumbers[count] + " has been added. " );

                count++;
            }
            count++;
            if (names.equals(QUIT))
                names = QUIT;
        }

        displayContent(nameList, phoneNumbers, count);


    }

    public static void displayContent(String nameArray[], String phoneArray[], int counter){

        for(int x = 0 ; x < counter-1 ; x++)
            System.out.println("  Name: " +  " " + nameArray[x] + " / Phone: " +
                    phoneArray[x]);

    }
}
