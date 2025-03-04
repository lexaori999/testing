class Product{
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean reservation;

    public Product (String _name, String _productionDate, String _manufacturer, String _country, double _price, boolean _reservation){
        this.name = _name;
        this.productionDate = _productionDate;
        this.manufacturer = _manufacturer;
        this.country = _country;
        this.price = _price;
        this.reservation = _reservation;
    }
    public void out(){
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + " USD");
        System.out.println("Забронировано: " + (reservation ? "Да" : "Нет"));
        System.out.println();
    }
}
class Park {
    private String parkName;

    public Park(String _parkName) {
        this.parkName = _parkName;
    }
    public String getParkName() {
        return parkName;
    }
    class Attraction {
        private String attractionName;
        private String workingHours;
        private double ticketPrice;

        public Attraction(String _attractionName, String _workingHours, double _ticketPrice) {
            this.attractionName = _attractionName;
            this.workingHours = _workingHours;
            this.ticketPrice = _ticketPrice;
        }

        public void attractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена билета: " + ticketPrice + " USD");
            System.out.println();
        }
    }
}
public class Lesson_10 {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 17 Pro", "15.09.2025", "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Sony PlayStation 5", "20.11.2025", "Sony Corp.", "Japan", 4979, true);
        productsArray[3] = new Product("Xiaomi Mi 15", "10.03.2025", "Xiaomi Ltd.", "China", 2699, false);
        productsArray[4] = new Product("Dell XPS 17", "05.07.2025", "Dell Technologies", "USA", 6999, true);
        for (Product product : productsArray) {
            product.out();
        }

        Park amusementPark = new Park("Dreamland Park");

        Park.Attraction rollerCoaster = amusementPark.new Attraction("Американские горки", "10:00 - 22:00", 25.5);
        Park.Attraction ferrisWheel = amusementPark.new Attraction("Колесо обозрения", "09:00 - 21:30", 15.0);
        Park.Attraction hauntedHouse = amusementPark.new Attraction("Дом с привидениями", "12:00 - 23:00", 18.0);

        System.out.println("\n=== Аттракционы в парке " + amusementPark.getParkName() + " ===");
        rollerCoaster.attractionInfo();
        ferrisWheel.attractionInfo();
        hauntedHouse.attractionInfo();
    }
}
