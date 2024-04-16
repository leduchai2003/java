import org.junit.Test;
import static org.junit.Assert.*;
import example.Main;

// Import lớp Main vào MainTest nếu nó không ở cùng package
// import com.example.Main;

public class MainTest {

    @Test
    public void testWithYesChoice() {
        // Tạo một đối tượng Main với đầu vào là "y"
        com.example.Main main = new com.example.Main(); // Thay "com.example" bằng package của lớp Main nếu cần

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
        com.example.Main main = new com.example.Main(); // Thay "com.example" bằng package của lớp Main nếu cần

        // Gọi các phương thức của Main
        main.setInput("n");

        // Kiểm tra liệu phương thức isChoiceYes() trả về false hay không
        assertFalse(main.isChoiceYes());

        // Kiểm tra khi không chạy vòng lặp
        assertEquals("End.\n", main.runProgram());
    }
}
