import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nama = tampilNama();
        int umur = tampilUmur();
        String status = tampilMenikah();

        System.out.println();
        System.out.println("Hallo "+ nama);
        System.out.println("Usia mu "+ umur + " tahun");
        System.out.print("Dan kamu " + status + " menikah");
    }
    // Untuk mengembalikan nama dari input user
    public static String tampilNama(){
        System.out.print("Masukkan nama Anda: ");
        return scanner.nextLine();
    }
    // Untuk mengembalikan umur dari input user
    public static int tampilUmur(){
        int age;

        // Jika user memasukkan selain bilangan bulat, user akan diminta untuk memasukkan ulang
        while (true) {
            System.out.print("Masukkan umur Anda: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            } else {
                System.out.println("Input tidak sesuai, tolong masukkan ulang berupa bilangan bulat.");
                scanner.next(); // Menghapus sisa input dari buffer
            }
        }

        return age;
    }
    // Untuk mengembalikan status menikah dari input User
    public static String tampilMenikah(){
        boolean isMarried;

        // Jika user memasukkan selain true/false, maka user akan diminta untuk memasukkan ulang
        while (true) {
            System.out.print("Apakah Anda sudah menikah? (true/false): ");
            if (scanner.hasNextBoolean()) {
                isMarried = scanner.nextBoolean(); // Membaca nilai boolean dari input pengguna
                break;
            } else {
                System.out.println("Input tidak sesuai, tolong masukkan ulang berupa true/false");
                scanner.next(); // Menghapus sisa input dari buffer
            }
        }

        if (isMarried){
            return "sudah";
        } else {
            return "belum";
        }
    }
}