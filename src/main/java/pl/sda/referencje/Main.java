package pl.sda.referencje;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        Database database1 = new Database();

        View view = new View(database, new LCDView());
        view.printAllData();
        database1.getStringList().add("Trzy");
        view.printAllData();
        view.printFromLCD();

    }
}
