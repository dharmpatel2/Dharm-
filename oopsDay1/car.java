package oopsDay1;

public class car {
	private int carid;
	private String cartype;
	private float rent;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public float getRent() {
		return rent;
	}
	public void setRent(float rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "car [carid=" + carid + ", cartype=" + cartype + ", rent=" + rent + "]";
	}
}
