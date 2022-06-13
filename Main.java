
class Main {
  public static void main(String[] args) {



String words2[] = {"apple", "banana", "peach", "cherries", "bluebereies"};

for (int i = 0; i<words2.length; i++)
{
  String first =words2[i].substring(0,1);
  String last = words2[i].substring((words2.length-2), (words2.length-1));

  System.out.println("Index Value " + i + " : " + words2[i] + " " + first + " " + last);
}

int[] nums= {12,65, 80,70,34, 22};
{
nums[3] = 99;
}


for (int i =0 ; i < nums.length; i ++)
{
  System.out.print (nums[i] + " ");
}

for (int i=0; i < nums.length-1; i++)
{
  nums[i] = nums[i+1];

}
System.out.println();
for( int i = 0; i < nums.length;  i ++)
{
  System.out.println(nums[i] + " ");
}
  }
}