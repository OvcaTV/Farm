public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

    public static class Salmon{
    }

    public static class Shrimp {
    }

    public static class Leech {
    }

    public static class Dragonfly {
    }

    public static class Carp {
    }
}
