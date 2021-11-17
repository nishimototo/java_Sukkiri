public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  
  public void heal(Hero h) {
      int basePoint = 10;
      int recovPoint = (int) (basePoint * this.getWand().getPower());
      h.setHp(h.getHp() + recovPoint);
      System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
  }

  public int getHp() {return this.hp;}
  public void SetHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
    
  }
  public int getMp() {return this.mp;}
  public void SetMp(int mp) {
    if (mp < 0) {
      throw new IllegalAccessException("設定しようとしているMPにエラーがあります");
    }
    this.mp = mp;
  }
  public String getName(() {return this.name;}
  public void SetName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("魔法使いに設定しようとしている名前にエラーがあります");
    }
    //this.name = name;
  }
  public Wand getWand(() {return this.wand;}
  public void SetWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("設定しようとしている杖がnullです");
    }
    this.wand = wand;
  }
}
}