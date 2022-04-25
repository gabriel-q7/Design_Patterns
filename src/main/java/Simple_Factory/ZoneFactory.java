package Simple_Factory;

public class ZoneFactory {
    public Zone createZone(String zoneId) {

        if(zoneId.equals("US/Pacific")) {
            return new ZonePacific();
        }
        else if(zoneId.equals("US/Mountain")) {
            return new ZoneMountain();
        }
        else if(zoneId.equals("US/Central")) {
            return new ZoneCentral();
        }
        else if(zoneId.equals("US/Eastern")) {
            return new ZoneEastern();
        }
        else return null;
    }
}
