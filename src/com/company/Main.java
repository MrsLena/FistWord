package com.company;
import java.util.Scanner;

public class Main {

  /*  public static void MyFunc(String StrDannih) {

        int dlstroki = StrDannih.length();
        String rez = "";

        for (int i=1; i<=dlstroki; i++) {

            String tt = StrDannih.charAt(i);

            if (tt == " ") {
                break;
            }
            else {
                rez = rez + tt;
            }
        }

        System.out.print(rez);
    }

*/
  public static String ZamenaSym(String str,String sym1,String sym2) {

      //принимает строку и два символа. В результате он возвращает заданную строку, где каждый первый символ был заменен вторым символом
      //если встречаем первый символ то заменяем его вторым

      int KvoS = str.length();
      String NewStr = "";

      for (int i=0; i<KvoS; i++) {

          char TekSym = str.charAt(i);
          char Tek1 = sym1.charAt(0);
          if (TekSym == Tek1) {
              NewStr = NewStr + sym2;
          }
          else {
              NewStr = NewStr + TekSym;
          }

      }


      return NewStr;
  }


    public static void main(String[] args) {
       //   MyFunc("hello world");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = sc.next();
        System.out.println("Введите первый символ:");
        String sym1 = sc.next();
        System.out.println("Введите второй символ:");
        String sym2 = sc.next();

        String Rez = ZamenaSym(str,sym1,sym2);

        System.out.println("Результат замены:");
        System.out.println(Rez);

    }

}