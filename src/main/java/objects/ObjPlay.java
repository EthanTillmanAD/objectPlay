package objects;

public class ObjPlay {

    public static void main(String[] args) {
        PullObjects game = new PullObjects();

        game.gameName = "Call of duty";
        game.gameCreator = "Activison";
        game.playGame();



        game.playGame();
        game.store(200);

    }



}
