//  Написать метод который принимает string и печатает является ли число палиндромом.
package Lesson2;

public class Palindrome {
    public static void main(String[] args) {
        String word = "nisponanomimatamimonanopsin";
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String someWord) {
        char[] arrChars = someWord.toCharArray();
        for (int i = 0; i < arrChars.length / 2; i++) {
            if (arrChars[i] != arrChars[arrChars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
