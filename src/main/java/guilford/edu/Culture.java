package guilford.edu;

public class Culture extends Country{
    private String peoplesName;
    private String language;
    private String religion;
    private String popularfood;

    // Constructors
    public Culture(String continentName, String ocean, String countryName, String capital, int population, String cultureName, String language, String religion, String popularfood) {
        super(continentName, ocean, countryName, capital, population);
        this.peoplesName = cultureName;
        this.language = language;
        this.religion = religion;
    }

    // Getters and Setters
    public String getCultureName() {
        return peoplesName;
    }

    public void setCultureName(String cultureName) {
        this.peoplesName = cultureName;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getPopularfood() {
        return popularfood;
    }
    public void setPopularfood(String popularfood) {
        this.popularfood = popularfood;
    }

    // To String Method
    @Override
    public String toString() {
        return "Culture{" +
                "cultureName='" + peoplesName + '\'' +
                ", language='" + language + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }

    // override the flyOrSail method from the Continent class
    @Override
    public void flyOrSail() {
        if (ocean == "Atlantic") {
            System.out.println("You should sail to " + continentName);
        } else {
            System.out.println("You should fly to " + continentName);
        }
    }

    //override the colonized method from the Country class
    @Override
    public void colonized() {
        if (countryName == "Mexico" || countryName == "United States" || countryName == "Canada" || countryName == "Brazil" || countryName == "Argentina") {
            System.out.println("This country was colonized in the last 500 years");
        } else {
            System.out.println("This country was not colonized in the last 500 years");
        }
    }
    
}
