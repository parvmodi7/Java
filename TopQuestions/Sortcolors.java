package TopQuestions;

public class Sortcolors {

    public static void colors(int nums[])
    {
            int k=0;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[j]==nums[i])
                    {
                        nums[k]=nums[i];
                        k++;
                    }
                }
            }
    }
    public static void main(String args[])
    {
        int nums[]={2,0,2,1,1,0};
        colors(nums);

        for(int i=0;i<nums.length;i++)
        {
            System.err.print(nums[i]);
        }
    }
}
