import java.util.ArrayList;

public class Player {
    private String name;
    private int shirtNumber;
    private Position position;

    public Player(){
    }

    public Player(String name, int shirtNumber, Position position) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    @Override
    public String toString(){
        return "Player name: " + name + " |Shirt Number: " + shirtNumber + " |Position: " + position;
    }
    public void Real_Madrid() {
        ArrayList<Player> playList = new ArrayList<Player>();
        playList.add(new Player("Thibaut Courtois", 1, Position.GOALKEEPER));
        playList.add(new Player("Marcelo", 12, Position.DEFENDER));
        playList.add(new Player("Raphael Varane", 5, Position.DEFENDER));
        playList.add(new Player("Sergio Ramos", 4, Position.DEFENDER));
        playList.add(new Player("Eden Hazard", 7, Position.MIDFIELDER));
        playList.add(new Player("Isco", 22, Position.MIDFIELDER));
        playList.add(new Player("Luka Modric", 10, Position.MIDFIELDER));
        playList.add(new Player("Toni Kroos", 8, Position.MIDFIELDER));
        playList.add(new Player("Marco Asensio", 11, Position.MIDFIELDER));
        playList.add(new Player("Lucas Vazquez", 17, Position.FORWARDER));
        playList.add(new Player("Karim Benzema", 9, Position.FORWARDER));
        for (Player player : playList) {
            System.out.println(player.toString());
        }
    }


}
