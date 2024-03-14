import java.util.*;


public class intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        
        
        for (int num : nums1) {
            list1.add(num);
        }
        
        for (int num : nums2) {
            if (list1.contains(num)) {
                result.add(num);
                list1.remove(Integer.valueOf(num)); 
            }
        }
        
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        
        return intersection;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        intersection solution = new intersection();

        System.out.print("Enter the size of nums1 array: ");
        int size1 = scanner.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of nums1 array:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of nums2 array: ");
        int size2 = scanner.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of nums2 array:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = scanner.nextInt();
        }

        int[] intersection = solution.intersect(nums1, nums2);
        System.out.print("Intersection of the arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
