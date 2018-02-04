import org.junit.Before;
import org.junit.Test;

public class AdvancedStreamTest {
    private AdvancedStream advancedStream;

    @Before
    public void setUp() throws Exception {
        advancedStream = new AdvancedStream();
    }

    @Test
    public void toList() {
        advancedStream.toList();
    }

    @Test
    public void groupBy() {
        advancedStream.groupBy();
    }

    @Test
    public void summarizeStats() {
        advancedStream.summarizeStats();
    }

    @Test
    public void stringJoining() {
        advancedStream.stringJoining();
    }
}