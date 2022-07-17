package semicolonAssignments;

public class UnicornPetrolStation {
    private String location;
    private double literBought;
    private final double pricePerLiter = 200;

    public UnicornPetrolStation(String location){
        this.location = location;
    }
    public void setLiterBought(double literBought){
        this.literBought = literBought;
    }
    public double getLiterBought(){
        return literBought;
    }
    public double amount(){
        return pricePerLiter * getLiterBought();
    }
    private   double discount(){
        return amount() * 0.02;
    }
    public  double priceAfterDiscount(){
        return amount() - discount();
    }
}

