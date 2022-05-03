package 白箱备忘录;
//备忘录角色
public class RoleStatusMemento {
    private String name;
    private int hp;//英雄血量
    private int ack;//英雄攻击力
    private int def;//英雄防御力

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
