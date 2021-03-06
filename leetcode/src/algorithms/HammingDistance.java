package algorithms;

/**
 * 汉明距离
 *
 * @author samin
 * @date 2021-01-11
 */
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        // 异或计算不同
        int diff = x ^ y;

        int res = 0;
        // 计算不同的数量
        while (diff != 0) {
            res = res + (diff & 1);
            diff = diff >> 1;
        }

        return res;
    }
}
