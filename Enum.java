// Enum is a class in java that have some inbuilt methods.
// Enum have some objects in java like Running, Failed, Pending, etc.
enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        // Status[] st = Status.values();
        // for(Status s : st) {
        //     System.out.println(s + " : " + s.ordinal()); // Print the index of objects
        //     }

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("All Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}