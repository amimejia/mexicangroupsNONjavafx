package guilford.edu;



abstract class Continent {
    protected String continentName;
    protected String ocean;

    // Constructors
    public Continent() {
        //Make a switch statement that assigns each continent name to oceans
        //and then assign the values to the variables
        switch (continentName) {
            case "North America":
                ocean = "Atlantic";
                break;
            case "South America":
                ocean = "Atlantic";
                break;
            case "Europe":
                ocean = "Atlantic";
                break;
            case "Africa":
                ocean = "Atlantic";
                break;
            case "Asia":
                ocean = "Pacific";
                break;
            case "Australia":
                ocean = "Pacific";
                break;
            case "Antarctica":
                ocean = "Pacific";
                break;
        }
    }

    public Continent(String continentName, String ocean) {
        this.continentName = continentName;
        this.ocean = ocean;
    }

    // Getters and Setters
    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    public String getOcean() {
        return ocean;
    }
    public void setOcean(String ocean) {
        this.ocean = ocean;
    }

    //To String Method
    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", ocean='" + ocean + '\'' +
                '}';
    }

    //Method that suggests whether to fly or sail
    public void flyOrSail() {
        if (ocean == "Atlantic") {
            System.out.println("You should sail to " + continentName);
        } else {
            System.out.println("You should fly to " + continentName);
        }
    }
    
    // Create a method that chooses if group is patriarchal or matriarchal
    // public void patriarchalOrMatriarchal() {
    //     if (femalepopulation > malepopulation) {
    //         System.out.println("This group is matriarchal");
    //     } else {
    //         System.out.println("This group is patriarchal");
    //     }
    // }
}