package MinCostClimbingStairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        if (size == 2) return Math.min(cost[0], cost[1]);
        int totalCost = 0;
        int i = cost[0] + cost[2] < cost[1] ? 0 : 1;
        while (i < size) {
            totalCost += cost[i];
            System.out.println("Array Index: " + i + "\tArray Element: " + cost[i]);
            if (i == size - 1 || i == size - 2) break;
            if (i == size - 3) {
                i = cost[i] + cost[i + 2] <= cost[i + 1] ? i + 2 : i + 1;
                continue;
            }
            i = cost[i + 1] + cost[i + 3] < cost[i + 2] ? i + 1 : i + 2;
        }
        return totalCost;
    }
}
