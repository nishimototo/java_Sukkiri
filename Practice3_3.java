
public class Practice3_3 {
  public static void main(String[] args) {
    int isHungry = new java.util.Random().nextInt();
    String food = "うどん";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹いっぱいです");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}
