package Detail;

public class Team {
    private String name;

    public Team(String name) {
        if (name == null) {
            System.out.println("ERROR CONSTRUCTOR IN TEAM INSTANCE ARGUMENT CAN NOT BE NULL");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("ERROR setName IN TEAM INSTANCE ARGUMENT CAN NOT BE NULL");
        }
    }
}
