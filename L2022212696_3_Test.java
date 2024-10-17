import org.junit.Test;
import solution.Solution3;


import static org.junit.Assert.*;

public class L2022212696_3_Test {
    // 测试用例1：测试常规情况下的最大整除子集
    @Test
    public void test1() {
        Solution3 sol = new Solution3();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Integer[] res = {1,2,4,8};
        assertArrayEquals(res, sol.largestDivisibleSubset(arr).toArray());
    }
    // 测试用例2：测试输入数组中没有共同因子的情况
    @Test
    public void test2() {
        Solution3 sol = new Solution3();
        int[] arr = {4,9,25,49};
        Integer[] res = {4};
        assertArrayEquals(res, sol.largestDivisibleSubset(arr).toArray());
    }

    @Test
    public void test3() {
        Solution3 sol = new Solution3();
        int[] arr = {1,3,5,9,15,25,45};
        Integer[] res = {1,5,15,45};
        assertArrayEquals(res, sol.largestDivisibleSubset(arr).toArray());
    }

    @Test
    public void test4() {
        Solution3 sol = new Solution3();
        int[] arr = {1,2,4,8,16,32,64,128,256,512,1024};
        Integer[] res = {1,2,4,8,16,32,64,128,256,512,1024};
        assertArrayEquals(res, sol.largestDivisibleSubset(arr).toArray());
    }
}
