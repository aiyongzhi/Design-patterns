//具体元素对象 狗对象
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        if(person==null){
            throw new NullPointerException("必须传入Person的实例对象，不能为空!");
        }
        person.feed(this);//具体元素中调用访问者的方法
        System.out.println("好好吃.......汪汪汪......");
    }
}
