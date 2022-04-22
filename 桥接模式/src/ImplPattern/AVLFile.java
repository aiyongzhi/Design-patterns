package ImplPattern;

public class AVLFile extends VideoType{
    @Override
    public void decode(String fileName) {
        System.out.println("解码了AVL文件:  "+fileName);
    }
}
