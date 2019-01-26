package location;

import location.model.Location;

import java.util.HashMap;
import java.util.Map;
//Singleton
public class LocationRepository {

    //Instancja singletona
    private static LocationRepository instance = null;

    //Tworzenie singletona
    private Map<Integer, Location> locations;

    //Singleton musi mieć prywatny konstruktor
    private LocationRepository() {
        locations = new HashMap<>();
        locations.put(1, new  Location(1,"Lodz", "92-644", "Rudzka", "9a"));
        locations.put(2, new  Location(2,"Lodz", "90-079-", "Aleksandrowska", "54"));
        locations.put(3, new  Location(3,"Lodz", "91-070-", "Piłsudzkiego", "1"));
        locations.put(4, new  Location(4,"Lodz", "95-175-", "Rydzowa", "15"));
    }
    //pobranie oraz inicjalizacja instancji Singletona
    public static LocationRepository getInstance(){

        if(instance == null){
            synchronized (LocationRepository.class) {
                if(instance == null) {
                    instance = new LocationRepository();
                }
            }
        }
        return instance;
    }

    public void addLocation(Location location){
        locations.put(location.getId(), location);
    }

    public void deleteLocation(Location location){
        locations.remove(location.getId());
    }

    public Location findById(int id){

        return locations.get(id);

    }

}
