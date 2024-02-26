import java.util.Arrays;
import java.util.Scanner;

public class SortString
{
    public static void main(String[] args) 
    {
    	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("Sort Strings");
	System.out.println("26/02/2024");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) 
        {
            System.out.println(str);
        }

        scanner.close();
    }
}

