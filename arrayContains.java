    public static boolean arrayContains(int[] arr, int value) {
        for (int i : arr) {
            if(i==value)
                return true;
        }
        return false;
    }
