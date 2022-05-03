package 黑箱备忘录;

public class Client {
    public static void main(String[] args) {
        //创建备忘录管理者对象
        RoleStatusCaretaker caretaker=new RoleStatusCaretaker();
        //创建一个英雄
        GameRole role1=new GameRole("菲奥娜");
        role1.init();
        caretaker.addMemento(role1.savaStatus());
        System.out.println("==============开始打BOSS============");
        role1.fight();
        role1.fight();
        role1.fight();
        role1.fight();
        System.out.println("==============结束打BOSS============");
        System.out.println("打完BOSS后状态");
        role1.displayStatus();
        System.out.println("=================================");
        System.out.println("回退到之前的状态");
        role1.reBack(caretaker.getMemento(role1.getName()));
        role1.displayStatus();
    }
}
