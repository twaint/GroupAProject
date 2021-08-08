public class Order {

    private int orderId;
    private String equipmentName;
    private Date orderStartDate;
    private Date orderEndDate;
    private Instant orderStartTime;
    private Instant orderEndTime;
    private String equipmentStartLocation;
    private String equipmentDeliveryLocation;
    private Equipment equipmentTransferred;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public Instant getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Instant orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Instant getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Instant orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getEquipmentStartLocation() {
        return equipmentStartLocation;
    }

    public void setEquipmentStartLocation(String equipmentStartLocation) {
        this.equipmentStartLocation = equipmentStartLocation;
    }

    public String getEquipmentDeliveryLocation() {
        return equipmentDeliveryLocation;
    }

    public void setEquipmentDeliveryLocation(String equipmentDeliveryLocation) {
        this.equipmentDeliveryLocation = equipmentDeliveryLocation;
    }

    public Equipment getEquipmentTransferred() {
        return equipmentTransferred;
    }

    public void setEquipmentTransferred(Equipment equipmentTransferred) {
        this.equipmentTransferred = equipmentTransferred;
    }
}