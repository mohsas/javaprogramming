/*
Translate a DNS to IP 
*/
import java.net.InetAddress;
public class dnsName{
    public static void main(String[] args){
        try{
                InetAddress addr = InetAddress.getByName("www.wp.pl");  
                String hostname = addr.getHostAddress();
                System.out.println(hostname);
            }
            catch (Exception ex) {  
                System.err.println(ex);  
            }  
    }

}

//InetAddress ia = InetAddress.getByName("46.21.29.40");  
//System.out.println(ia.getHostName());  