// level, role -> maxHP, maxMp, pa, pd, ma, md, ag, cc, cd
public class Warrior extends Hero {

  public Warrior() {
    super();
  }

  public int getPD(){
    return Heros.getPD(Heros.WARRIOR, super.getLevel());
  }

  public void attack(Hero hero){
    int myAttack = Heros.getPA(Heros.WARRIOR, super.getLevel());
    int hpTobeDeducted = myAttack - hero.getPD();
    hero.deductHP(hpTobeDeducted);
  }

  @Override
  public void levelUp() {
    super.levelUp();
    int maxHp = Heros.getMAX_HP(Heros.WARRIOR, super.getLevel());
    super.setHP(maxHp);
    System.out.println("test " + super.getLevel() + " ");
  }


  public static void main(String[] args) {
    // 1D array
    int[] warriorPa = new int[] {2,4,6,8,10,12,14,16,18,20};
    int[] archerPa = new int[] {2,4,6,8,10,12,14,16,18,20};
    int[] magePa = new int[] {2,4,6,8,10,12,14,16,18,20};

    // 2D array
    int[] [] pa = new int[3][10]; // 3 rows, 10 columns
    pa[0] = new int[] {2,4,6,8,10,12,14,16,18,20};
    pa[1] = new int[] {2,4,6,8,10,12,14,16,18,20};
    pa[2] = new int[] {2,4,6,8,10,12,14,16,18,20};

    // Archer level 8 PA
    System.out.println(pa[1][7]); // 16

    System.out.println(Heros.WARRIOR);
    System.out.println(Heros.getPA(Heros.WARRIOR, 8));

    // Testing
    Warrior warrior1 = new Warrior();
    warrior1.levelUp();

    Warrior warrior2 = new Warrior();
    warrior2.levelUp();
    warrior2.levelUp();

    System.out.println(warrior1.getHp()); //20
    warrior2.attack(warrior1);
    System.out.println(warrior2.getHp());

  }

}
