public class Practice5_4 {
  public static double calcTriangleArea(double bottom, double height) {
    double triangleArea = (bottom * height) / 2;
    return triangleArea;
}
  public static double calcCircleArea(double radius) {
      double circleArea = radius * radius * 3.14;
      return circleArea;
  }
  public static void main(String[] args) {
      double triangleArea = calcTriangleArea(10.0, 5.0);
      double circleArea = calcCircleArea(5.0);
      System.out.println("底辺が10cm、高さが5cmの三角形の面積は" + triangleArea);
      System.out.println("半径が5cmの円の面積は" + circleArea);
  }
}
