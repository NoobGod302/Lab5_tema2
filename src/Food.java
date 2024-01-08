
class Food {
    private String name;
    private double price;

    // Constructor care initializează toate câmpurile
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getteri și setteri pentru câmpurile clasei parinte
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Clasa mostenitoare 1
class MainCourse extends Food {
    private String meatType;

    // Constructor care apelează constructorul din clasa parinte
    public MainCourse(String name, double price, String meatType) {
        super(name, price);
        this.meatType = meatType;
    }

    // Getter și setter pentru câmpul adițional
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}

// Clasa mostenitoare 2
class Dessert extends Food {
    private boolean isSweet;

    // Constructor care apelează constructorul din clasa parinte
    public Dessert(String name, double price, boolean isSweet) {
        super(name, price);
        this.isSweet = isSweet;
    }

    // Getter și setter pentru câmpul adițional
    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }
}