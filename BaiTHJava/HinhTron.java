
public class HinhTron {
float r;
ToaDo toaDo;
void setBanKinh(float r) {
	this.r=r;
}
void setToaDo(ToaDo toaDo) {
	this.toaDo=toaDo;
}
void setToaDo(int x,int y) {
	this.toaDo=new ToaDo();
	this.toaDo.x=x;
	this.toaDo.y=y;
}
void xuatBanKinh() {
	System.out.print("Ban kinh hinh tron:  "+this.r);
	
}
void xuatToaDo() {
	System.out.print("Toa do hinh tron: ");
	System.out.print("x= "+this.toaDo.x);
	System.out.print("y= "+this.toaDo.y);
}
}
