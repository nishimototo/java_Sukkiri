public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました");
    
    Cleric c = new Cleric();
    c.name = "田中";
    c.selfAid();
    c.pray(2);
  }
}