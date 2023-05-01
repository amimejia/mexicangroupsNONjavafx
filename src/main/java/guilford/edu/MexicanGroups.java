package guilford.edu;

public final class MexicanGroups {
 //attributes

    //These are needed for random assignment of object
    private String groupName;
    private String region;
    private String Food;

    //Constructor
    public MexicanGroups(String groupName, String region, String Food) {
        this.groupName = groupName;
        this.region = region;
        this.Food = Food;
    }

    //Getters and Setters
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getFood() {
        return Food;
    }
    public void setFood(String Food) {
        this.Food = Food;
    }

}