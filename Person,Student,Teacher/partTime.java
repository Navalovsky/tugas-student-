public class partTime {
    private int hoursworked;
    private int setSalary;

    public partTime() {
        super();
        hoursworked = 0;
        setSalary = 0;
    }
    public partTime(int hoursworked, int setSalary) {
        this.hoursworked = hoursworked;
        this.setSalary = setSalary;
    }

    public void print() {
        System.out.println("Hours worked: "+hoursworked);
        System.out.println("Set salary: "+setSalary);
    }
}
