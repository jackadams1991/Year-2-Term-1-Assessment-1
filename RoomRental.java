/*
* Class Name: RoomRental
* Class Purpose: This is class creates specific objects in relation to room rentals that are entered into the system. It extends the Rental class and calls the constructor from the class.
* It passes shared attributes to the Rental class constructor using the super key word.
* Student ID: S0201412
* Student Name: Jack Adams
*/

public class RoomRental extends Rental {
    
    private int couplesAllowed;
    private int attachedBathroom;
    
    
    //Constructor for Room Rentals objects    
    public RoomRental(String idOfRental, double pricePerWeek, String detailsOfAddress, String descOfRental, int isFurnished, int allowCouples, int bathroomAttached)
    {
        super(idOfRental, pricePerWeek,detailsOfAddress,descOfRental,isFurnished);
        couplesAllowed = allowCouples;
        attachedBathroom = bathroomAttached;
    }    
    
    //Set methods for Room Rental specific objects
    public void setCouplesAllowed(int couples)
    {
        couplesAllowed = couples;
    }
    
    public void setAttachedBathroom(int bathroom)
    {
        attachedBathroom = bathroom;
    }
    
    //Get methods for Room Rental specific objects
    public int getCouplesAllowed()
    {
        return couplesAllowed;
    }
    
    public int getAttachedBathroom()
    {
        return attachedBathroom;
    }        
}
