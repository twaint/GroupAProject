import java.time.*

public class Equipment {

    private int transactionId;
    private int borrowerId;
    private int equipmentId;

    private String equipmentName;
    private Date checkOutDate;
    private Instant CheckOutTime;
    private Date checkInDate;
    private Instant CheckInTime;
    private boolean isDamaged;

    //Constructor
    public Equipment() {

    }

    //Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Instant getCheckOutTime() {
        return CheckOutTime;
    }

    public void setCheckOutTime(Instant checkOutTime) {
        CheckOutTime = checkOutTime;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Instant getCheckInTime() {
        return CheckInTime;
    }

    public void setCheckInTime(Instant checkInTime) {
        CheckInTime = checkInTime;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }
}