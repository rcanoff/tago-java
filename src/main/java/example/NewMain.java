package example;

import domain.InsertDataResult;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tago.Constant;
import tago.Data;
import tago.Device;
import tago.Listening;
import tago.Location;

/**
 *
 * @author Roberto Canoff
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Device device = new Device("put_your_token_here");
        Device device = new Device("783c0a20-5ef4-11e5-b9c0-5346110eed9a");
        
        ////        Create a variable "data" to be inserted or updated
//        Data data = new Data();
//        data.variable = "teste";
//        data.unit = "%";
//        data.value = "25";
//        data.type = "text";
//        data.time = new Date();
//        data.location = new Location(40.792673, -98.683232);
//
////        Insert example
//        InsertDataResult dataResult = device.insert(data);
//        
////        Update example
//        device.update("put_tye_data_id_here", data);
//        
////        Updates the last record
//        device.update(data);
//
////        Find example
//        List<Data> dataList = device.find(Constant.Find.FILTER, Constant.Filter.TYPE);
//
////        Count example
//        Integer dataCount = device.count();
//
////        Delete passing id as parameter
//        Boolean deleteWithId = device.delete("put_the_data_id_here");
//        
////        Delete without parameters (deletes the last inserted device)
//        Boolean delete = device.delete();
        try {
            new Listening();
        } catch (URISyntaxException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
