package Lesson9.BoxesAndShelves;

public class BoxesAndShelvesTester {


    public static void main(String[] args) {

       Box<Toy> toyBox = new Box<>();
       toyBox.addItem(new Toy());

       Box<Book> bookBox = new Box<>();
       bookBox.addItem(new Book());
       bookBox.addItem(new Fantasy());


       Box<Item> itemBox = new Box<>();
       itemBox.addItem(new Food());
       itemBox.addItem(new Toy());
       itemBox.addItem(new Book());

       Box<Item> itemBox1 = new Box<>();
       itemBox1.addItem(new Food());
       itemBox1.addItem(new Toy());

       Box<Fantasy> fantasyBox = new Box<>();
       fantasyBox.addItem(new Fantasy());

       Shelf<Box> toyBoxShelf = new Shelf<>();
       toyBoxShelf.addItem(toyBox);

       Shelf<Box> bookBoxShelf = new Shelf<>();
       bookBoxShelf.addItem(bookBox);

       Shelf<Box> itemBoxShelf = new Shelf<>();
       itemBoxShelf.addItem(itemBox);













    }
}
