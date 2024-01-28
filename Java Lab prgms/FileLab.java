import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

 class FileInfo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");

            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }

            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }

            if (file.isDirectory()) {
                System.out.println("File is a directory.");
            } else if (file.isFile()) {
                System.out.println("File is a regular file.");
            }

            System.out.println("File length: " + file.length() + " bytes");

            try (FileInputStream fis = new FileInputStream(file)) {
                System.out.println("File content:");
                int data;
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
        scanner.close();
    }
}
