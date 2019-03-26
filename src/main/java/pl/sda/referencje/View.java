package pl.sda.referencje;

public class View {

    private Database database;
    private LCDView lcdView;

    public Database getDatabase() {
        return database;
    }

    public View(Database database, LCDView lcdView) {
        this.database = database;
        this.lcdView = lcdView;
    }

    public void printFromLCD(){
        lcdView.setView(this);
        lcdView.printData();
    }

    public void printAllData(){
        System.out.println(database.getStringList());
    }


}
