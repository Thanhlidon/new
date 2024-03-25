package people;

public class Emfulltime extends Employee {
	public final float LUONG_MOTGIO_FULLTIME=50;
	public final float HE_SO_LUONG=1.75f;
	public final int  GIO_FULLTIME=10;
	public void Nhapft() {
		super.nhapTT();
	}
	public void Inft() {
		super.inTT();
	}
	public float Luong_Cung() {
		 Salary=LUONG_MOTGIO_FULLTIME*GIO_FULLTIME*Day;
		 return Salary;
}
    public float Luong_Mem(float HE_SO_LUONG) {
    	Salary=Luong_Cung()*HE_SO_LUONG;
    	return Salary;
    }
}