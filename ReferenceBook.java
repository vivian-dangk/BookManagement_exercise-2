
package OOPexercise.Book2;
import java.util.*;

public class ReferenceBook extends Book {
    private double tax;

    public ReferenceBook(double tax, String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {
    }
    @Override
    public void addBook(){
        super.enter();
        System.out.println("Hay nhap thue: ");
        this.tax=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void updateBook(String id){
        super.edit();
        System.out.println("Hay cap nhat thue: ");
        this.tax=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void displayBook(){
        super.display();
        System.out.println("Thue: "+tax);
    }
    @Override
    public double caculateDiscount(){
        double discount=0;
        return discount=super.getQuantity()*super.getUnitPrice()*0.05;
    }
    @Override
    public double caculatetotal(){
        double total=0;
        return total=super.getQuantity()*super.getUnitPrice()+tax-caculateDiscount();
    }
}
