import java.util.ArrayList;


public class  Author {
    private final String name;
    private final ArrayList<Title> titles = new ArrayList<>();

    public Author(String name){
        this.name =name;

    }

    public void addTitle(Title title){
    titles.add(title);
    }

    public float calculateTotalPay(){
        float totalPay= 0;
        for(Title t : titles) {
            totalPay += t.calculateRoyalty();
            System.out.println(t +"\n" +" the Title has "+  t.calculatePoints()+ " points"+"\n");

        }

        return Math.round(totalPay*100f)/100.0f;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {

        return name + ": " + calculateTotalPay() + " kr";
    }

}

