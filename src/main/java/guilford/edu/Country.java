package guilford.edu;

public class Country extends Continent {
    public String countryName;
    public String capital;
    public int population;

    // Constructors
    public Country(String continentName, String ocean, String countryName, String capital, int population) {
        super(continentName, ocean);

        // Assign capitals to the countries and population
        switch (countryName) {
            case "Mexico":
                capital = "Mexico City";
                population = 126200000;
                break;
            case "United States":
                capital = "Washington D.C.";
                population = 325700000;
                break;
            case "Canada":
                capital = "Ottawa";
                population = 36290000;
                break;
            case "Brazil":
                capital = "Brasilia";
                population = 207700000;
                break;
            case "Argentina":
                capital = "Buenos Aires";
                population = 43850000;
                break;
            case "France":
                capital = "Paris";
                population = 43850000;
                break;
            case "Germany":
                capital = "Berlin";
                population = 67120000;
                break;
            case "Nigeria":
                capital = "Abuja";
                population = 186000000;
                break;
            case "Egypt":
                capital = "Cairo";
                population = 95690000;
                break;
            case "South Africa":
                capital = "Cape Town";
                population = 55630000;
                break;
        }
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        
        
        

    }
    //empty constructor
    // public Country() {
    //     super("", ""); // Call the parent class' empty constructor
    // this.countryName = "";
    // this.capital = "";
    // this.population = 0;
    // }
    
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
