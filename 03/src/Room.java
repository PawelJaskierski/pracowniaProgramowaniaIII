public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    Room(int number){
        this.number = number;
        this.beds = 2;
    }
    Room(int beds, int number){
        this.beds = beds;
        this.number = number;
        this.occupied = false;
    }
    void Checkin(String gusetName){
        this.guestName = gusetName;
        this.occupied = true;
    }
    void Checkout(){
        this.guestName = "";
        this.occupied = false;
    }
    boolean IsOccupied(){
        return occupied;
    }
    @Override
    public String toString(){
        return String.format("Number: %d Number of beds: %d",number,beds);
    }
}
