package questions;
import java.util.*;
public class q3 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pencil+pen+eraser;
    System.out.println(total);
    float gst = (total*18)/100;
    System.out.println(gst);
    float finalPrice = total+gst;
    System.out.println(finalPrice);
   } 
}
