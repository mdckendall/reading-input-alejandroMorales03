import java.util.*;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    System.out.println("Enter a word: ");
    Scanner in = new Scanner(System.in);
    String word;
    word = in.nextLine();
    System.out.println(word.length());
  }
}
