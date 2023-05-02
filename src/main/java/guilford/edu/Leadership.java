package guilford.edu;

public class Leadership extends Culture implements Comparable<Leadership> {
    //Attributes
    public String leaderName;
    public String leaderTitle;
    public String leaderType;

    //Constructors
    public Leadership () {
        super();
    }

    public void Leadership(String continentName, String ocean, String countryName, String capital, int population, String peoplesName, String language, String religion, String popularfood, String leaderName, String leaderTitle, String leaderType) {    
        //Assign leaderTitles to the leaderNames and leaderTypes
        switch (leaderName) {
            case "Andres Manuel Lopez Obrador":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Barack Obama":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Justin Trudeau":
                this.leaderTitle = "Prime Minister";
                this.leaderType = "Elected";
                break;
            case "Jair Bolsonaro":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Mauricio Macri":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Emmanuel Macron":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Angela Merkel":
                this.leaderTitle = "Chancellor";
                this.leaderType = "Elected";
                break;
            case "Muhammadu Buhari":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Abdel Fattah el-Sisi":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
            case "Cyril Ramaphosa":
                this.leaderTitle = "President";
                this.leaderType = "Elected";
                break;
        }

        this.leaderName = leaderName;
        this.leaderTitle = leaderTitle;
        this.leaderType = leaderType;
    }

    public Leadership() {
        super(continentName, ocean, countryName, capital, population, peoplesName, language, religion, popularfood);
        // set default values for attributes
        this.leaderName;
        this.leaderTitle;
        this.leaderType;
    }


    //Getters and Setters
    public String getLeaderName() {
        return leaderName;
    }
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }
    public String getLeaderTitle() {
        return leaderTitle;
    }
    public void setLeaderTitle(String leaderTitle) {
        this.leaderTitle = leaderTitle;
    }
    public String getLeaderType() {
        return leaderType;
    }
    public void setLeaderType(String leaderType) {
        this.leaderType = leaderType;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Leadership{" +
                "leaderName='" + leaderName + '\'' +
                ", leaderTitle='" + leaderTitle + '\'' +
                ", leaderType='" + leaderType + '\'' +
                '}';
    }

    //bring in continents flyorsail method
    @Override
    public void flyOrSail() {
        if (ocean.equals("Atlantic")) {
            System.out.println("You should sail to " + continentName);
        } else {
            System.out.println("You should fly to " + continentName);
        }
    }

    //bring in countrys colonized method
    @Override
    public void colonized() {
        if (countryName.equals("Mexico") || countryName.equals("United States") || countryName.equals("Canada")
                || countryName.equals("Brazil") || countryName.equals("Argentina")) {
            System.out.println("This country was colonized in the last 500 years");
        } else {
            System.out.println("This country was not colonized in the last 500 years");
        }
    }
    @Override
    public int compareTo(Leadership other) {
        int result = this.leaderName.compareTo(other.leaderName);
        if (result == 0) {
            result = this.leaderName.compareTo(other.leaderName);
        }
        return result;
    }
}