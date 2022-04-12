class Sample2_8 {
  public static void main(String[] args) {
    int[] a = new int[1];
    int[] b = a;
    a[0] = 10;
    System.out.println("a[0] :" + a[0] + " b[0] : " + b[0]);
    b[0] = 50;
    System.out.println("a[0] :" + a[0] + " b[0] : " + b[0]);
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(args[1] + args[2]);
    // System.out.println(i);
    // int[] array = new int[1];
    // System.out.println("array[0]の値 : " + array[0]);
    // System.out.println("array[0]の値 : " + array[1]);
  }
}
