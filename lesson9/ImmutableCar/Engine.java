package Lesson9;

public class Engine {
    private String type;
    private int horsePower;
    private int volume;

    public Engine(String type, int horsePower, int volume) {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                ", volume=" + volume +
                '}';
    }
}
