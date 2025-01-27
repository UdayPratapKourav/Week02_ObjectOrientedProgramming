package ridehailingapplication;

// Interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}