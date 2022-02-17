import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= 8; i++) {
            String s = in.next();
            if (isPalindrome(s)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not palindrome");
            }
            System.out.println();
        }
    }

    public static String reverseString(String s){ //Меняет местами символы строки
        char[] c = s.toCharArray();
        int n=s.length();
            for(int i = 0; i <= (n/2)-1; i++)
            {
                char t = c[n - 1 - i];
                c[n - 1 - i] = c[i];
                c[i] = t;
            }
            String s1 = new String(c);
            return s1;

    }

    public static boolean isPalindrome(String s){ //Проверяет, является ли строка палиндромом
        String s1 = reverseString(s);
        return s1.equals(s);
    }
}
