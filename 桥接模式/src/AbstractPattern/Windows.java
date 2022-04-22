package AbstractPattern;

import ImplPattern.VideoType;

/* 扩展抽象化角色   */
public class Windows extends OperatingSystem{
    public Windows(VideoType type) {
        super(type);
    }
    @Override
    public void play(String fileName) {
        //1:解码
        super.getType().decode(fileName);
        //2:播放视频
        System.out.println("Windows操作系统播放了:"+fileName);
    }
}
