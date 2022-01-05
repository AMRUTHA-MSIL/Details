import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
public class GroceryList //declares a name for the class
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader userInput = new BufferedReader
                (new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);//allows for input

        ArrayList<String> myArr = new ArrayList<String>();//declares the ArrayList to be a String
        myArr.add("Milk");
        myArr.add("Cheese");
        myArr.add("Eggs");
        myArr.add("Bread"); //the values of the ArrayList already entered

        while(true)
        {
            do
            {
                System.out.println("Enter the items for the grocery list: ");
                String item = in.next();//asks and allows for input
                myArr.add(item);
            }
            while(myArr.equals(""));
            System.out.print("The Grocery List "+ myArr);
            break;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input to remove from Array List: ");
        String input = scanner.nextLine();
        myArr.remove(input);
        System.out.println("array after deleting item is"+myArr);
    }
}


