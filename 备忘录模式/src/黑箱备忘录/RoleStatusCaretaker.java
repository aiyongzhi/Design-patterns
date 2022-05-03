package 黑箱备忘录;

import 白箱备忘录.RoleStatusMemento;

import java.util.ArrayList;
import java.util.List;

//备忘录管理者
public class RoleStatusCaretaker {
    //提供储存备忘录的容器
    private final List<Memento> mementoList=new ArrayList<>();
    public void addMemento(Memento memento){
        mementoList.add(memento);
    }
    public Memento getMemento(String name){

        for (Memento memento : mementoList) {
            if(memento.getName().equals(name)){
                return memento;
            }
        }
        return null;
    }
}
