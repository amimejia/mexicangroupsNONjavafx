package guilford.edu;

public class Culture extends Country implements Comparable<Culture> {
    private String peoplesName;
    private String language;
    private String religion;
    private String popularfood;

    // Constructors
    public Culture(String continentName, String ocean, String countryName, String capital, int population, String peoplesName, String language, String religion, String popularfood) {
        super(continentName, ocean, countryName, capital, population);
        //Choose a random peoplesName from the list of 10 peoplesNames
        String [] peopleNames = {"Mexican", "American", "Canadian", "Brazilian", "Argentinian", "French", "German", "Nigerian", "Egyptian", "South African"};
        int randomPeople = (int) (Math.random() * 10);
        peoplesName = peopleNames[randomPeople];
        //Assign languages to the peoplesNames and religions and popular foods
        switch (peoplesName) {
            case "Mexican":
                language = "Spanish";
                religion = "Catholic";
                popularfood = "Tacos";
                break;
            case "American":
                language = "English";
                religion = "Christian";
                popularfood = "Hamburgers";
                break;
            case "Canadian":
                language = "English";
                religion = "Christian";
                popularfood = "Poutine";
                break;
            case "Brazilian":
                language = "Portuguese";
                religion = "Catholic";
                popularfood = "Feijoada";
                break;
            case "Argentinian":
                language = "Spanish";
                religion = "Catholic";
                popularfood = "Asado";
                break;
            case "French":
                language = "French";
                religion = "Catholic";
                popularfood = "Escargot";
                break;
            case "German":
                language = "German";
                religion = "Christian";
                popularfood = "Schnitzel";
                break;
            case "Nigerian":
                language = "English";
                religion = "Christian";
                popularfood = "Jollof Rice";
                break;
            case "Egyptian":
                language = "Arabic";
                religion = "Muslim";
                popularfood = "Koshari";
                break;
            case "South African":
                language = "Afrikans";
                religion = "Christian";
                popularfood = "Biltong";
                break;
        }

        this.language = language;
        this.religion = religion;
        this.popularfood = popularfood;
    }


    // Getters and Setters
    public String getPeoplesName() {
        return peoplesName;
    }

    public void setPeoplesName(String peoplesName) {
        this.peoplesName = peoplesName;
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

    @Override
    public int compareTo(Culture other) {
        int result = this.peoplesName.compareTo(other.peoplesName);
        if (result == 0) {
            result = this.language.compareTo(other.language);
        }
        return result;
    }
    }
