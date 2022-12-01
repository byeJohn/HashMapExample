import java.util.*;

public class Maps {
   public static void main(String[] args) {

   HashMap<String, Integer> lotTicket = new HashMap <>();

   // Name, Lottery Ticket Number
   lotTicket.put("Loi", 202337465);
   lotTicket.put("Tina", 228521456);
   lotTicket.put("Ngwe", 117452842);
   lotTicket.put("Kevin", 773526438);
   lotTicket.put("John", 143647164);

   System.out.println(lotTicket);
   /** Output:
   {Kevin=773526438, Ngwe=117452842, Loi=202337465,
    John=143647164, Tina=228521456}
   **/

   System.out.println(lotTicket.get("John"))
   /** Output:
   143647164
   **/

   // John, 143647164 is now John, 0
   lotTicket.put("John",0);

   System.out.println(lotTicket);
   /** Output:
   {Kevin=773526438, Ngwe=117452842, Loi=202337465,
    John=0, Tina=228521456}
   **/ 

   // Removes Loi, 202337465
   lotTicket.remove("Loi");

   System.out.println(lotTicket);
   /** Output:
   {Kevin=773526438, Ngwe=117452842,
    John=0, Tina=228521456}

   }
}
