
package OOPexercise.Book2;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        BookList danhsach=new BookList();
        while(true){
            System.out.println("Hay chon cac tac vu: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. Cap nhat thong tin.");
            System.out.println("3. Xoa sach theo ID.");
            System.out.println("4. Tim sach theo ID.");
            System.out.println("5. Tong tien.");
            System.out.println("6. In thong tin.");
            System.out.println("7. Thoat.");
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: 
                    danhsach.aadBook();
                    break;
                case 2: 
                    System.out.println("Hay nhap ID sach can cap nhat: ");
                    String id=nhap.nextLine();
                    danhsach.updateBook(id);
                    break;
                case 3:
                    System.out.println("Hay nhap ID sach can xoa: ");
                    String Id=nhap.nextLine();
                    danhsach.deleteBook(Id);
                    break;
                case 4: 
                    System.out.println("Hay nhap ID sach can tim: ");
                    String ID=nhap.nextLine();
                    if(danhsach.findID(ID)!=null){
                        System.out.println("Da tim thay.");
                        danhsach.findID(ID);
                    }else{
                        System.out.println("Khong tim thay ID nay.");
                    }
                    break;
                case 5: 
                    System.out.println("Tong tien tat ca sach hien co: "+danhsach.Total());
                    break;
                case 6: 
                    danhsach.displayAll();
                    break;
                case 7: 
                    System.out.println("Dang thoat!!!!!");
                    System.out.println("Bye..................");
                default: 
                    System.out.println("Khong tim thay thao tac nay, hay nhap lai.");
            }
            if(chon==7){
                break;
            }
        }
    }
}
