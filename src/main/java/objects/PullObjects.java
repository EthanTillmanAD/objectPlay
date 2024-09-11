package objects;

public class PullObjects {

    public String gameName;
    public String gameCreator;
    public boolean scratch = false;

    public void playGame(){

        if(!scratch) {
            System.out.println("Now playing " + gameName + " by " + gameCreator);
        }else{
            System.out.println("Error error error");
        }

    }
    public int gameQty(int qty){

        return qty;
    }
    public void store(int x){
        System.out.println("You are ordering " + gameQty(x) + " copies of "+
               gameName +" by" + gameCreator);

    }

}
