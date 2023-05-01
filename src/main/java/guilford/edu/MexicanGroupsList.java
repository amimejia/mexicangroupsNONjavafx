package guilford.edu;

import java.util.ArrayList;
import java.util.Random;

public class MexicanGroupsList extends ArrayList<MexicanGroups> {
    //Instantiate Random object
    Random rand = new Random();


    //Constructor
    public MexicanGroupsList() {
        super();
        //Assign values to the ArrayList by creating a switch statement
        //and using the Random object to assign a random value
        for (int i = 0; i < 10; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    this.add(new MexicanGroups("Mixes", "Oaxaca Mexico", "Caldo de Gallina"));
                    break;
                case 1:
                    this.add(new MexicanGroups("Tlaxclatecas", "Tlaxcala, Mexico", "Mole Poblano"));
                    break;
                case 2:
                    this.add(new MexicanGroups("Aztecas", "Ciuadad De Mexico, Mexico", "Tacos de Crema con Chile Poblano"));
                    break;
            }
        }
    }
      //add a toString Method to return the values of the ArrayList
      @Override
      public String toString(){
          //go through the list and print
         StringBuilder s = new StringBuilder();
         for (MexicanGroups mexicangroup: this) {
                s.append(mexicangroup.getGroupName()).append(" ").append(mexicangroup.getRegion()).append(" ").append(mexicangroup.getFood()).append("\n");
         }
            return s.toString();
      }

}
