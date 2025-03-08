/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan ekspresi menggunakan class library Java
 * Nama/NIM  : Novia Putri Yustiana 24060123140154
 */

public class ExceptionOnArray {
    public static void main(String[] args){
        // Instansasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
