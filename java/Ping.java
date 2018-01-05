
import java.net.InetAddress;


public class Ping {

   public static void main(String[] args){
   
      for (int i = 0; i < args.length; i++){
      
         boolean reachable = false;
      
         try {
            reachable = InetAddress.getByName(args[i]).isReachable(5000);
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      
         System.out.println(args[i] + " " + ((reachable) ? "Host is reachable" : "Host is not reachable"));
      
      }
   }
}