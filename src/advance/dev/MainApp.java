package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Nhap vao so luong sinh vien: ");
		i = sc.nextInt();
		Student a[] = new Student[i];
		input(a);
		sortAvr(a);
		print(a);
		
	}
	
	public static void input(Student a[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = new Student();
			System.out.println(String.format("Nhap thong tin sinh vien thu %d", i+1));
			System.out.println("Ten: ");
			String name = sc.nextLine();
			a[i].setName(name);
			System.out.println("Tuoi: ");
			int tuoi = sc.nextInt();
			a[i].setAge(tuoi);
			System.out.println("Dia chi: ");
			String diaChi = sc.nextLine();
			a[i].setAddress(diaChi);
			sc.nextLine();
			System.out.println("So dien thoai: ");
			String soDT = sc.nextLine();
			a[i].setPhoneNumb(soDT);
			System.out.println("Diem trung binh: ");
			double diemTB = sc.nextDouble();
			a[i].setDiemTB(diemTB);
			sc.nextLine();
		}
	}
	
	public static void print(Student a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(String.format("Ten: %s - Tuoi: %d - Dia chi: %s - SDT: %s - DTB: %.2f", a[i].getName(),a[i].getAge(),a[i].getAddress(),a[i].getPhoneNumb(),a[i].getDiemTB()));
		}
	}
	
	public static void sortAvr(Student a[]) {
		double tmp;
		for (int i = 0; i < a.length - 1; i++ ) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].getDiemTB() > a[j].getDiemTB()) {
					tmp = a[i].getDiemTB();
					a[i].setDiemTB(a[j].getDiemTB());
					a[j].setDiemTB(tmp);
					
				}
			}
		}
	}
}

