package Lesson8;

public class Beer {
    private String name;
    private String type;
    private double alcoholAmount;
    private double volume;

    public Beer(String name, String type, double alcoholAmount, double volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public double getAlcoholAmount() {
        return alcoholAmount;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof Beer)){
            return false;
        }
        Beer another = (Beer) obj;
        if (!name.equals(another.name)){
            return false;
        }
        if (!type.equals(another.type)) {
            return false;
        }
        if (alcoholAmount != another.alcoholAmount) {
            return false;
        }
        if (volume != another.volume) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {
        return (int) (alcoholAmount * volume);
    }
}

