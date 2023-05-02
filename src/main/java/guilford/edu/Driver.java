package guilford.edu;



public class Driver
{
    public static void main( String[] args )
    {
       //Instantiate at least three objects of each subclass
         //and call all the methods from each class

        Country us_country = new Country("North America", "Atlantic", "United States", "Washington D.C.", 325700000);
        System.out.println(us_country.toString());
        us_country.colonized();

        Culture m_culture = new Culture("North America", "Atlantic", "Mexico", "Mexico City", 126200000, "Mexican", "Spanish", "Catholic", "Tacos");
        System.out.println(m_culture.toString());
        m_culture.colonized();

        Leadership b_Leadership = new Leadership();//"North America", "Atlantic", "Brazil", "Brasilia", 209300000, "Brazilian", "Portuguese", "Catholic", "Feijoada", "Jair Bolsonaro", "President", "Elected");
        System.out.println(b_Leadership.toString());
        b_Leadership.colonized();

        //Use the comparable leaderName to sort the objects
        
        //Create an array of 10 objects of Leadership and sort them by leaderName
        Leadership[] leaders = new Leadership[4];
        for (int i = 0; i < leaders.length; i++) {
            leaders[i] = new Leadership();
        }



        

    }
}
