
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.ExecutionException;

public class StructuredConcurrency {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var creditScoreTask = scope.fork(() -> {
                System.out.println("Credit check: " + Thread.currentThread());
                Thread.sleep(1000);
                return 750;
            });

            var eVerificationTask = scope.fork(() -> {
                System.out.println("Employment check: " + Thread.currentThread());
                Thread.sleep(2000);
                return "Verified";
            });

            scope.join(); // Wait for all tasks to complete
            scope.throwIfFailed(); // Check for any exceptions

            System.out.println("Employment verification completed: ");
        }
    }
}
