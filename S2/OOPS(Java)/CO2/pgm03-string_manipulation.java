public class Strings
{
    public static void main(String[] args)
    {   
        String text="Object Oriented Programming";
        System.out.println("Original Text: "+text);
        System.out.println("\nThe given text is empty -> "+text.isEmpty());
        System.out.println("\nLength of the given text: "+text.length());
        System.out.println("\nTo Uppercase: "+text.toUpperCase());
        System.out.println("\nTo Lowercase: "+text.toLowerCase());
        System.out.println("\nSubstring: "+text.substring(7));
        System.out.println("\nSubsequence: "+text.subSequence(7,15));
        System.out.println("\nReplace O ewith $: "+text.replace('O','$'));
        System.out.println("\nReplace all text with 'Java Lab': "+text.replaceAll(text,"Java Lab"));
        System.out.println("\nReplace first word: "+text.replaceFirst("Object","Java"));
        System.out.println("\nCharacter at index 8: "+text.charAt(8));
        int ascii=text.charAt(8);
        System.out.println("ASCII value of character at index 8: " + ascii);
    }
}