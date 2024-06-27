package footballtournament;

public class Team {
    private String name;
    private String players;

    public Team(String name, String players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setName(String name) {
        this.name = name;
    }
}
