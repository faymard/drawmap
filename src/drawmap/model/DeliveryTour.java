package drawmap.model;

import drawmap.util.XMLParser;

import java.util.*;

/**
 * 
 */
public class DeliveryTour extends Observable{

    /**
     * Default constructor
     */
    public DeliveryTour() {
    }

    /**
     * 
     */
    private List<Request> requests = new ArrayList<Request>();
    private Date departureTime;

    public Intersection getOrigin() {
        return origin;
    }

    public void setOrigin(Intersection origin) {
        this.origin = origin;
    }

    private Intersection origin;

    public void read(String filename, CityMap cm){
        this.requests = new ArrayList<Request>();
        XMLParser parser = new XMLParser();
        parser.parseTour(filename, this, cm);
        setChanged();
        notifyObservers();
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void addRequest(Request r) {
        requests.add(r);
    }

    public void removeRequest(Request r) { requests.remove(r); }

    public Date getDepartureTime(){
        return  departureTime;
    }

    public void setDepartureTime(Date d){
        departureTime = d;
    }

    public Iterator getRequestIterator() {
        return requests.iterator();
    }

    public void removeAllRequests(){
        requests.removeAll(requests);
        origin = null;
    }

}