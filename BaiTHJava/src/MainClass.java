import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	HinhTron HT =new HinhTron();
	ToaDo TD = new ToaDo();
	System.out.print("Moi ban nhap ban kinh hinh tron: ");
	Scanner sc=new Scanner(System.in);
	float bk = sc.nextFloat();
	HT.setBanKinh(bk);
	System.out.print("Hay nhap vao toa do hinh tron:");
	System.out.print("x= ");
	TD.x=sc.nextInt();
	System.out.print("y=");
	TD.y=sc.nextInt();
	HT.setToaDo(TD);
	HT.setToaDo(TD.x,TD.y);
	HT.xuatBanKinh();
	HT.xuatToaDo();
}
}
