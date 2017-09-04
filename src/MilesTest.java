import org.junit.Assert;

public class MilesTest {
    @org.junit.Test
    public void milesPerHour() throws Exception {
        double expectHours = (45/60) + (30/3600);
        double expectResult = Miles.milesPerHour(14, expectHours);
        System.out.print(expectResult);
    }

}