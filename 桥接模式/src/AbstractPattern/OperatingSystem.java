package AbstractPattern;

import ImplPattern.VideoType;

/*  抽象化角色  */
public abstract class OperatingSystem {
    private VideoType type;

    public OperatingSystem(VideoType type) {
        this.type = type;
    }

    public VideoType getType() {
        return type;
    }

    public void setType(VideoType type) {
        this.type = type;
    }
    public abstract void play(String fileName);
}
