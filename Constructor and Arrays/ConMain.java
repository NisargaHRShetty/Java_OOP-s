/*Write a program to store a four countries object into an array and print the name of 
the country with the highest population */

    class Country {
    private String name;
    private long population;
    
    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }
    
    public String getName() {
        return name;
    }
    
    public long getPopulation() {
        return population;
    }
}

public class ConMain {
    public static void main(String[] args) {
        // Create an array to store four countries
        Country[] countries = new Country[4];
        
       
        countries[0] = new Country("Nigeria", 206139589);
        countries[1] = new Country("Pakistan", 220892331);
        countries[2] = new Country("Indonesia", 273523615);
        countries[3] = new Country("Bangladesh", 164689383);
        
        // Initialize variables to track the country with the highest population
        String countryWithHighestPopulation = "";
        long maxPopulation = Long.MIN_VALUE; // Start with the smallest possible long value
        
        // Iterate through the array to find the country with the highest population
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getPopulation() > maxPopulation) {
                maxPopulation = countries[i].getPopulation();
                countryWithHighestPopulation = countries[i].getName();
            }
        }
        
        System.out.println("Country with the highest population: " + countryWithHighestPopulation);
    }
} 
