import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class System_out_printf {
	public static void main(String[] args) throws ParseException {

//	Question 1:
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó

		int n = 5;
		System.out.printf("%d", n);
		System.out.println("\n");

//	Question 2:
//		Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//		ra số nguyên đó thành định dạng như sau: 100,000,000

		int a = 100000000;
		System.out.printf(Locale.US, "%,d", a);
		System.out.println("\n");

//	Question 3:
//		Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//		thực đó chỉ bao gồm 4 số đằng sau

		float b = (float) 5.567098;
		System.out.printf("'%.4f'%n", b);
		System.out.println("\n");

//	Question 4:
//		Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//		dạng như sau:
//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.

		String name = "Nguyen Van A";
		System.out.printf("%s %n", "Tên tôi là " + name + " và tôi đang độc thân");
		System.out.println("\n");

//	Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s 

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(format.format(date));
		System.out.println("\n");

//	Question 6:
//		In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//table (giống trong Database)

//Vi du:

		Scanner input = new Scanner(System.in);

		System.out.print("Moi ban nhap vao mot so: ");
		int m = input.nextInt();
		System.out.println("\nBan vua nhap vao so:" + m);


	}
	
	
}