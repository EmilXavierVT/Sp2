public abstract class NetBook extends Title {
    private final int availability;// TODO: Total amount of Municipalities whom has the book
    private final int reach; // TODO: Municipalities whom rented out
    private final int use; // TODO: times checked out
    public NetBook(String title, String literatureType,int availability,int reach,int use) {
        super(title, literatureType);
        this.availability=availability;
        this.reach =reach;
        this.use=use;
    }
    protected double getPseudoCopies(){
        return (this.availability*0.5) + getUseFactor();

    }
    public  int getUseFactor(){
        return (this.reach*5) + this.use;

    }




}
