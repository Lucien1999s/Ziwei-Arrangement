package example;

public class bingStar {
    String boShi,liShi,qingLong,xiaoHao,jiangJun,zouShu,feiLian,xiShen,bingFu,daHao,fuBing,guanFu;
    String changSheng,muYu,guanDai,lingGuan,diWang,ai,bing,si,mu,jue,tai,yang;
    String jiangXing,panAn,suiYi,siShen,huaGai,jieSha,zaiSha,tianSha,zhiBei,xianChi,diSha,wangShen;
    String suiJian,huiQi,sangMen,guanSuo,guanFuo,xiaoHao1,daHao1,longDe,baiHu,tianDe,diaoKe,bingFuo;

    public bingStar(){
        this.boShi= "博士";
        this.liShi= "力士";
        this.qingLong= "青龍";
        this.xiaoHao= "小耗";
        this.jiangJun= "將軍";
        this.zouShu= "奏書";
        this.feiLian= "飛廉";
        this.xiShen= "喜神";
        this.bingFu= "病符";
        this.daHao= "大耗";
        this.fuBing= "伏兵";
        this.guanFu= "官府";
        this.changSheng= "長生";
        this.muYu= "沐浴";
        this.guanDai= "冠帶";
        this.lingGuan= "臨官";
        this.diWang= "帝旺";
        this.ai= "哀";
        this.bing= "病";
        this.si= "死";
        this.mu= "墓";
        this.jue= "絕";
        this.tai= "胎";
        this.yang= "養";
        this.jiangXing= "將星";
        this.panAn= "攀鞍";
        this.suiYi= "歲驛";
        this.siShen= "息神";
        this.huaGai= "華蓋";
        this.jieSha= "劫煞";
        this.zaiSha= "災煞";
        this.tianSha= "天煞";
        this.zhiBei= "指背";
        this.xianChi= "咸池";
        this.diSha= "地煞";
        this.wangShen= "亡神";
        this.suiJian= "歲建";
        this.huiQi= "晦氣";
        this.sangMen= "喪門";
        this.guanSuo= "貫索";
        this.guanFuo= "官伏";
        this.xiaoHao1= "小耗";
        this.daHao1= "大耗";
        this.longDe= "龍德";
        this.baiHu= "白虎";
        this.tianDe= "天德";
        this.diaoKe= "吊客";
        this.bingFuo = "病伏";
    }
    public int[] set_boShi12(int luCun_p,String XinXiu){                   //博士十二星
        return switch (XinXiu){
            case "陽男","陰女"-> new int[]{luCun_p,(luCun_p+1)%12,(luCun_p+2)%12,(luCun_p+3)%12,(luCun_p+4)%12,(luCun_p+5)%12,(luCun_p+6)%12,(luCun_p+7)%12
            ,(luCun_p+8)%12,(luCun_p+9)%12,(luCun_p+10)%12,(luCun_p+11)%12};
            default -> new int[]{luCun_p,((luCun_p-1)+12)%12,((luCun_p-2)+12)%12,((luCun_p-3)+12)%12,((luCun_p-4)+12)%12,((luCun_p-5)+12)%12,((luCun_p-6)+12)%12,
                    ((luCun_p-7)+12)%12,((luCun_p-8)+12)%12,((luCun_p-9)+12)%12,((luCun_p-10)+12)%12,((luCun_p-11)+12)%12};
        };
    }
    public int[] set_fiveElementStar12(String fiveElement,String XinXiu){    //長生十二星
        return switch (fiveElement){
            case "水二局", "土五局" -> switch (XinXiu){
                case "陰女","陽男"-> new int[]{9,10,11,12,1,2,3,4,5,6,7,8};
                default -> new int[]{9,8,7,6,5,4,3,2,1,12,11,10};
            };
            case "木三局" -> switch (XinXiu){
                case "陰女","陽男"-> new int[]{12,1,2,3,4,5,6,7,8,9,10,11};
                default -> new int[]{12,11,10,9,8,7,6,5,4,3,2,1};
            };
            case "金四局" -> switch (XinXiu){
                case "陰女","陽男"-> new int[]{6,7,8,9,10,11,12,1,2,3,4,5};
                default -> new int[]{6,5,4,3,2,1,12,11,10,9,8,7};
            };
            default -> switch (XinXiu){
                case "陰女","陽男"-> new int[]{3,4,5,6,7,8,9,10,11,12,1,2};
                default -> new int[]{3,2,1,12,11,10,9,8,7,6,5,4};
            };
        };
    }
    public int[] set_flowChiang(String diZhi){           //安流年將前諸星
        return switch (diZhi){
            case "寅","午","戌" ->new int[]{7,8,9,10,11,12,1,2,3,4,5,6};
            case "申","子","辰" ->new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
            case "巳","酉","丑" ->new int[]{10,11,12,1,2,3,4,5,6,7,8,9};
            default ->new int[]{4,5,6,7,8,9,10,11,12,1,2,3};
        };
    }
    public int[] set_flowSue(String diZhi){              //安流年歲前諸星
        return switch (diZhi){
            case "子" -> new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
            case "丑" -> new int[]{2,3,4,5,6,7,8,9,10,11,12,1};
            case "寅" -> new int[]{3,4,5,6,7,8,9,10,11,12,1,2};
            case "卯" -> new int[]{4,5,6,7,8,9,10,11,12,1,2,3};
            case "辰" -> new int[]{5,6,7,8,9,10,11,12,1,2,3,4};
            case "巳" -> new int[]{6,7,8,9,10,11,12,1,2,3,4,5};
            case "午" -> new int[]{7,8,9,10,11,12,1,2,3,4,5,6};
            case "未" -> new int[]{8,9,10,11,12,1,2,3,4,5,6,7};
            case "申" -> new int[]{9,10,11,12,1,2,3,4,5,6,7,8};
            case "酉" -> new int[]{10,11,12,1,2,3,4,5,6,7,8,9};
            case "戌" -> new int[]{11,12,1,2,3,4,5,6,7,8,9,10};
            default -> new int[]{12,1,2,3,4,5,6,7,8,9,10,11};
        };
    }

}
