public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        if(str1.toString().equals(str)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
//        for(int i=0; i<=str.length(); i++){
//
//        }
    }
}
