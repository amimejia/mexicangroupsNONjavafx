package guilford.edu;



abstract class Continent {
    public String continentName;
    public String ocean;

    // Constructors
    public Continent(String continentName, String ocean) {
        //Make a switch statement that assigns each continent name to oceans
        //and then assign the values to the variables
        switch (continentName) {
            case "North America":
                this.ocean = "Atlantic";
                break;
            case "South America":
                this.ocean = "Atlantic";
                break;
            case "Europe":
                this.ocean = "Atlantic";
                break;
            case "Africa":
                this.ocean = "Atlantic";
                break;
            case "Asia":
                this.ocean = "Pacific";
                break;
            case "Australia":
                this.ocean = "Pacific";
                break;
            case "Antarctica":
                this.ocean = "Pacific";
                break;
        }
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
        if (ocean.equals("Atlantic")) {
            System.out.println("You should sail to " + continentName);
        } else {
            System.out.println("You should fly to " + continentName);
        }
    }
    

}