package dates;

/**
 *
 * @author Emma Edgar
 */
public class TestException {

    public static void main(String[] args) {
        int[] nums = {1, 4, 8};

        try {
            System.out.println(nums[getValue(5, nums)]);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    public static int getValue(int index, int[] nums) {
        if (index >= nums.length) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return index;
    }
}
