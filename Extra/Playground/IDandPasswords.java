package Extra.Playground;
import java.util.HashMap;

public class IDandPasswords {
    //creating a hashmap as a "sort of database" i mean we could 
    //directly use a db and retrieve data from it but we chose to use hashmaps
    //cuz why noot

    HashMap<String , String> logininfo = new HashMap<String, String>();

    //building our constructor 
    IDandPasswords() {
        logininfo.put("Lamo","passfake123");
        logininfo.put("Riadh","passveryfake123"); 
        logininfo.put("Someone","abc123");

    }
    //getters 
    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
    
}
