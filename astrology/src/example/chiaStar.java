package example;

public class chiaStar {
    String wenChang,wenQu,huoXing,lingXing,zuoFu,youBi,luCun,qingYang,tuoLuo,tianKui,tianYue,huaLu,huaChan,huaKe,huaJi;

    public chiaStar(){
        this.wenChang="文昌";
        this.wenQu="文曲";
        this.huoXing="火星";
        this.lingXing="鈴星";
        this.zuoFu="左輔";
        this.youBi="右弼";
        this.luCun="祿存";
        this.qingYang="擎羊";
        this.tuoLuo="陀羅";
        this.tianKui="天魁";
        this.tianYue="天鉞";
        this.huaLu="化祿";
        this.huaChan="化權";
        this.huaKe="化科";
        this.huaJi="化忌";
    }
    public int[] set_chiaTimeStar1(int time){         //安文昌文曲
        return switch (time){
            case 0,23 -> new int[]{11,5};
            case 1,2 -> new int[]{10,6};
            case 3,4 -> new int[]{9,7};
            case 5,6 -> new int[]{8,8};
            case 7,8 -> new int[]{7,9};
            case 9,10 -> new int[]{6,10};
            case 11,12 -> new int[]{5,11};
            case 13,14 -> new int[]{4,12};
            case 15,16 -> new int[]{3,1};
            case 17,18 -> new int[]{2,2};
            case 19,20 -> new int[]{1,3};
            default -> new int[]{12,4};
        };
    }
    public int[] set_chiaTimeStar2(int time,String diZhi){     //安火星鈴星
        return switch (diZhi){
            case "寅","午","戌" -> switch (time){
                case 0,23 -> new int[]{2,4};
                case 1,2 -> new int[]{3,5};
                case 3,4 -> new int[]{4,6};
                case 5,6 -> new int[]{5,7};
                case 7,8 -> new int[]{6,8};
                case 9,10 -> new int[]{7,9};
                case 11,12 -> new int[]{8,10};
                case 13,14 -> new int[]{9,11};
                case 15,16 -> new int[]{10,12};
                case 17,18 -> new int[]{11,1};
                case 19,20 -> new int[]{12,2};
                default -> new int[]{1,3};
            };
            case "申","子","辰" -> switch (time){
                case 0,23 -> new int[]{3,11};
                case 1,2 -> new int[]{4,12};
                case 3,4 -> new int[]{5,1};
                case 5,6 -> new int[]{6,2};
                case 7,8 -> new int[]{7,3};
                case 9,10 -> new int[]{8,4};
                case 11,12 -> new int[]{9,5};
                case 13,14 -> new int[]{10,6};
                case 15,16 -> new int[]{11,7};
                case 17,18 -> new int[]{12,8};
                case 19,20 -> new int[]{1,9};
                default -> new int[]{2,10};
            };
            case "巳","酉","丑" -> switch (time){
                case 0,23 -> new int[]{4,11};
                case 1,2 -> new int[]{5,12};
                case 3,4 -> new int[]{6,1};
                case 5,6 -> new int[]{7,2};
                case 7,8 -> new int[]{8,3};
                case 9,10 -> new int[]{9,4};
                case 11,12 -> new int[]{10,5};
                case 13,14 -> new int[]{11,6};
                case 15,16 -> new int[]{12,7};
                case 17,18 -> new int[]{1,8};
                case 19,20 -> new int[]{2,9};
                default -> new int[]{3,10};
            };
            default-> switch (time){
                case 0,23 -> new int[]{10,11};
                case 1,2 -> new int[]{11,12};
                case 3,4 -> new int[]{12,1};
                case 5,6 -> new int[]{1,2};
                case 7,8 -> new int[]{2,3};
                case 9,10 -> new int[]{3,4};
                case 11,12 -> new int[]{4,5};
                case 13,14 -> new int[]{5,6};
                case 15,16 -> new int[]{6,7};
                case 17,18 -> new int[]{7,8};
                case 19,20 -> new int[]{8,9};
                default -> new int[]{9,10};
            };
        };
    }
    public int[] set_chiaMonth(int month){         //安左輔右弼
        return switch (month){
            case 1 -> new int[]{5,11};
            case 2 -> new int[]{6,10};
            case 3 -> new int[]{7,9};
            case 4 -> new int[]{8,8};
            case 5 -> new int[]{9,7};
            case 6 -> new int[]{10,6};
            case 7 -> new int[]{11,5};
            case 8 -> new int[]{12,4};
            case 9 -> new int[]{1,3};
            case 10 -> new int[]{2,2};
            case 11 -> new int[]{3,1};
            default -> new int[]{4,12};
        };
    }
    public int[] set_chiaTianGan(String tianGan){       //安祿存擎羊駝羅天魁天鉞
        return switch (tianGan){
            case "甲" -> new int[]{3,4,2,2,8};
            case "乙" -> new int[]{4,5,3,1,9};
            case "丙" -> new int[]{6,7,5,12,10};
            case "丁" -> new int[]{7,8,6,12,10};
            case "戊" -> new int[]{6,7,5,2,8};
            case "己" -> new int[]{7,8,6,1,9};
            case "庚" -> new int[]{9,10,8,2,8};
            case "辛" -> new int[]{10,11,9,7,3};
            case "壬" -> new int[]{12,1,11,4,6};
            default -> new int[]{1,2,12,4,6};
        };
    }
    public String[] set_siHua(String tianGan){
        return switch (tianGan){
            case "甲" -> new String[]{"廉貞","破軍","文曲","太陽"};
            case "乙" -> new String[]{"天機","天梁","紫微","太陰"};
            case "丙" -> new String[]{"天同","天機","文昌","廉貞"};
            case "丁" -> new String[]{"太陰","天同","天機","巨門"};
            case "戊" -> new String[]{"貪狼","太陰","右弼","天機"};
            case "己" -> new String[]{"武曲","貪狼","天梁","文曲"};
            case "庚" -> new String[]{"太陽","武曲","天同","天相"};
            case "辛" -> new String[]{"巨門","太陽","武曲","文昌"};
            case "壬" -> new String[]{"天梁","紫微","天府","武曲"};
            default -> new String[]{"破軍","巨門","太陰","貪狼"};
        };
    }
}
