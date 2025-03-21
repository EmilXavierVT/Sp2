import java.util.ArrayList;


public class  Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();;

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
            System.out.println(t.toString()+"\n" +" the Title has "+  t.calculatePoints()+ " points"+"\n");

        }
        float roundedValue = Math.round(totalPay*100f)/100.0f;

        return roundedValue;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {

        return name + ": " + calculateTotalPay() + " kr";
    }

}

