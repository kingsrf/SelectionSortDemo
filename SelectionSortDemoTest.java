import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SelectionSortDemoTest {
    
    @Test
    public void testNegativeNumbers() {
        // mix of negative, zero and positive
        Integer[] arr = {-3, 0, 2, -1, 5};
        SelectionSortDemo.selectionSort(arr);
        assertArrayEquals(new Integer[]{-3, -1, 0, 2, 5}, arr,
            "Should correctly sort negative and positive integers"
        );
    }
    
    @Test
    public void testStringSorting() {
        String[] arr = {"delta", "alpha", "bravo", "charlie"};
        SelectionSortDemo.selectionSort(arr);
        assertArrayEquals(new String[]{"alpha", "bravo", "charlie", "delta"},
                            arr, "Should sort strings ");
    }

}
