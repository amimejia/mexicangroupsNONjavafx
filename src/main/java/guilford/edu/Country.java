package guilford.edu;

public class Country extends Continent {
    protected String countryName;
    private String capital;
    private int population;

    // Constructors
    public Country(String continentName, String ocean, String countryName, String capital, int population) {
        super(continentName, ocean);
        // Choose a random country from the list of 10 countries
        String[] countryNames = { "Mexico", "United States", "Canada", "Brazil", "Argentina", "France", "Germany",
                "Nigeria", "Egypt", "South Africa" };
        int randomCountry = (int) (Math.random() * 10);
        this.countryName = countryNames[randomCountry];

        // Assign capitals to the countries
        switch (countryName) {
            case "Mexico":
                this.capital = "Mexico City";
                break;
            case "United States":
                this.capital = "Washington D.C.";
                break;
            case "Canada":
                this.capital = "Ottawa";
                break;
            case "Brazil":
                this.capital = "Brasilia";
                break;
            case "Argentina":
                this.capital = "Buenos Aires";
                break;
            case "France":
                this.capital = "Paris";
                break;
            case "Germany":
                capital = "Berlin";
                break;
            case "Nigeria":
                this.capital = "Abuja";
                break;
            case "Egypt":
                this.capital = "Cairo";
                break;
            case "South Africa":
                this.capital = "Cape Town";
                break;
        }
        // this.capital = capital;

        // Assign populations to the countries
        switch (countryName) {
            case "Mexico":
                this.population = 126200000;
                break;
            case "United States":
                this.population = 325700000;
                break;
            case "Canada":
                this.population = 36290000;
                break;
            case "Brazil":
                this.population = 207700000;
                break;
            case "Argentina":
                this.population = 43850000;
                break;
            case "France":
                this.population = 67120000;
                break;
            case "Germany":
                this.population = 82670000;
                break;
            case "Nigeria":
                this.population = 186000000;
                break;
            case "Egypt":
                this.population = 95690000;
                break;
            case "South Africa":
                this.population = 55630000;
                break;
        }
        // this.population = population;

    }

    // Getters and Setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        // Do some validation here to make sure countryName is not null
        if (countryName != null && !countryName.isEmpty()) {
            this.countryName = countryName;
        }
    }

    public void setCapital(String capital) {
        if (capital != null && !capital.isEmpty()) {
            this.capital = capital;
        }
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

    // Method to Identify if the country was colonized in the last 500 years
    public void colonized() {
        if (countryName.equals("Mexico") || countryName.equals("United States") || countryName.equals("Canada")
                || countryName.equals("Brazil") || countryName.equals("Argentina")) {
            System.out.println("This country was colonized in the last 500 years");
        } else {
            System.out.println("This country was not colonized in the last 500 years");
        }
    }

    // override the flyOrSail method from the Continent class
    @Override
    public void flyOrSail() {
        if (ocean.equals("Atlantic")) {
            System.out.println("You should sail to " + continentName);
        } else {
            System.out.println("You should fly to " + continentName);
        }

    }

    
    public int compareTo(Country other) {
        int result = this.countryName.compareTo(other.countryName);
        if (result == 0) {
            result = this.capital.compareTo(other.capital);
        }
        return result;
    }
}
