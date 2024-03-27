
class Monster {
    void attack(){
        System.out.println("!^_&^$@+%$* I don't know how to attack!");
    }
}
class FireMonster extends Monster{
    void attack(){
        System.out.println("Attack with fire!");
    }
}

class WaterMonster extends Monster{
    void attack(){
        System.out.println("Attack with water!");
    }
}

class StoneMonster extends Monster{
    void attack(){
        System.out.println("Attack with stones!");
    }
}


public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new StoneMonster();

        m1.attack();
        m2.attack();
        m3.attack();

        m1 = new StoneMonster();
        m1.attack();

        Monster m4 = new Monster();
        m4.attack();
    }
}
