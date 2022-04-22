package ImplPattern;

public class RMVBFile extends VideoType{
    @Override
    public void decode(String fileName) {
        System.out.println("解码了RMVB文件:  "+fileName);
    }
}
