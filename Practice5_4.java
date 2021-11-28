public class Practice5_4 {
  public static void main(String[] args) {
    System.out.println("底辺が10.0ｃｍ、高さが5.0ｃｍの三角形の面積は" + calcTriangleArea(10.0, 5.0));
    System.out.println("半径が5.0cmの円の面積は" + calcCircleArea(5.0));

  }

  public static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }

  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
}
