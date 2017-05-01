package MainSrc;

import java.util.Scanner;

public class GiaiPTBacNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaiPhuongTrinhBacNhat();
	}
	
	public static void GiaiPhuongTrinhBacNhat()
	{
		int a, b;
		Scanner vao = new Scanner(System.in);
		System.out.println("nhap vao so nguyen a =");
		a =vao.nextInt();
		System.out.println("nhap vao so nguyen B =");
		b =vao.nextInt();
		vao.close();
		if(a==0)
			if(b==0)
				System.out.println("Phuong Trinh Vo So Nghiem");
			else 
				System.out.println("Phuong Trinh Vo Nghiem");
		else
			System.out.println("Phuong Trinh Co nghiem: x = " +(-b * (1.0 /a)));
	}
}
