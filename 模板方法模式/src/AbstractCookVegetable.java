public abstract class AbstractCookVegetable {
    public void pourOil(){
        System.out.println("倒油!");
    }
    public void heatOil(){
        System.out.println("热油!");
    }
    public abstract void pourVegetable();//倒蔬菜
    public abstract void pourSauce();//倒酱料
    public void fry(){
        System.out.println("翻炒");
    }
    public final void cook(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }
}
