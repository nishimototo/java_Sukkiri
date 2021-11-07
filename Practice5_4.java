public class Practice5_4 {
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    double circleArea = calcCircleArea(5.0);
    System.out.println("底辺が10cm､高さが5cmの三角形の面積は" + triangleArea);
    System.out.println("半径が5cmの円の面積は" + circleArea);
 }
 
 public static double calcTriangleArea(double bottom, double height) {
     return bottom * height / 2;
 }
 
 public static double calcCircleArea(double radius) {
     return radius * radius * 3.14;
 }
}
