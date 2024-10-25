import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        System.out.print("Enter the arry values : ");
        for (int i=0; i<size; i++)
        {
            nums[i]=sc.nextInt();
        }
        
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        
        System.out.print(Arrays.toString(twoSum(nums, target)));
        
    }
    public static int[] twoSum(int[] nums, int target) 
    {

        int[] arr = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];

            if (map.containsKey(complement))
            {
                arr[0] = map.get(complement);
                arr[1] = i;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
