public class Practice4_2 {
  public static void main(String[] args) {
    int[] moneyList = {121902, 8302, 55100};
    //通常のfor文
    for (int i = 0; i < moneyList.length; i++) {
        System.out.println(moneyList[i]);
    }
    //拡張for文
    for (int m : moneyList) {
        System.out.println(m);
    }
  }
}