public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
                System.out.println(args[0] + args[1]);
                
            Runtime rt1 = Runtime.getRuntime();
            Process pr1 = rt1.exec("arp -s " + args[0] + " " + args[1]);
            
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

}
