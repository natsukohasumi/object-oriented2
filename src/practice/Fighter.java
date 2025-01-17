package practice;

public class Fighter {
    protected String name;
    protected int atk;
    
    Fighter(){
        this.name = "戦士";
        this.atk = 10;
    }

    public void attack(){
        System.out.println(name + "の攻撃！");
        System.out.println("敵に" + atk + "のダメージ！");
    }


}
