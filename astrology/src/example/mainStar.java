package example;

public class mainStar {
    String ziWei,tianJi,taiYang,wuQu,tianTong,lianZhen,
            tianFu,taiYin,tanLang,juMen,tianXiang,tianLiang,qiSha,poJun;
    public mainStar(){
        this.ziWei="紫微";
        this.tianJi="天機";
        this.taiYang="太陽";
        this.wuQu="武曲";
        this.tianTong="天同";
        this.lianZhen="廉貞";
        this.tianFu="天府";
        this.taiYin="太陰";
        this.tanLang="貪狼";
        this.juMen="巨門";
        this.tianXiang="天相";
        this.tianLiang="天梁";
        this.qiSha="七殺";
        this.poJun="破軍";
    }
    public int set_ziWei(String fiveElement,int day){
        return switch (fiveElement){
            case "水二局" -> switch (day){
                case 1, 24, 25 -> 2;
                case 2, 3, 26, 27 -> 3;
                case 4, 5, 28, 29 -> 4;
                case 6, 7, 30 -> 5;
                case 8, 9 -> 6;
                case 10, 11 -> 7;
                case 12, 13 -> 8;
                case 14, 15 -> 9;
                case 16, 17 -> 10;
                case 18, 19 -> 11;
                case 20, 21 -> 12;
                case 22, 23 -> 1;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            };
            case "木三局" -> switch (day){
                case 1, 9, 11 -> 5;
                case 2, 28 -> 2;
                case 3, 5 -> 3;
                case 4, 12, 14 -> 6;
                case 6, 8 -> 4;
                case 7, 15, 17 -> 7;
                case 10, 18, 20 -> 8;
                case 13, 21, 23 -> 9;
                case 16, 24, 26 -> 10;
                case 19, 27, 29 -> 11;
                case 22, 30 -> 12;
                case 25 -> 1;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            };
            case "金四局" -> switch (day){
                case 1, 30 -> 12;
                case 2, 12, 15, 21 -> 5;
                case 3, 9 -> 2;
                case 4, 7, 13, 22 -> 3;
                case 5 -> 1;
                case 6, 16, 19, 25 -> 6;
                case 8, 11, 17, 20 -> 4;
                case 10, 23, 29 -> 7;
                case 14, 24, 27 -> 8;
                case 18, 28 -> 9;
                case 26 -> 11;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            };
            case "土五局" -> switch (day){
                case 1, 13, 25, 29 -> 7;
                case 2, 26 -> 12;
                case 3, 15, 19, 27 -> 5;
                case 4, 12 -> 2;
                case 5, 9, 17 -> 3;
                case 6, 18, 30 -> 8;
                case 7 -> 1;
                case 8, 20, 24 -> 6;
                case 10, 14, 22 -> 4;
                case 11, 23 -> 9;
                case 16, 28 -> 10;
                case 21 -> 11;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            };
            default -> switch (day){
                case 1, 20 -> 10;
                case 2, 16, 30 -> 7;
                case 3, 13 -> 12;
                case 4, 18, 23 -> 5;
                case 5, 15, 25 -> 2;
                case 6, 11, 21 -> 3;
                case 7, 26 -> 11;
                case 8, 22 -> 8;
                case 9, 19 -> 1;
                case 10, 24, 29 -> 6;
                case 12, 17, 27 -> 4;
                case 14, 28 -> 9;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            };
        };
    }
    public int[] set_mainStar(int ziWei_p){
        return switch (ziWei_p){
            case 1 -> new int[]{1,12,10,9,8,5,5,6,7,8,9,10,11,3};
            case 2 -> new int[]{2,1,11,10,9,6,4,5,6,7,8,9,10,2};
            case 3 -> new int[]{3,2,12,11,10,7,3,4,5,6,7,8,9,1};
            case 4 -> new int[]{4,3,1,12,11,8,2,3,4,5,6,7,8,12};
            case 5 -> new int[]{5,4,2,1,12,9,1,2,3,4,5,6,7,11};
            case 6 -> new int[]{6,5,3,2,1,10,12,1,2,3,4,5,6,10};
            case 7 -> new int[]{7,6,4,3,2,11,11,12,1,2,3,4,5,9};
            case 8 -> new int[]{8,7,5,4,3,12,10,11,12,1,2,3,4,8};
            case 9 -> new int[]{9,8,6,5,4,1,9,10,11,12,1,2,3,7};
            case 10 -> new int[]{10,9,7,6,5,2,8,9,10,11,12,1,2,6};
            case 11 -> new int[]{11,10,8,7,6,3,7,8,9,10,11,12,1,5};
            default -> new int[]{12,11,9,8,7,4,6,7,8,9,10,11,12,4};
        };
    }
}
