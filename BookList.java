
package OOPexercise.Book2;
import java.util.*;
import java.text.*;
public class BookList {
    Scanner nhap=new Scanner(System.in);
    ArrayList<Book> danhsach=new ArrayList<>();
    public void aadBook(){
        System.out.println("Hay nhap so luong sach: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Hay nhap de phan loai (Text book/Reference book): ");
            String loai=nhap.nextLine();
            if(loai.equalsIgnoreCase("text book")){
                TextBook mytb=new TextBook();
                mytb.addBook();
                danhsach.add(mytb);
            }else if(loai.equalsIgnoreCase("reference book")){
                ReferenceBook myrb=new ReferenceBook();
                myrb.addBook();
                danhsach.add(myrb);
            }
        }
    }
    public void updateBook(String id){
        for(Book myb: danhsach){
            myb.updateBook(id);
        }
    }
    public void deleteBook(String id){
        for(int i=danhsach.size()-1;i>=0;i--){
            if(danhsach.get(i).getBookID().equalsIgnoreCase(id)){
                danhsach.remove(i);
            }
        }
    }
    public Book findID(String id){
        for(Book myb: danhsach){
            if(myb.getBookID().equalsIgnoreCase(id)){
                return myb;
            }
        }
        return null;
    }
    public double Total(){
        double total=0;
        for(Book myb: danhsach){
            total+=myb.caculatetotal();
        }
        return total;
    }
    public void displayAll(){
        for(Book myb: danhsach){
            myb.displayBook();
        }
    }
}
