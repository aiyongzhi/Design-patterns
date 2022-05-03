package 白箱备忘录;

public class GameRole {
    private String name;
    private int hp;//英雄血量
    private int ack;//英雄攻击力
    private int def;//英雄防御力
    public GameRole(String name) {
        this.name = name;
    }
    public void init(){
        hp=100;
        ack=100;
        def=100;
    }
    //攻击
    public void fight(){
        System.out.println("英雄发动了技能");
        this.hp-=10;
        this.ack-=5;
        this.def-=10;
    }
    //提供备忘自己的方法
    public RoleStatusMemento savaStatus(){
        RoleStatusMemento memento=new RoleStatusMemento();
        memento.setName(this.name);
        memento.setHp(this.hp);
        memento.setAck(this.ack);
        memento.setDef(this.def);
        return memento;
    }
    //提供一个方法恢复到之前的状态
    public void reBack(RoleStatusMemento memento){
        this.hp=memento.getHp();
        this.ack=memento.getAck();
        this.def=memento.getDef();
    }
    public void displayStatus(){
        System.out.println("英雄姓名: "+this.name);
        System.out.println("英雄生命值: "+this.hp);
        System.out.println("英雄攻击力: "+this.ack);
        System.out.println("英雄防御力: "+this.def);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
