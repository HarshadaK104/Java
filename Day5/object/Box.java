package Day5.object;

import java.util.Objects;

public class Box {
    private int length;
    private int breadth;
    private int heigth;
    private int volume;
    
    public Box(){};

    public Box(int length, int breadth, int heigth, int volume) {
        this.length = length;
        this.breadth = breadth;
        this.heigth = heigth;
        this.volume = volume;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", heigth=" + heigth +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Box && this.volume==((Box)obj).volume){
            return true;
        }
        return false;
    }
}
