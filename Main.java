public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("湊");
    Hero h2 = new Hero();
    Theif t1 = new Theif("アサカ", 50, 10);
    
    System.out.println(h.hp);
    System.out.println(h.name);
    System.out.println("名前は" + h2.name);
    System.out.println(t1.name + "HP:" + t1.hp + " MP:" + t1.mp);
  }  
}