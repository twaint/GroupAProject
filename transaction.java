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


    //Getters and Setters
    public int getTransactionId(){}

    public void setTransactionId(int transactionId){}

    public int getBorrowerId(){}

    public void setBorrowerId(int borrowerId){}

    public int getEquipmentId(){}

    public void setEquipmentId(int equipmentId){}

    public String getEquipmentName(){}

    public void setEquipmentName(String equipmentName){}

    public Date getCheckOutDate(){}

    public void setCheckOutDate(Date checkOutDate){}

    public Instant getCheckOutTime(){}

    public void setCheckOutTime(Instant checkOutTime){}

    public Date getCheckInDate(){}

    public void setCheckInDate(Date checkInDate){}

    public Instant getCheckInTime(){}

    public void setCheckInTime(Instant checkInTime){}

    public boolean isDamaged(){}

    public void setDamaged(boolean damaged){}
}