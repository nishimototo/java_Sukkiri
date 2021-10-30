public class Practice4_4 {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1ケタの数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : numbers) {
        if (n == input) {
           System.out.println("アタリ！");
           break;
        } else {
           System.out.println("ざんねん！");
        }

    }

  }
}
