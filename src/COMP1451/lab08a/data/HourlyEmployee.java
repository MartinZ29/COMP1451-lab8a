package COMP1451.lab08a.data;

public class HourlyEmployee {

	private int hoursWorked;
	public final int HOURLY_WAGE = 50;
	
	public HourlyEmployee() {
		super(); 
	}
	
	public HourlyEmployee(int hoursWorked) {
		super();
		this.hoursWorked = hoursWorked;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", HOURLY_WAGE=" + HOURLY_WAGE + "]";
	}
	
	public double calculateMonthlyEarnings(){
		return hoursWorked*HOURLY_WAGE;
	}
}
