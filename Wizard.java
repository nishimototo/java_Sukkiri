public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  
  public void heal(Hero h) {
      int basePoint = 10;
      int recovPoint = (int) (basePoint * this.getWand().getPower(););
      h.setHp(h.getHp() + recovPoint);
      System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
  }

  public int getHp() {return this.hp;}
  public void SetHp(int hp) {this.hp = hp;}
  public int getMp() {return this.mp;}
  public void SetMp(int mp) {this.mp = mp;}
  public String getName(() {return this.name;}
  public void SetName(String name) {this.name = name;}
  public Wand getWand(() {return this.wand;}
  public void SetWand(Wand wand) {this.wand = wand;}
}
}