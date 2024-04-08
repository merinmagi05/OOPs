public class StringManipulator
{
	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("Search an element");
    	private String inputString;
    	public StringManipulator(String inputString)
    	{
        	this.inputString = inputString;
    	}
    	public String reverseString()
    	{
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) 
        {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
}


public String toUpperCase() {
        return inputString.toUpperCase();
    }
    public String toLowerCase() 
    {
        return inputString.toLowerCase();
    }

    public int countOccurrences(char character) 
    {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) 
        {
            if (inputString.charAt(i) == character) 
            {
                count++;
            }
        }
        return count;
    }

    public String replaceSubstring(String oldSubstring, String newSubstring) {
        return inputString.replaceAll(oldSubstring, newSubstring);
    }

    // Method to check if the input string is a palindrome
    public boolean isPalindrome() {
        String reversed = reverseString();
        return inputString.equalsIgnoreCase(reversed);
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
    public static void main(String[] args) 
    {
        StringManipulator manipulator = new StringManipulator("Hello, World!");

        System.out.println("Original string: " + manipulator.getInputString());
        System.out.println("Reversed string: " + manipulator.reverseString());
        System.out.println("Uppercase string: " + manipulator.toUpperCase());
        System.out.println("Lowercase string: " + manipulator.toLowerCase());
        System.out.println("Occurrences of 'l': " + manipulator.countOccurrences('l'));
        System.out.println("Replace 'Hello' with 'Hi': " + manipulator.replaceSubstring("Hello", "Hi"));
        System.out.println("Is palindrome: " + manipulator.isPalindrome());
    }
}

