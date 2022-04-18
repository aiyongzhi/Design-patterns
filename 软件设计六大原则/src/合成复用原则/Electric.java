package 合成复用原则;

public  class Electric extends Energy {
    public Electric(String name) {
        super(name);
    }

    @Override
    public void launch() {
        System.out.println(getName()+"正在发动汽车!");
    }
}
