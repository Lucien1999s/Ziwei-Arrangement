package example;

public class heaven {
    public int[] set_heaven(int tianGan_p){
        return switch (tianGan_p) {
            case 1, 6 -> new int[]{3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
            case 2, 7 -> new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
            case 3, 8 -> new int[]{7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
            case 4, 9 -> new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            default -> new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
        };
    }
}
