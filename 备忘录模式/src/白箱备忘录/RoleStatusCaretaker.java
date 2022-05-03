package 白箱备忘录;

import java.util.ArrayList;
import java.util.List;

//备忘录管理者
public class RoleStatusCaretaker {
    //提供储存备忘录的容器
    private final List<RoleStatusMemento> mementoList=new ArrayList<>();
    public void addMemento(RoleStatusMemento memento){
        mementoList.add(memento);
    }
    public RoleStatusMemento getMemento(String name){
        for (RoleStatusMemento memento : mementoList) {
            if(memento.getName().equals(name)){
                return memento;
            }
        }
        return null;
    }
}
