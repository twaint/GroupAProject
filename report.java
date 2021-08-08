public class Report {

    private String reportName;

    private boolean includeEmployees;
    private boolean includeCheckedOut;
    private boolean includeDamaged;
    private boolean includeLocation;
    private boolean includeTransactions;
    private boolean includeTraining;
    private boolean includeOrders;

    private Date searchStart;
    private Date searchEnd;

    private ArrayList<Employee> employees;
    private ArrayList<Transaction> transactions;
    private ArrayList<EquipmentOrder> equipmentOrders;


    //Getters and Setters
    public String getReportName(){}

    public void setReportName(String reportName){}

    public boolean isIncludeEmployees(){}

    public void setIncludeEmployees(boolean includeEmployees){}

    public boolean isIncludeCheckedOut(){}

    public void setIncludeCheckedOut(boolean includeCheckedOut){}

    public boolean isIncludeDamaged(){}

    public void setIncludeDamaged(boolean includeDamaged){}

    public boolean isIncludeLocation(){}

    public void setIncludeLocation(boolean includeLocation){}

    public boolean isIncludeTransactions(){}

    public void setIncludeTransactions(boolean includeTransactions){}

    public boolean isIncludeTraining(){}

    public void setIncludeTraining(boolean includeTraining){}

    public boolean isIncludeOrders(){}

    public void setIncludeOrders(boolean includeOrders){}

    public Date getSearchStart(){}

    public void setSearchStart(Date searchStart){}

    public Date getSearchEnd(){}

    public void setSearchEnd(Date searchEnd){}

    public ArrayList<Employee> getEmployees(){}

    public void setEmployees(ArrayList<Employee> employees) {}

    public ArrayList<Transaction> getTransactions(){}

    public void setTransactions(ArrayList<Transaction> transactions){}

    public ArrayList<EquipmentOrder> getEquipmentOrders(){}

    public void setEquipmentOrders(ArrayList<EquipmentOrder> equipmentOrders){}
}