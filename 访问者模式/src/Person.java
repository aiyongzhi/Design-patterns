//抽象访问者角色
public interface Person {
    //访问者访问元素
    void feed(Dog dog);
    void feed(Cat cat);
}
