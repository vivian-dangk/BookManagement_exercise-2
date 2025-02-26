
package OOPexercise.Book2;
import java.util.*;
import java.text.*;
public abstract class Book implements IBook{
    Scanner nhap=new Scanner(System.in);
    SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");
    private String bookID;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;

    public Book(String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public Book(){
        
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getBookID() {
        return bookID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }
    
    @Override
    public void addBook(){
    }
    @Override
    public void updateBook(String id){
    }
    @Override
    public double caculatetotal(){
        return 0;
    }
    @Override
    public void displayBook(){
    }
    public double caculateDiscount(){
        return 0;
    }
    public void enter(){
        System.out.println("Hay nhap ID sach: ");
        this.bookID=nhap.nextLine();
        System.out.println("Hay nhap NXB: ");
        this.publisher=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay nhap ngay xuat: ");
                this.entryDate=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai, hay nhap lai.");
            }
        }
        System.out.println("Hay nhap gia niem yet: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay nhap so luong: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    public void edit(){
        System.out.println("Hay cap nhat ID sach: ");
        this.bookID=nhap.nextLine();
        System.out.println("Hay cap nhat NXB: ");
        this.publisher=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay cap nhat ngay xuat: ");
                this.entryDate=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai, hay nhap lai.");
            }
        }
        System.out.println("Hay cap nhat gia niem yet: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay cap nhat so luong: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    public void display(){
        System.out.println("ID: "+bookID+", NXB: "+publisher+", ngay: "+bd.format(entryDate));
        System.out.println("Gia: "+unitPrice+", so luong: "+quantity);
    }
}
