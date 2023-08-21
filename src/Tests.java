import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Tests {
    @Test
    public void pieczywo1() {
        int result = Main.pieczywo(1200, 3);
        assertEquals(1100, result, "12 - 1(3 w cenie 1 zł) = 11");
    }
    @Test
    public void pieczywo2() {
        int result = Main.pieczywo(1200, 4);
        assertEquals(1050, result, "12 - 1.50 = 10.50");
    }
    @Test
    public void pieczywo3() {
        int result = Main.pieczywo(1200, 5);
        assertEquals(1000, result, "12 - 2 = 11.50");
    }
    @Test
    public void mieso1() {
        int result = Main.mieso(1200, 4);
        assertEquals(825, result, "14.99 /16 = 0,936875 |  0,936875 *4 = 3,7475 | 3,7475  = 375");
    }
    @Test
    public void mieso2() {
        int result = Main.mieso(1200, 1);
        assertEquals(1106, result, "12 - 0.94 = 12.07");
    }
    @Test
    public void mieso3() {
        int result = Main.mieso(1500, 16);
        assertEquals(1, result, "15 - 14.99 = 0.01");
    }
    @Test
    public void napoje1(){
        int result = Main.napoje(1200, 3);
        assertEquals(600,result,"12 - (3*2 + 1*0) = 6");
    }
    @Test
    public void napoje2(){
        int result = Main.napoje(1200, 4);
        assertEquals(300,result,"12 - (3*3 + 1*0) = 3");
    }
    @Test
    public void napoje3(){
        int result = Main.napoje(1200, 5);
        assertEquals(0,result,"15 - (3*4 + 1*0) = 0");
    }
}
