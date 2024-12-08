

public static int findFirstDuplicate(int[] arr) {
    Set<Integer> seen = new HashSet<>();

    for (int num : arr) {
        if (!seen.add(num)) {
            return num; // duplicate found
        }
    }
    return -1; // no duplicates found
}

public static int findFirstDuplicate(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(arr[i])) {
            return arr[i]; // duplicate found
        } else {
            map.put(arr[i], i);
        }
    }
    return -1; // no duplicates found
}