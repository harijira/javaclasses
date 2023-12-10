import java.util.Scanner;

public class class_3 {
    public static void main(String[] args) {
        // not finished
        String str1="madam";
        StringBuilder obj=new StringBuilder(str1);
        obj.reverse();
        System.out.println(obj);
        String str2=obj.toString();
        System.out.println(str1);
        if (str1.equals(str2)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
