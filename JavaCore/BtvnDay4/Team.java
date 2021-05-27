public class Team {
    private String name;
    private String stadium;
    private String coach;
    private int established_year;

    public Team() {
        this.name = "Manchester United";
        this.stadium = "Old Traford";
        this.coach = "Ole Gunnar Solskjær";
        this.established_year = 1878;
    }

    public Team(String name, String stadium, String coach, int established_year) {
        this.name = name;
        this.stadium = stadium;
        this.coach = coach;
        this.established_year = established_year;
    }

    public void display(){
        System.out.println("Team:");
        System.out.println("Club name: " + name + " |Stadium: " + stadium + " |Coach: " + coach + " |Established Year: " + established_year);
    }

}
