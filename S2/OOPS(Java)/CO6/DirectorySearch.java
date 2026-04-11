import java.io.File;
import java.util.Scanner;
public class DirectorySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid Directory");
            sc.close();
            return;
        }
        System.out.println("\nFiles and Subdirectories:");
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("[DIR]  " + f.getName());
            } else {
                System.out.println("[FILE] " + f.getName());
            }
        }
        System.out.print("\nEnter file name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (File f : list) {
            if (f.getName().equals(search)) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("File Found");
        } else {
            System.out.println("File Not Found");
        }
        sc.close();
    }
}
