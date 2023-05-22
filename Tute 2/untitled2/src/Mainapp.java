import java.util.*;

public class Mainapp {

    public static void main(String[] args) {

        Myqueue myqueue = new Myqueue(5);
        Scanner scanner = new Scanner(System.in);

        int inputStr;

        for(int i= 0; i < 5; i++) {
            System.out.println("Enter transaction ID : ");
            inputStr = scanner.nextInt();
            myqueue.insert(inputStr);
        }

//        myqueue evenQueue = new myqueue(5);
//        myqueue oddQueue = new myqueue(5);
//
//        int value;
//
//        while(!myqueue.isEmpty()) {
//            value = myqueue.remove();
//            if(value % 2 == 0) {
//                evenQueue.insert(value);
//            }
//            else {
//                oddQueue.insert(value);
//            }
//        }
//
//        while(!evenQueue.isEmpty()) {
//            System.out.println("Transaction : " + evenQueue.remove());
//        }
//
//        while(!oddQueue.isEmpty()) {
//            System.out.println("Transaction : " + oddQueue.remove());
//        }

    }

}