package 设计模式之禅.开闭原则;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private static final List<IBook> bookList=new ArrayList<>();
    static {
        //用静态代码块来进行初始化
        bookList.add(new NovelBook("三国演义",28.5,"罗贯中"));
        bookList.add(new NovelBook("水浒传",30,"施耐庵"));
        bookList.add(new ComputerBook("C语言程序设计",42.5,"谭浩强","编程语言"));
    }
    /*
    * 写一个展示书目的方法
    * */
    public void showAll(){
        for(IBook book:bookList){
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        new BookStore().showAll();
    }
}
