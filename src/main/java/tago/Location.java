package tago;
/**
 *
 * @author Roberto Canoff
 */
public class Location {

    public String type;
    public String[] coordinates;
    public Double lat;
    public Double lng;

    public Location() {

    }

    public Location(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String[] coordinates) {
        this.coordinates = coordinates;
    }

}
