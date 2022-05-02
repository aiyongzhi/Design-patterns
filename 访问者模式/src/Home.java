import java.util.ArrayList;
import java.util.List;

//储存元素对象的容器
public class Home {
    private final List<Animal> animalList;
    public Home(){
        animalList=new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    public void action(Person person){
        for (Animal animal : animalList) {
            animal.accept(person);
        }
    }
}
