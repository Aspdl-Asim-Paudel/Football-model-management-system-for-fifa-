package modal;


import java.util.ArrayList;

public class Teams {
    String Name;
    String Fifa_Positions;
    String group;
    String Jersey_Color;
 ArrayList<Players> player;

    public Teams(String Name, String Fifa_Positions, String group, String Jersey_Color, ArrayList<Players> player) {
        this.Name = Name;
        this.Fifa_Positions = Fifa_Positions;
        this.group = group;
        this.Jersey_Color = Jersey_Color;
        this.player = player;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFifa_Positions() {
        return Fifa_Positions;
    }

    public void setFifa_Positions(String Fifa_Positions) {
        this.Fifa_Positions = Fifa_Positions;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getJersey_Color() {
        return Jersey_Color;
    }

    public void setJersey_Color(String Jersey_Color) {
        this.Jersey_Color = Jersey_Color;
    }

    public ArrayList<Players> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Players> player) {
        this.player = player;
    }
}
