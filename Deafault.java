/* Default method simply means that we know in interface only abstract method(without method bodies)
are allowed if we add some more method in interface we have to implement this method in inherited class
which breaks code functionality in order to rectify java introduce default method concept.
*/
interface Camera {
    private void Dslr() {
        System.out.println("4K 120 FPS recording");
    }
    void takeSnap();
    void recordVideo();
    default void record4KVideo() {
        Dslr();
        System.out.println("Recording in 4K video");
    }
}

interface Wifi {
    String [] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi {
    public void takeSnap() {
        System.out.println("Snap...");
    }
    public void recordVideo() {
        System.out.println("Record Video");
    }
    // @Override
    // public void record4KVideo() {
    //     System.out.println("SONY_Recording in 4k");
    // }
    public String [] getNetworks() {
        System.out.println("Getting list of Networks");
        String[] networkList =  {"Rishabh" , "Satwik", "Prakash"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

public class Deafault {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        ms.record4KVideo();
        String arr[] = ms.getNetworks();
        for(String item : arr) {
            System.out.println(item);
        }
    }
}