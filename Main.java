public class Main {
  public static void heal(int hp) {
    hp += 10;
}

  public static void heal(Theif theif) {
    theif.hp += 10;
}

  public static void main(String[] args) {
    int baseHp = 25;
    Theif t = new Theif("アサカ", baseHp);
    System.out.println(baseHp + ":" + t.hp); //t.hpがbaseHpと同じ25
    heal(baseHp);//hpが35になる
    heal(t);
    System.out.println(baseHp + ":" + t.hp)
}
}