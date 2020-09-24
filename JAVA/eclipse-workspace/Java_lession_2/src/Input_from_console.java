import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input_from_console {
	public static void main(String[] args) throws ParseException {
//		number();
//		name();
		birthDay();
	}
	
	// number
	public static void number() {

		// Question 1:
		// Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

		// Cach 1: dung ham for
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = { 1, 10, 30 };
		for (int i = 0; i < 3; i++) {

			int x = input.nextInt();
			System.out.println("Ban vua nhap vao so nguyen:" + x);
		}

//		// cach 2: nhap thong thuong
		int a1 = input.nextInt();
		System.out.println("\nSo nguyen thu 1 la:" + a1);
		int a2 = input.nextInt();
		System.out.println("\nSo nguyen thu 2 la:" + a2);
		int a3 = input.nextInt();
		System.out.println("\nSo nguyen thu 3 la:" + a3);
		System.out.println("\nDay so vua nhap la: " + a1 + " " + a2 + " " + " " + a3);

//			Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình	

		float f1 = input.nextFloat();
		System.out.println("\nBan vua nhap vao so thuc:" + f1);
		float f2 = input.nextFloat();
		System.out.println("\nBan vua nhap vao so thuc:" + f2);	
		
	}
	/// Birthday
	public static void birthDay() throws ParseException {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ngay sinh: ");
		String dateInput = scanner1.next();

		String pattern = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date birthday = dateFormat.parse(dateInput);
		System.out.println("Ngay sinh cua ban la:" + birthday);
	}
	
	
		
	/// name
	public static void name() {
		Scanner input = new Scanner(System.in);
	
		// Question 3: Viết lệnh cho phép người dùng nhập họ và tên
		
		// Nhap vao ho:
		
		String lastName = input.nextLine();
		boolean hasNumber = false;
		for (int i = 0; i < lastName.length(); i++) {
			if (Character.isDigit(lastName.charAt(i)) == true) {
				hasNumber = true;
				break;
			}
		}

		if (hasNumber == true) {
			System.out.println("Chuỗi bạn vừa nhập chứa kí tự số, mời bạn nhập lại!");
		} else if(input.nextLine() == ""){
			System.out.println("Ban chua nhap gi ca! Moi ban nhap lai");
		}
		else {
			System.out.println("Ho la: " + lastName);
		}
		
		// Nhap vao ten: 

		String firtName = input.nextLine();
		boolean hasNumber1 = false;
		for (int i = 0; i < firtName.length(); i++) {
			if (Character.isDigit(firtName.charAt(i)) == true) {
				hasNumber1 = true;
				break;
			}
		}

		if (hasNumber1 == true) {
			System.out.println("Chuỗi bạn vừa nhập chứa kí tự số, mời bạn nhập lại!");
		}

		else if (input.nextLine() == "") {
			System.out.println("Ban chua nhap gi ca! Moi ban nhap lai");
		} else {
		
		System.out.println("Ten la: " + firtName);
		}	
	}
	
//		
//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
//	
	
	
	
	
	
	
	
		
	
}