public class FoodMain {
    public static void main(String[] args) {

        Food food = new Food("Some Food", 10.99);
        System.out.println("Food Name: " + food.getName());
        System.out.println("Food Price: $" + food.getPrice());
        System.out.println();


        MainCourse mainCourse = new MainCourse("Steak", 25.99, "Beef");
        System.out.println("Main Course Name: " + mainCourse.getName());
        System.out.println("Main Course Price: $" + mainCourse.getPrice());
        System.out.println("Meat Type: " + mainCourse.getMeatType());
        System.out.println();

        // Exemplu pentru clasa mostenitoare 2
        Dessert dessert = new Dessert("Chocolate Cake", 8.99, true);
        System.out.println("Dessert Name: " + dessert.getName());
        System.out.println("Dessert Price: $" + dessert.getPrice());
        System.out.println("Is Sweet: " + dessert.isSweet());
    }
}
