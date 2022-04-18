package 开闭原则;

public class SougouInput {
    private AbstractSkin skin;

    public SougouInput(AbstractSkin skin) {
        this.skin = skin;
    }

    public AbstractSkin getSkin() {
        return skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display(){
        skin.display();
    }
}
