package Projectstictac;

public class Player {
    private String name;
    private char symbol;
    private String password;

    public Player(String name, char symbol, String password) {
        this.name = name;
        this.symbol = symbol;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void register(String name, String password, String confirmPassword) {
        if (password.equals(confirmPassword)){
            System.out.println("Registration succesful. Hello " + name);
        } else {
            System.out.println("Wrong password. Please try again.");
        }
    }
    public void login(String name, String password){
        System.out.println("Hello " + name);
    }




}
