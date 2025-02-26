
package OOPexercise.Book2;
import java.util.*;
public class TextBook extends Book{
    private String status;

    public TextBook(String status, String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        super(bookID, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }
    @Override
    public void addBook(){
        super.enter();
        System.out.println("Hay nhap tinh trang sach (Moi/Cu): ");
        this.status=nhap.nextLine();
    }
    @Override
    public void updateBook(String id){
        super.edit();
        System.out.println("Hay cap nhat tinh trang: ");
        this.status=nhap.nextLine();
    }
    @Override
    public void displayBook(){
        super.display();
        System.out.println("Tinh trang: "+status);
    }
    @Override
    public double caculateDiscount(){
        double dicount=0;
        if(this.status.equalsIgnoreCase("moi")){
            dicount=super.getQuantity()*super.getUnitPrice()*0.1;
        }else if(this.status.equalsIgnoreCase("cu")){
            dicount=super.getQuantity()*super.getUnitPrice()*0.5;
        }
        return dicount;
    }
    @Override
    public double caculatetotal(){
        double total=0;
        return total=super.getQuantity()*super.getUnitPrice()-caculateDiscount();
    }
}
