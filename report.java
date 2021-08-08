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

    public Report() {

    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public boolean isIncludeEmployees() {
        return includeEmployees;
    }

    public void setIncludeEmployees(boolean includeEmployees) {
        this.includeEmployees = includeEmployees;
    }

    public boolean isIncludeCheckedOut() {
        return includeCheckedOut;
    }

    public void setIncludeCheckedOut(boolean includeCheckedOut) {
        this.includeCheckedOut = includeCheckedOut;
    }

    public boolean isIncludeDamaged() {
        return includeDamaged;
    }

    public void setIncludeDamaged(boolean includeDamaged) {
        this.includeDamaged = includeDamaged;
    }

    public boolean isIncludeLocation() {
        return includeLocation;
    }

    public void setIncludeLocation(boolean includeLocation) {
        this.includeLocation = includeLocation;
    }

    public boolean isIncludeTransactions() {
        return includeTransactions;
    }

    public void setIncludeTransactions(boolean includeTransactions) {
        this.includeTransactions = includeTransactions;
    }

    public boolean isIncludeTraining() {
        return includeTraining;
    }

    public void setIncludeTraining(boolean includeTraining) {
        this.includeTraining = includeTraining;
    }

    public boolean isIncludeOrders() {
        return includeOrders;
    }

    public void setIncludeOrders(boolean includeOrders) {
        this.includeOrders = includeOrders;
    }

    public Date getSearchStart() {
        return searchStart;
    }

    public void setSearchStart(Date searchStart) {
        this.searchStart = searchStart;
    }

    public Date getSearchEnd() {
        return searchEnd;
    }

    public void setSearchEnd(Date searchEnd) {
        this.searchEnd = searchEnd;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<EquipmentOrder> getEquipmentOrders() {
        return equipmentOrders;
    }

    public void setEquipmentOrders(ArrayList<EquipmentOrder> equipmentOrders) {
        this.equipmentOrders = equipmentOrders;
    }
}