import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Testing {

    @Test
    public void tGetPerimeterR()
    {
        double P = getPerimeter(3, 2);
        assertEquals(P, 10);
    }
    @Test
    public void tGetAreaR()
    {
        double A = getArear(3,2);
        assertEquals(A, 6);
    }

}
