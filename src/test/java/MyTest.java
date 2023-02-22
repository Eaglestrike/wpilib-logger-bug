import org.junit.jupiter.api.Test;
import edu.wpi.first.wpilibj.DataLogManager;


public class MyTest {
    @Test
    void testLog() {
        DataLogManager.start();
        DataLogManager.getLog().appendString(1, "hello", 0);
    }
}
