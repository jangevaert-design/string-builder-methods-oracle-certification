package edu.cnm.deepdive;

public class StringBuilderMethods {

  public static void main(String[] args) {
    //charAt(), indexOf(), length(),substring.
    StringBuilder sb = new StringBuilder("programming");
    String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
    int len = sb.length();
    char ch = sb.charAt(5);
    System.out.println(sub);//prints "gram".
    System.out.println(len);//prints 11
    System.out.println(ch);//prints a

    //append
    StringBuilder b = new StringBuilder().append(1).append("L");
    b.append("-").append(true);
    System.out.println("\n" + b);//prints 1L-true

    //insert
    StringBuilder builder = new StringBuilder("programming");
    builder.insert(7, "-");
    builder.insert(2, 2);
    System.out.println(builder);//prints pr2ogram-ming

    //delete
    builder.delete(4, 9);
    System.out.println(builder);//prints pr2oming. Starting to delete and index 4 and excluded index 9.
    builder.deleteCharAt(2);
    System.out.println(builder);//prints proming.

    //builder.delete(2, 1);//gives a StringIndexOutOfBoundsException
    builder.delete(1, 1);//String will stay the same since you don't delete anything.

    //reverse
    StringBuilder sb1 = new StringBuilder("ABC123");
    sb1.reverse();
    System.out.println(sb1);//prints 321CBA

    //toString()
    String myString = sb1.toString();
    System.out.println(myString);//prints 321CBA
  }
}
