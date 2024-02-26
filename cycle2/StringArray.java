import java.util.Scanner;

public class StringArray 
{
    public static void main(String[] args) 
    {
    	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("Search an element");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        String[] array = new String[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.print("Enter the string to search for: ");
        String target = scanner.nextLine();
        int foundIndex = -1;
        for (int i = 0; i < size; i++) 
        {
            if (array[i].equals(target)) 
            {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("String \"" + target + "\" found at position " + foundIndex + " in the array.");
        } else {
            System.out.println("String \"" + target + "\" not found in the array.");
        }

        scanner.close();
    }
}

