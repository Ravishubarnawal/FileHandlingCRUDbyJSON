package CRUDCliApp;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class LaptopService implements LaptopRepo {
    public void laptopAdd(){
        System.out.println("Enter Laptop no : ");
        int lapId = intObj.nextInt();
        System.out.println("Enter Laptop name: ");
        String lapName = stringObj.nextLine();
        System.out.println("Enter Laptop price :");
        int lapPrice = intObj.nextInt();
        list.add(new Laptop(lapId, lapName, lapPrice));
        System.out.println("Data is created");
    }
    public void laptopPrint(){
        for (Iterator<Laptop> itr = list.iterator(); itr.hasNext();) {
            Laptop l1 = itr.next();
            System.out.println(l1);
        }
    }
    public void laptopSearch(){
        System.out.println("Enter Lap_id to search");
        int lapId = intObj.nextInt();
        for (Iterator<Laptop> itr = list.iterator(); itr.hasNext();) {
            Laptop l1 = itr.next();
            if (l1.getLapId() == lapId) {
                System.out.println(l1);
            }
        }
    }
    public void laptopDelete(){
        System.out.println("Enter Lap_id to Delete");
        int lapId = intObj.nextInt();
        for (Iterator<Laptop> itr = list.iterator(); itr.hasNext();)  {
            Laptop l1 = itr.next();
            if (l1.getLapId() == lapId) {
                itr.remove();
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Data entered is not available");
            }
        }
    }
    public void laptopUpdate(){
        Scanner intObj = new Scanner(System.in);
        Scanner stringObj = new Scanner(System.in);
        System.out.println("Enter Laptop no : ");
        int lapId = intObj.nextInt();
        System.out.println("Enter Laptop name: ");
        String lapName = stringObj.nextLine();
        System.out.println("Enter Laptop price :");
        int lapPrice = intObj.nextInt();
        for (ListIterator ltr = list.listIterator(); itr.hasNext();) {
           Laptop l1 = (Laptop) ltr.next();
            if (l1.getLapId() == lapId) {
                l1.setLapName(lapName);
                l1.setLapPrice(lapPrice);
                System.out.println(l1);
                System.out.println("Data is Updated");
            }
        }
    }

}
