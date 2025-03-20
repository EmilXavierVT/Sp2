public class EBook extends NetBook{
    private double characters;
    private boolean illustrated;
    public EBook(String title, String literatureType, int copies, int reach, int availability, int use,double characters,boolean illustrated) {
        super(title, literatureType, copies, availability , reach, use);
        this.characters=characters;
        this.illustrated=illustrated;

    }
    private double calculatePages(){
        if(illustrated){
        return ((characters/1800+20)* 1.1);
        }
        return characters/1800+20;
    }

    @Override
    protected double calculatePoints() {
        return calculatePages() * convertLiteratureType() *  ((reach*5)+(availability*0.5) + use);
    }
}
