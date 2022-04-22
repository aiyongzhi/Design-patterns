import AbstractPattern.MAC;
import AbstractPattern.OperatingSystem;
import AbstractPattern.Windows;
import ImplPattern.AVLFile;
import ImplPattern.RMVBFile;

public class Test {
    public static void main(String[] args) {
        OperatingSystem windows=new Windows(new AVLFile());
        //1:播放视频
        windows.play("仙剑三");
        System.out.println("===============================");
        OperatingSystem mac=new MAC(new AVLFile());
        mac.play("仙剑三");
        System.out.println("===============================");
        mac.setType(new RMVBFile());
        mac.play("仙剑三");
    }
}
