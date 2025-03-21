public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;


    public Title(String title, String literatureType){
    this.title = title;
    this.literatureType = literatureType;

    }
    protected abstract double calculatePoints();

    public double calculateRoyalty(){

        return calculatePoints()*rate;
    }





    protected double convertLiteratureType(){
        double Mweight= 0;
        switch (literatureType) {
            case "BI" -> Mweight = 3;
            case "TE" -> Mweight = 3;
            case "LYRIK" -> Mweight = 6;
            case "SKØN" -> Mweight = 1.7;
            case "FAG" -> Mweight = 1;
            default -> System.out.println("Not a valid literature type!");
        }
       return Mweight;
    }
@Override
    public String toString(){
        String s =  "Title: "+ title + "\n"+" Literature type:  " + literatureType + "\n" +" there is "+ copies + " in the libary ";
        return s;

}


}

