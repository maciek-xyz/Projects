package Lesson9.BoxesAndShelves;

public class BoxesAndShelvesTester {

    public static void main(String[] args) {

       Box<Toy> toysBox = new Box<>();
       toysBox.addItem(new Toy("Lego"));
       toysBox.addItem(new Toy("Car"));
       toysBox.addItem(new Toy("Doll"));
       System.out.println("toyBox: " + toysBox.getItem());

       Box<Food> foodsBox = new Box<>();
       foodsBox.addItem(new Food("Chipsy"));
       foodsBox.addItem(new Food("Lollipop"));
       foodsBox.addItem(new Food("Cheese"));
       foodsBox.addItem(new Food("Ice cream"));
       System.out.println("foodsBox: " + foodsBox.getItem());

       Box<Book> booksBox = new Box<>();
       booksBox.addItem(new Book("JAVA head first"));
       booksBox.addItem(new Book("Clean code"));
       booksBox.addItem(new Book("Kubuś puchatek"));
       System.out.println("booksBox: " + booksBox.getItem());

       Box<Fantasy> fantasyBooksBox = new Box<>();
       fantasyBooksBox.addItem(new Fantasy("Lord of the rings"));
       fantasyBooksBox.addItem(new Fantasy("Pirates of the Carribean"));
       System.out.println("fantasyBooksBox: " + fantasyBooksBox.getItem());

       Box<Item> itemsBox = new Box<>();
       itemsBox.addItem(new Food("Cookies"));
       itemsBox.addItem(new Toy("Bear"));
       itemsBox.addItem(new Food("Lollipop"));
       System.out.println("itemsBox: " + itemsBox.getItem());

       Shelf<Box<Toy>> shelfWithBoxToys = new Shelf<>();
       shelfWithBoxToys.addBox(toysBox);
       System.out.println("Shelf with box toys : " + shelfWithBoxToys.getItem());

       Shelf<Box<? extends Book>> shelfWithBoxBooks = new Shelf<>();
       shelfWithBoxBooks.addBox(booksBox);
       shelfWithBoxBooks.addBox(fantasyBooksBox);
       System.out.println("Shelf with box Books: " + shelfWithBoxBooks.getItem());

       Shelf<Box<Item>> shelfWithBoxItems = new Shelf<>();
       shelfWithBoxItems.addBox(itemsBox);
       System.out.println("Shelf with box items: " + shelfWithBoxItems.getItem());

    }
}
