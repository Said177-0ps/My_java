package File;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        File myfile= new File("C:\\Users\\User\\Documents\\For the Java theme File");
        File folder1= new File("C:\\Users\\User\\Documents\\For the Java theme File\\Folder-1");
        File txtfile= new File("C:\\Users\\User\\Documents\\For the Java theme File\\Folder-1\\hello from folder-1");
        File folder2= new File("C:\\Users\\User\\Documents\\For the Java theme File\\Folder-2");

        //------------
        System.out.println("Directory myfile" + myfile.isDirectory());
        System.out.println("Directory folder1" + folder1.isDirectory());
        System.out.println("Directory txtfile" + txtfile.isDirectory());
        System.out.println("Directory folder2" + folder2.isDirectory());
        //------------
        System.out.println("Absolute Path" + myfile.getAbsolutePath());
        System.out.println("File name" + txtfile.getName());
        System.out.println("Last modified" + txtfile.lastModified());
        System.out.println("Folder 2 exists" + folder2.exists());
        System.out.println("Folder 2 delete" + folder2.delete());
        System.out.println("Folder 2 exists" + folder2.exists());
    }
}
