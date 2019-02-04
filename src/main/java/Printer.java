public class Printer {

    private int paper;
    private int toner;

    public Printer(){
        this.paper = 50;
        this.toner = 50;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int copies){
        if(this.paper >= copies){
             this.paper -= copies;
             this.toner -= copies;
        }
    }

    public int refillPaper(){
        return paper = 50;
    }

}
