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

    public Animal(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    public static class Salmon extends Animal{
        public Salmon(String type, String name, Size size, String specialCare) {
            super(type, name, size, specialCare);

        }
    }

    public static class Shrimp extends Animal{
        public Shrimp(String type, String name, Size size, String specialCare) {
            super(type, name, size, specialCare);
        }
    }

    public static class Leech extends Animal{
        public Leech(String type, String name, Size size, String specialCare) {
            super(type, name, size, specialCare);
        }
    }

    public static class Dragonfly extends Animal{
        public Dragonfly(String type, String name, Size size, String specialCare) {
            super(type, name, size, specialCare);
        }
    }

    public static class Carp extends Animal{
        public Carp(String type, String name, Size size, String specialCare) {
            super(type, name, size, specialCare);
        }
    }
}
