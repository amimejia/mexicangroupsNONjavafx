package guilford.edu;

public class Country extends Continent {
    protected String countryName;
    private String capital;
    private int population;


    // Constructors
    public Country(String continentName, String ocean, String countryName, String capital, int population) {
        super(continentName, ocean);
        //Choose a random country from the list of 10 countries
        String[] countryNames = {"Mexico", "United States", "Canada", "Brazil", "Argentina", "France", "Germany", "Nigeria", "Egypt", "South Africa"};
        int randomCountry = (int) (Math.random() * 10);
        countryName = countryNames[randomCountry];

        //Assign capitals to the countries
        switch (countryName) {
            case "Mexico":
                capital = "Mexico City";
                break;
            case "United States":
                capital = "Washington D.C.";
                break;
            case "Canada":
                capital = "Ottawa";
                break;
            case "Brazil":
                capital = "Brasilia";
                break;
            case "Argentina":
                capital = "Buenos Aires";
                break;
            case "France":
                capital = "Paris";
                break;
            case "Germany":
                capital = "Berlin";
                break;
            case "Nigeria":
                capital = "Abuja";
                break;
            case "Egypt":
                capital = "Cairo";
                break;
            case "South Africa":
                capital = "Cape Town";
                break;
        }
        this.capital = capital;

        //Assign populations to the countries
        switch (countryName) {
            case "Mexico":
                population = 126200000;
                break;
            case "United States":
                population = 325700000;
                break;
            case "Canada":
                population = 36290000;
                break;
            case "Brazil":
                population = 207700000;
                break;
            case "Argentina":
                population = 43850000;
                break;
            case "France":
                population = 67120000;
                break;
            case "Germany":
                population = 82670000;
                break;
            case "Nigeria":
                population = 186000000;
                break;
            case "Egypt":
                population = 95690000;
                break;
            case "South Africa":
                population = 55630000;
                break;
        }
        this.population = population;

    }

    // Getters and Setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    // To String Method
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }
    //Method to Identify if the country was colonized in the last 500 years
    public void colonized() {
        if (countryName == "Mexico" || countryName == "United States" || countryName == "Canada" || countryName == "Brazil" || countryName == "Argentina") {
            System.out.println("This country was colonized in the last 500 years");
        } else {
            System.out.println("This country was not colonized in the last 500 years");
        }
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
}
