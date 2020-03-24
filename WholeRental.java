/*
* Class Name: WholeRental
* Class Purpose: This is class creates specific objects in relation to whole rentals that are entered into the system. It extends the Rental class and calls the constructor from the class.
* It passes shared attributes to the Rental class constructor using the super key word. 
* Student ID: S0201412
* Student Name: Jack Adams
*/

public class WholeRental extends Rental {
    
    private int numRooms;
    private int numBathrooms;        
    private int garageSpace;
    private int petsAllowed;
    
    
    //Constructor for Whole Rental objects
    public WholeRental(String idOfRental, double pricePerWeek, String detailsOfAddress, String descOfRental, int isFurnished, int roomCount, int bathroomCount, int garage, int pets)
    {
        super(idOfRental,pricePerWeek,detailsOfAddress,descOfRental,isFurnished);
        
        numRooms = roomCount;
        numBathrooms = bathroomCount;
        garageSpace = garage;
        petsAllowed = pets;
    }
    
    //Set methods for Whole Rental specific objects
    public void setNumberOfRooms(int noRooms)
    {
        numRooms = noRooms;
    }
    
    public void setNumberOfBathrooms(int noBathroom)
    {
        numBathrooms = noBathroom;
    }
    
    public void setGarageSpace(int garage)
    {
        garageSpace = garage;
    }
    
    public void setPetsAllowed(int pets)
    {
        petsAllowed = pets;
    }
    
    //Get methods for Whole Rental specific objects
    public int getNumberOfRooms()
    {
        return numRooms;
    }
    
    public int getNumberOfBathrooms()
    {
        return numBathrooms;
    }
    
    public int getGarageSpace()
    {
        return garageSpace;
    }
    
    public int getPetsAllowed()
    {
        return petsAllowed;
    }        
}
