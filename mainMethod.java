import java.util.*;
public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice new Dice( numberOfDice: 1);
        Player pl = new Player( playerName: "Alberts", id: 1);
        Player p2= new Player( playerName: "Pintoss", id: 2);
        Queue<Player> allPlayers new LinkedList<>();
        allPlayers.offer (pl);
        allPlayers.offer(p2);
        Jumper snakel=new Jumper (10,2);
        Jumper snake2 = new Jumper (99,12);
        List<Jumper> snakes=new ArrayList<>();
        snakes.add(snakel);
        snakes.add(snake2);
        Jumper ladder1 new Jumper (5,25);
        Jumper ladder2 new Jumper (40,89);
        List<Jumper> ladders=new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        Map<String, Integer> playersCurrent Position new HashMap<>();
        playersCurrentPosition.put("Alberts",0);
        playersCurrentPosition.put("Pintosa",0);
        GameBoard gb=new GameBoard(dice, allPlayers, snakes, ladders,playersCurrentPosition, boardsize:10);
        gb.startGame();
}