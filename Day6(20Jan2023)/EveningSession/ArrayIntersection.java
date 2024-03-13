import java.util.*;
public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> intersectionList = new ArrayList<>();
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersectionList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        return intersectionArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] result = intersect(nums1, nums2);
        System.out.print("Intersection: [");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        sc.close();
    }
}
