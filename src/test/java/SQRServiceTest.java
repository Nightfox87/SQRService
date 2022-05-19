
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void sqrCountCalculateTest(int lowLimit, int highLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCountCalculate(lowLimit, highLimit);

        Assertions.assertEquals(expected, actual);
    }
}
