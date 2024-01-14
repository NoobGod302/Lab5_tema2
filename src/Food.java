
class Food {
    private String name;
    private double price;

    
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

   
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

class MainCourse extends Food {
    private String meatType;


    public MainCourse(String name, double price, String meatType) {
        super(name, price);
        this.meatType = meatType;
    }

   
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}


class Dessert extends Food {
    private boolean isSweet;

    
    public Dessert(String name, double price, boolean isSweet) {
        super(name, price);
        this.isSweet = isSweet;
    }

    
    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }
}
