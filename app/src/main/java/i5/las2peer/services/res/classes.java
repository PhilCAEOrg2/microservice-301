package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class User {

    public User() {}
    
    private boolean loggedIn;

    public void setloggedIn(boolean setValue) {
        this.loggedIn = setValue;
    }

    public boolean getloggedIn() {
        return this.loggedIn;
    }
    private int id;

    public void setid(int setValue) {
        this.id = setValue;
    }

    public int getid() {
        return this.id;
    }
    private String username;

    public void setusername(String setValue) {
        this.username = setValue;
    }

    public String getusername() {
        return this.username;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("loggedIn", this.loggedIn); 
        jo.put("id", this.id); 
        jo.put("username", this.username); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.loggedIn = (1 == ((Long) jsonObject.get("loggedIn")).intValue()); 
        this.id = ((Long) jsonObject.get("id")).intValue(); 
        this.username = (String) jsonObject.get("username"); 

    }

}

    
}
