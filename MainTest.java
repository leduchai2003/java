import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testWithYesChoice() {
        // Tạo một đối tượng Main với đầu vào là "y"
        Main main = new Main();

        // Gọi các phương thức của Main
        main.setInput("y");

        // Kiểm tra liệu phương thức isChoiceYes() trả về true hay không
        assertTrue(main.isChoiceYes());

        // Kiểm tra với số lần lặp là 3
        main.setNumberOfLoops(3);
        assertEquals("Lap lap thu 1\nLap lap thu 2\nLap lap thu 3\n", main.runProgram());
    }

    @Test
    public void testWithNoChoice() {
        // Tạo một đối tượng Main với đầu vào là "n"
        Main main = new Main();

        // Gọi các phương thức của Main
        main.setInput("n");

        // Kiểm tra liệu phương thức isChoiceYes() trả về false hay không
        assertFalse(main.isChoiceYes());

        // Kiểm tra khi không chạy vòng lặp
        assertEquals("End.\n", main.runProgram());
    }
}
