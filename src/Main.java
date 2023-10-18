import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{4,5,2,1};
        int[] queries = new int[]{3,10,21};

        System.out.println(Arrays.toString(answerQueries(nums, queries)));

    }

    public static int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(sum + nums[j] <= queries[i])
                {
                    sum += nums[j];
                    count++;
                    answer[i] = count;
                }
            }
        }
        return  answer;
    }
}
