/**
 * hello
 */
public class hello {

  public static void main(String[] args) {
    String x = "Hello";
    System.out.println(x);
    String x1 = "Hello";
    System.out.println(x1);
    String x2 = "Hello";
    System.out.println(x2);
    int num1 = 10;
    num1 = 20;
    // final データ型　定数名　＝　初期値;
    final int num2 = 10;
    // num2 = 20; 定数は再代入できない。
    System.out.println(num2);
    System.out.println(num2);
    String str = "Hello";
    String name = "田中";
    int a = 10;
    int y = 20;
    int z = a + y;
    System.out.println(z);
    String s1 = "Hello";
    int num5 = s1.length();
    char c5 = s1.charAt(1);
    System.out.println(num5);
    System.out.println(c5);
    System.out.println(str);
    int a1 = str.length();
    System.out.println(a1);
    System.out.println(name);
    // 識別語:クラスやメソッドの名前をa~z,a~Z,$,_が1文字目にくる、識別子の2文字目以降は数字も使用可能、予約後は使用不可、大文字、小文字は厳密に区別される、文字数の制限はない。a
    // 予約後：すdねい使用されている名前のこと
    // 配列[]
    // 書き方はintの後ろか、idの前後に[]
    int[] id = new int[50];
    int id1[] = new int[50];
    int []id2 = new int[50];
    // 本来なら以下のように５０並べるのを、上のように一行でまとめる。
    // int id1;
    // int id2;
    // int id3;
    System.out.println(id);
    System.out.println(id1);
    System.out.println(id2);

    int[] id4 = new int[5];
    id[0] = 100;
    id[1] = 101;
    id[2] = 102;
    id[3] = 103;
    id[4] = 104;
    // 配列の初期化：作成した配列の要素数を調べるには、配列に対して、lengthを使用
    // 構文：データ型[]　配列名 = { 初期値１, 初期値２, 初期値３, 初期値n};
    // 配列名 .length; 要素数を獲得することができる。
    int[] id5 = {100, 101, 102,103,104};
    int size = id5.length;
    System.out.println(id5);
    System.out.println(id4);

  }
}
