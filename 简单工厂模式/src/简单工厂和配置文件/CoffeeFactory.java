package 简单工厂和配置文件;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {
    private static final HashMap<String,Coffee> map=new HashMap<>();
    static {
        Properties properties=new Properties();
        //1:获取输入流对象
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("Coffee.properties");
        //2:进行配置文件的装载
        try {
            properties.load(inputStream);
            Set<Object> keySet = properties.keySet();
            for(Object key:keySet){
                String className = properties.getProperty((String) key);
                //3:用反射创建对象
                Constructor<?> constructor = Class.forName(className).getDeclaredConstructor();
                Coffee coffee = (Coffee) constructor.newInstance();
                map.put(className,coffee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    //静态简单工厂模式
    public static Coffee createCoffee(String name){
        if(name.equals("")){
            throw new RuntimeException("没有这种咖啡");
        }
        Coffee coffee = map.get(name);
        if(coffee==null){
            throw new RuntimeException("没有这种咖啡");
        }
        return coffee;
    }

}
