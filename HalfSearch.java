import java.lang.*;
import java.util.*;
public class HalfSearch {
 public static int halfSearch(int a[], int x) {
  int mid, left, right;
  left = 0;
  right = a.length - 1;
   mid = (left + right) / 2;
  while (a[mid] != x) {
   if (x > a[mid]) {
    left = mid + 1;
   }
   else if (x < a[mid]) {
    right = mid - 1;
   }
            mid=(left+right)/2;
  }
  return mid;
 }
 public static void main(String[] args) {
  int a[] = { 12,34,9,-23,45,6,90,123,19,45,34};
  for (int i = 0; i < a.length; i++) {
   System.out.print(a[i] + "  ");
  }
  System.out.println();
   Arrays.sort(a);
  System.out.println("排序之后的数组为：");
   for (int i = 0; i < a.length; i++) {
   System.out.print(a[i] + "  ");
  }
  System.out.println("请输入需要查找的数据");
  Scanner sca = new Scanner(System.in);
        int key = sca.nextInt();
  int index = halfSearch(a, key);
  System.out.println(key + "在数组中的下标是  " + index);
 }
}
