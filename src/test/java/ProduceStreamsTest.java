import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ProduceStreamsTest {

    private ProduceStreams streamProducer;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        streamProducer = new ProduceStreams();
    }

    @Test
    public void fromList() {
        streamProducer.fromList();
    }

    @Test
    public void streamOf() {
        streamProducer.streamOf();
    }

    @Test
    public void intStreamRange() {
        streamProducer.intStreamRange();
    }

    @Test
    public void arraysStream() {
        streamProducer.arraysStream();
    }

    @Test
    public void mapToInt() {
        streamProducer.mapToInt();
    }

    @Test
    public void mapToObject() {
        streamProducer.mapToObject();
    }

    @Test
    public void sorting() {
        streamProducer.sorting();
    }

    @Test
    public void reusingFail() {
        thrown.expect(IllegalStateException.class);
        streamProducer.reusingFail();
    }

    @Test
    public void reusingProvider() {
        streamProducer.supplier();
    }
}