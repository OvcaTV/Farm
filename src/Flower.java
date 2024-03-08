public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public static class Violet extends Flower{
        public Violet(String name, double price, double neededArea, double chanceOfGrowth) {
            super(name, price, neededArea, chanceOfGrowth);
        }
    }

    public static class Tulip extends Flower {
        public Tulip(String name, double price, double neededArea, double chanceOfGrowth) {
            super(name, price, neededArea, chanceOfGrowth);
        }
    }

    public static class Rose extends Flower{
        public Rose(String name, double price, double neededArea, double chanceOfGrowth) {
            super(name, price, neededArea, chanceOfGrowth);
        }
    }

    public static class Hyacint extends Flower{
        public Hyacint(String name, double price, double neededArea, double chanceOfGrowth) {
            super(name, price, neededArea, chanceOfGrowth);
        }
    }

    public static class Orchideae extends Flower{
        public Orchideae(String name, double price, double neededArea, double chanceOfGrowth) {
            super(name, price, neededArea, chanceOfGrowth);
        }
    }
}
