package practice;

public class MagicFighter extends Fighter {
    private int mp;

    MagicFighter(){
        this.name = "魔法戦士";
        this.mp = 20;

    }

    @Override
    public void attack(){


        System.out.println(name + "の魔法攻撃！");
        System.out.println("敵に" + (atk + mp) + "のダメージ！");
    
    }
    
    

    

}
