// package OOP.src;

// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {

//         // gaji pokok
//         // lembur (jam)
//         // gajiPerJam
//         // int salary = 50_000;
//         // int overtime = 5;
//         // int payPerHour = 100;

//         // hitung jumah gaji -> gaji pokok + (gajiPerJam * lembur)
//         Scanner scanner = new Scanner(System.in);
//         Employee orang = new Employee(50_000, 100);
//         Employee person = new Employee(10_000);

//         // int overtime = scanner.nextInt();

//         System.out.println(Employee.employeeCount);

//         // Buat Tampilan menu 
//         //   1. Tambah Buah
//         //   2. List Buah 
//         //   3. Exit 

//         // Buah -> Nama, Harga,Stock 

//     }

//     public static int calculateWage(int salary, int overtime, int payPerHour) {
//         return salary + (overtime * payPerHour);
//     }

//     public static void testing() {
//         System.out.println("Testing 123");
//     }
// }

package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("========== MAIN MENU ==========");
            System.out.println("1. Tambah buah");
            System.out.println("2. List buah");
            System.out.println("3. Exit");
            String mainMenuOption = scanner.next();

            if (mainMenuOption.equals("1")) {
                Menu.tambahBuah();
            } else if (mainMenuOption.equals("2")) {
                Menu.tampilListBuah();
            } else {
                break;
            }
        }
    }

}