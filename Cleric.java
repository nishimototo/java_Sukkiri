public class Cleric {
  　String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
    
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println(this.name + "のHPが最大まで回復した");
    }
    
    public int pray(int sec) {
        int recover = sec + new java.util.Random().nextInt(3);
        System.out.println(this.name + "は" + sec + "秒、祈りを捧げた");
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MP" + "が" + recoverActual + "回復した");
        return recoverActual;
    }
}
