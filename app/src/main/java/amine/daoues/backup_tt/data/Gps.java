package amine.daoues.backup_tt.data;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by macbookpro on 29/10/15.
 */
@ParseClassName("Gps")
public class Gps extends ParseObject{
    public Integer getId(){
        return Integer.getInteger("id");
    }
    public void setId(Integer id){
        put("id",id);
    }
    public String getFirstName(){
        return getString("firstName");
    }
    public void setFirstName(String firstName){
        put("firstName",firstName);
    }
    public String getLatitude() { return getString("latitude"); }
    public void setLatitude(String latitude){
        put("latitude",latitude);
    }
    public String getLongitude() { return getString("longitude"); }
    public void setLongitude(String longitude){
        put("longitude",longitude);
    }
    public Gps() {
    }
    public Gps(String theClassName) {
        super(theClassName);
    }
    public void play() {
        // Ah, that takes me back!
    }
    public static ParseQuery<Gps> getQuery() {
        return ParseQuery.getQuery(Gps.class);
    }
}
