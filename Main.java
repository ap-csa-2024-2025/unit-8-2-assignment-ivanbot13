import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double[] arr = {2.0, 2.1, 9.6, 7.5, 4.3};
    System.out.println(sumArray(arr));

    String[] str = {"Pee", "Pee", "Henry"};
    System.out.println(averageLength(str));

    int[] num = {2, 4, 3, 5, 2, 7, 1, 9, 6};
    System.out.println(arrayMax(num));

    System.out.println(linearSearch(str, "Henry"));
    System.out.println(linearSearch(str, "Bill"));
  }


  public static double sumArray(double[] arr)
  {
    int sum = 0; 
    for (double num : arr){
      sum += num;
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double avg = 0.0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i].length();
    }
    avg = ((double) sum ) / arr.length;
    return avg;
  }

  public static int arrayMax(int[] arr)
  {
    int max = 0;
    for (int num : arr){
      if (num > max){
        max = num;
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++){
      if (arr[i].equals(target)){
        return true;
      }
    }
    return false;
  }
}
