package pl.sda.referencje;

public class LCDView {

    private View view;

    public void setView(View view) {
        this.view = view;
    }

    public void printData(){
        System.out.println(view.getDatabase().getStringList());
    }

}
