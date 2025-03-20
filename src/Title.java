public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;


    public Title(String title, String literatureType, int copies){
    this.title = title;
    this.literatureType = literatureType;
    this.copies = copies;
    }
    public double calculateRoyalty(){

        return calculatePoints()*rate;
    }


    protected abstract double calculatePoints();


    protected double convertLiteratureType(){
        double Mweight= 0;
       switch (literatureType) {
           case "BI":
               Mweight = 3;
               break;
           case "TE":
               Mweight = 3;
               break;
           case "LYRIK":
               Mweight = 6;
               break;
           case "SKØN":
               Mweight = 1.7;
               break;
           case "FAG":
               Mweight = 1;
               break;
           default:
               System.out.println("Not a valid literature type!");

       }
       return Mweight;
    }
@Override
    public String toString(){
        String s =  "Title: "+ title + "\n"+" Literature type:  " + literatureType + "\n" +" there is "+ copies + " in the libary ";
        return s;

}


}

