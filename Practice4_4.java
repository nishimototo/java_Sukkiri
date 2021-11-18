public class Practice4_4 {
   int[] numbers = {3, 4, 9};
   System.out.println("1桁の数字を入力してください");
   int input = new java.util.Scanner(System.in).nextInt();
   for(int i = 0; i < numbers.length; i++) {
      if (numbers[i] == input) {
         System.out.println("当たり！");
         break;
      } else {
         System.out.println("ハズレ！");
      }
   }
}
