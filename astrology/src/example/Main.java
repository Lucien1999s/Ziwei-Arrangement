package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String line = "-----------------------------------------------------------";
    static List<String> tzu_p = new ArrayList<>();         //宣告地支陣列
    static List<String> chou_p = new ArrayList<>();
    static List<String> yin_p = new ArrayList<>();
    static List<String> mao_p = new ArrayList<>();
    static List<String> chen_p = new ArrayList<>();
    static List<String> su_p = new ArrayList<>();
    static List<String> wu_p = new ArrayList<>();
    static List<String> wei_p = new ArrayList<>();
    static List<String> shen_p = new ArrayList<>();
    static List<String> yu_p = new ArrayList<>();
    static List<String> hsu_p = new ArrayList<>();
    static List<String> hai_p = new ArrayList<>();

    static List<String> tzu_c = new ArrayList<>();         //宣告甲級星陣列
    static List<String> chou_c = new ArrayList<>();
    static List<String> yin_c = new ArrayList<>();
    static List<String> mao_c = new ArrayList<>();
    static List<String> chen_c = new ArrayList<>();
    static List<String> su_c = new ArrayList<>();
    static List<String> wu_c = new ArrayList<>();
    static List<String> wei_c = new ArrayList<>();
    static List<String> shen_c = new ArrayList<>();
    static List<String> yu_c = new ArrayList<>();
    static List<String> hsu_c = new ArrayList<>();
    static List<String> hai_c = new ArrayList<>();

    static List<String> tzu_i = new ArrayList<>();         //宣告乙級星陣列
    static List<String> chou_i = new ArrayList<>();
    static List<String> yin_i = new ArrayList<>();
    static List<String> mao_i = new ArrayList<>();
    static List<String> chen_i = new ArrayList<>();
    static List<String> su_i = new ArrayList<>();
    static List<String> wu_i = new ArrayList<>();
    static List<String> wei_i = new ArrayList<>();
    static List<String> shen_i = new ArrayList<>();
    static List<String> yu_i = new ArrayList<>();
    static List<String> hsu_i = new ArrayList<>();
    static List<String> hai_i = new ArrayList<>();

    static List<String> tzu_b = new ArrayList<>();         //宣告丙級以下陣列
    static List<String> chou_b = new ArrayList<>();
    static List<String> yin_b = new ArrayList<>();
    static List<String> mao_b = new ArrayList<>();
    static List<String> chen_b = new ArrayList<>();
    static List<String> su_b = new ArrayList<>();
    static List<String> wu_b = new ArrayList<>();
    static List<String> wei_b = new ArrayList<>();
    static List<String> shen_b = new ArrayList<>();
    static List<String> yu_b = new ArrayList<>();
    static List<String> hsu_b = new ArrayList<>();
    static List<String> hai_b = new ArrayList<>();

    public static void main(String[] args) {
        /*宣告物件*/

        Scanner sc = new Scanner(System.in);
        palace p1 = new palace();
        heaven h1 = new heaven();
        ten_year t1 = new ten_year();
        mainStar m1 = new mainStar();
        chiaStar c1 = new chiaStar();
        iStar i1 = new iStar();
        bingStar b1 = new bingStar();

        int count_z=0,count_o=1;

        /*使用者輸入資訊*/

        System.out.print("姓名:");
        String name = sc.next();
        System.out.print("性別:");
        String gender = sc.next();
        System.out.print("--農曆--\n民國年:");
        int ROC = sc.nextInt();
        System.out.print("月:");
        int month = sc.nextInt();
        System.out.print("日:");
        int day = sc.nextInt();
        System.out.print("時:");
        int hour = sc.nextInt();

        /*取得命主生辰資訊*/

        int tianGan_p = ROC_get_TianGan(ROC);                     //取年干
        String tianGan = getTianGan(tianGan_p);
        int diZhi_p = ROC_get_DiZhi(ROC);                         //取年支
        String diZhi = getDiZhi(diZhi_p);
        String time = getTime(hour);                              //取生辰
        String XinXiu = getXinXiu(gender,tianGan_p);              //取性屬



        /*安各宮位至地支 欄位p*/

        int self_p = p1.set_self(month,hour);                     //安命宮
        putIn_p(self_p, "("+p1.self+")");
        int[] otherPalace=p1.set_otherPalace(self_p);             //安其餘宮位
        String[] palaces={p1.siblings,p1.spouse,p1.children,p1.wealth,p1.health,
                p1.travel, p1.friends,p1.career,p1.property,p1.mental,p1.parents};
        for(int i:otherPalace){
            putIn_p(i,"("+palaces[count_z]+")");
            count_z++;}
        count_z=0;
        int[] tianGan_diZhi = h1.set_heaven(tianGan_p);             //安天干至地支
        String[] tianGans= new String[12];
        int[] diZhiS={3,4,5,6,7,8,9,10,11,12,1,2};
        for(int a:tianGan_diZhi){
            tianGans[count_z]=getTianGan(a);
            count_z++;}
        count_z=0;
        for (int i:diZhiS){
            putIn_p(i,"("+tianGans[count_z]+getDiZhi(i)+")");
            count_z++;}
        count_z=0;
        String fiveElement = getFiveElement(tianGan_p,self_p);    //定五行

        int[] palace_position = new int[12];                   //宮位位置表
        palace_position[0]= self_p;                            //放置命宮
        for (int i:otherPalace){                               //放置其他宮位
            palace_position[count_o]=i;
            count_o++;}
        count_o=1;
        String[] ten_year = t1.ten_year_arrange(fiveElement,XinXiu);  //取得大限流年
        for (int a:palace_position){
            putIn_p(a,"("+ten_year[count_z]+")");
            count_z++;}
        count_z=0;
        int body_p = p1.set_body(month,hour);                     //安身宮
        putIn_p(body_p, "("+p1.body+")");

        /*安主星、甲級星、生年四化 欄位c*/

        String[] siHua = {"化祿","化權","化科","化忌"};
        String[] siHuaStar = c1.set_siHua(tianGan);

        int ziWei_p = m1.set_ziWei(fiveElement,day);         //定紫微星位置
        int[] mainStars_p = m1.set_mainStar(ziWei_p);          //取得諸主星位置
        String[] mainStar = {m1.ziWei,m1.tianJi,m1.taiYang,m1.wuQu,m1.tianTong,m1.lianZhen,m1.tianFu,
                m1.taiYin,m1.tanLang,m1.juMen,m1.tianXiang,m1.tianLiang,m1.qiSha,m1.poJun};
        for(String a:siHuaStar){                             //安生年四化至主星
            int siHua_p = search_siHua(a);
            if(siHua_p<14){
                mainStar[siHua_p]=a+siHua[count_z];}
            count_z++;}
        count_z=0;
        for (int a:mainStars_p){                            //放置主星
            putIn_c(a,mainStar[count_z]);
            count_z++;}
        count_z=0;

        int[] chiaTimeStar1_p = c1.set_chiaTimeStar1(hour);  //安文昌文曲
        String[] chiaTimeStar1 = {c1.wenChang,c1.wenQu};
        for(String a:siHuaStar){                              //安生年四化昌曲
            int siHua_p = search_siHua(a);
            if(siHua_p==14){chiaTimeStar1[0]=a+siHua[count_z];}
            else if(siHua_p==15){chiaTimeStar1[1]=a+siHua[count_z];}
            count_z++;}
        count_z=0;
        for (int a:chiaTimeStar1_p){                          //放置文昌文曲
            putIn_c(a,chiaTimeStar1[count_z]);
            count_z++;}
        count_z=0;

        int[] chiaTimeStar2_p = c1.set_chiaTimeStar2(hour,diZhi);  //安火星鈴星
        String[] chiaTimeStar2 = {c1.huoXing,c1.lingXing};
        for(int a:chiaTimeStar2_p){
            putIn_c(a,chiaTimeStar2[count_z]);
            count_z++;}
        count_z=0;

        int[] chiaMonth_p = c1.set_chiaMonth(month);              //安左輔右弼
        String[] chiaMonth = {c1.zuoFu,c1.youBi};
        for(String a:siHuaStar){                  //生年右弼化科確認
            int siHua_p = search_siHua(a);
            if(siHua_p==16){
                chiaMonth[1]=a+siHua[2];}}
        for (int a:chiaMonth_p){
            putIn_c(a,chiaMonth[count_z]);
            count_z++;}
        count_z=0;

        int[] chiaTianGan_p = c1.set_chiaTianGan(tianGan);          //安祿存擎羊陀螺天魁天鉞
        String[] chiaTianGan = {c1.luCun,c1.qingYang,c1.tuoLuo,c1.tianKui,c1.tianYue};
        for(int a:chiaTianGan_p){
            putIn_c(a,chiaTianGan[count_z]);
            count_z++;}
        count_z=0;

        /*安乙級星 欄位i*/

        int[] iTimeStar_p = i1.set_iTime(hour);                          //安地劫地空台輔封誥
        String[] iTimeStars = {i1.diJie,i1.diKong,i1.taiFu,i1.fengGao};
        for (int a:iTimeStar_p){
            putIn_i(a,iTimeStars[count_z]);
            count_z++;}
        count_z=0;
        int[] iMonthStar_p = i1.set_iMonth(month);
        String[] iMonthStars = {i1.tianXing,i1.tianYao,i1.tianMa,i1.jieShen,i1.tianWu,i1.tianYue,i1.yinSha};  //安天刑天姚天馬解神天巫天月陰煞
        for (int a:iMonthStar_p){
            putIn_i(a,iMonthStars[count_z]);
            count_z++;}
        count_z=0;
        int[] iDayStar_p = i1.set_iDay(day,chiaMonth_p[0],chiaMonth_p[1],chiaTimeStar1_p[0],chiaTimeStar1_p[1]);  //安三台八座恩光天貴
        String[] iDayStars = {i1.sanTai,i1.baZuo,i1.enGuang,i1.tianGui};
        for (int a:iDayStar_p){
            putIn_i(a,iDayStars[count_z]);
            count_z++;}
        count_z=0;
        int[] iTianGanStar_p = i1.set_iTianGan(tianGan);              //安天官天福
        String[] iTianGanStars = {i1.tianGuan,i1.tianFu};
        for(int a:iTianGanStar_p){
            putIn_i(a,iTianGanStars[count_z]);
            count_z++;}
        count_z=0;
        int[] iDiZhiStar_p = i1.set_iDiZhi(diZhi);              //安天哭天虛龍池鳳閣紅鸞天喜孤辰寡宿斐廉破碎
        String[] iDiZhiStar = {i1.tianKu,i1.tianXu,i1.longChi,i1.fengGe,i1.hongLuan,i1.tianXi,i1.guChen,i1.guaSu,i1.feiLian,i1.poSui};
        for (int a:iDiZhiStar_p){
            putIn_i(a,iDiZhiStar[count_z]);
            count_z++;}
        count_z=0;
        int tianTsai_p = i1.set_tianTsai(diZhi,self_p,otherPalace);   //安天才
        String tianTsai = i1.tianTsai;
        putIn_i(tianTsai_p,tianTsai);
        int tianShou_p = i1.set_tianShou(diZhi,body_p);               //安天壽
        String tianShou = i1.tianShou;
        putIn_i(tianShou_p,tianShou);
        int[] iOtherStar_p = i1.set_iOther(otherPalace);              //安天傷天使
        String[] iOtherStar = {i1.tianShang,i1.tianShi};
        for (int a:iOtherStar_p){
            putIn_i(a,iOtherStar[count_z]);
            count_z++;}
        count_z=0;
        int jieKong_p = i1.set_jieKong(tianGan);                 //安截空
        String jieKong = i1.jieKong;
        putIn_i(jieKong_p,jieKong);
        int xunKong_p = i1.set_xunKong(tianGan,diZhi,XinXiu);    //安旬空
        String xunKong = i1.xunKong;
        putIn_i(xunKong_p,xunKong);

        /*安丙丁戊級星 欄位b*/

        int[] boShi12_p = b1.set_boShi12(chiaTianGan_p[0],XinXiu);          //安博士十二星
        String[] boShi12 = {b1.boShi,b1.liShi,b1.qingLong,b1.xiaoHao,b1.jiangJun,b1.zouShu,
                b1.feiLian,b1.xiShen,b1.bingFu,b1.daHao,b1.fuBing,b1.guanFu};
        for(int a:boShi12_p){
            if(a==0){a=12;}
            putIn_b(a,boShi12[count_z]);
            count_z++;}
        count_z=0;
        int[] fiveElementStar_p = b1.set_fiveElementStar12(fiveElement,XinXiu);         //安五行長生十二星
        String[] fiveElementStar = {b1.changSheng,b1.muYu,b1.guanDai,b1.lingGuan,b1.diWang,b1.ai,b1.bing,b1.si,b1.mu,b1.jue,b1.tai,b1.yang};
        for (int a:fiveElementStar_p){
            putIn_b(a,fiveElementStar[count_z]);
            count_z++;}
        count_z=0;
        int[] flowChiang_p = b1.set_flowChiang(diZhi);                     //安將前諸星
        String[] flowChiang = {b1.jiangXing,b1.panAn,b1.suiYi,b1.siShen,b1.huaGai,
                b1.jieSha,b1.zaiSha,b1.tianSha,b1.zhiBei,b1.xianChi,b1.diSha,b1.wangShen};
        for(int a:flowChiang_p){
            putIn_b(a,flowChiang[count_z]);
            count_z++;}
        count_z=0;
        int[] flowSue_p = b1.set_flowSue(diZhi);                            //安歲前諸星
        String[] flowSue = {b1.suiJian,b1.huiQi,b1.sangMen,b1.guanSuo,b1.guanFuo,b1.xiaoHao1,
                b1.daHao1,b1.longDe,b1.baiHu,b1.tianDe,b1.diaoKe,b1.bingFuo};
        for (int a:flowSue_p){
            putIn_b(a,flowSue[count_z]);
            count_z++;}
        count_z=0;

        /* 列 印 命 盤 !*/

        System.out.println("姓名:"+name+" 性別:"+gender);
        System.out.println("(農曆)民國:"+ROC+"年("+tianGan+diZhi+"年)"+month+"月"+day+"日 "+hour+"("+time+")時");
        System.out.println("性屬:"+XinXiu+" 五行:"+fiveElement);
        System.out.println(line+"\n子:"+tzu_p+"\n"+tzu_c+"\n"+tzu_i+"\n"+tzu_b);
        System.out.println(line+"\n丑:"+chou_p+"\n"+chou_c+"\n"+chou_i+"\n"+chou_b);
        System.out.println(line+"\n寅:"+yin_p+"\n"+yin_c+"\n"+yin_i+"\n"+yin_b);
        System.out.println(line+"\n卯:"+mao_p+"\n"+mao_c+"\n"+mao_i+"\n"+mao_b);
        System.out.println(line+"\n辰:"+chen_p+"\n"+chen_c+"\n"+chen_i+"\n"+chen_b);
        System.out.println(line+"\n巳:"+su_p+"\n"+su_c+"\n"+su_i+"\n"+su_b);
        System.out.println(line+"\n午:"+wu_p+"\n"+wu_c+"\n"+wu_i+"\n"+wu_b);
        System.out.println(line+"\n未:"+wei_p+"\n"+wei_c+"\n"+wei_i+"\n"+wei_b);
        System.out.println(line+"\n申:"+shen_p+"\n"+shen_c+"\n"+shen_i+"\n"+shen_b);
        System.out.println(line+"\n酉:"+yu_p+"\n"+yu_c+"\n"+yu_i+"\n"+yu_b);
        System.out.println(line+"\n戌:"+hsu_p+"\n"+hsu_c+"\n"+hsu_i+"\n"+hsu_b);
        System.out.println(line+"\n亥:"+hai_p+"\n"+hai_c+"\n"+hai_i+"\n"+hai_b);
    }

    public static void putIn_p(int position,String obj){     //將元素放至地支基礎資訊欄
        switch (position) {
            case 1 -> tzu_p.add(obj);
            case 2 -> chou_p.add(obj);
            case 3 -> yin_p.add(obj);
            case 4 -> mao_p.add(obj);
            case 5 -> chen_p.add(obj);
            case 6 -> su_p.add(obj);
            case 7 -> wu_p.add(obj);
            case 8 -> wei_p.add(obj);
            case 9 -> shen_p.add(obj);
            case 10 -> yu_p.add(obj);
            case 11 -> hsu_p.add(obj);
            case 12 -> hai_p.add(obj);
            default -> {
            }
        }
    }
    public static void putIn_c(int position,String obj){     //將元素放至甲級星欄
        switch (position) {
            case 1 -> tzu_c.add(obj);
            case 2 -> chou_c.add(obj);
            case 3 -> yin_c.add(obj);
            case 4 -> mao_c.add(obj);
            case 5 -> chen_c.add(obj);
            case 6 -> su_c.add(obj);
            case 7 -> wu_c.add(obj);
            case 8 -> wei_c.add(obj);
            case 9 -> shen_c.add(obj);
            case 10 -> yu_c.add(obj);
            case 11 -> hsu_c.add(obj);
            case 12 -> hai_c.add(obj);
            default -> {
            }
        }
    }
    public static void putIn_i(int position,String obj){     //將元素放至乙級星欄
        switch (position) {
            case 1 -> tzu_i.add(obj);
            case 2 -> chou_i.add(obj);
            case 3 -> yin_i.add(obj);
            case 4 -> mao_i.add(obj);
            case 5 -> chen_i.add(obj);
            case 6 -> su_i.add(obj);
            case 7 -> wu_i.add(obj);
            case 8 -> wei_i.add(obj);
            case 9 -> shen_i.add(obj);
            case 10 -> yu_i.add(obj);
            case 11 -> hsu_i.add(obj);
            case 12 -> hai_i.add(obj);
            default -> {
            }
        }
    }
    public static void putIn_b(int position,String obj){     //將元素放至丙級星和以下欄
        switch (position) {
            case 1 -> tzu_b.add(obj);
            case 2 -> chou_b.add(obj);
            case 3 -> yin_b.add(obj);
            case 4 -> mao_b.add(obj);
            case 5 -> chen_b.add(obj);
            case 6 -> su_b.add(obj);
            case 7 -> wu_b.add(obj);
            case 8 -> wei_b.add(obj);
            case 9 -> shen_b.add(obj);
            case 10 -> yu_b.add(obj);
            case 11 -> hsu_b.add(obj);
            case 12 -> hai_b.add(obj);
            default -> {
            }
        }
    }
    public static int ROC_get_TianGan(int ROC){            //民國年取天干
        if(ROC>=73){
            return ((ROC-73)+1)%10;
        }
        else
            return (10-((73-ROC)%10)+1)%10;
    }
    public static int ROC_get_DiZhi(int ROC){              //民國年取地支
        if(ROC>=73){
            return ((ROC-73)+1)%12;
        }
        else
            return (12-((73-ROC)%12)+1)%12;
    }
    public static String getTianGan(int position){         //取天干方法
        return switch (position) {
            case 1 -> "甲";
            case 2 -> "乙";
            case 3 -> "丙";
            case 4 -> "丁";
            case 5 -> "戊";
            case 6 -> "己";
            case 7 -> "庚";
            case 8 -> "辛";
            case 9 -> "壬";
            default -> "癸";
        };
    }
    public static String getDiZhi(int position){            //取地支方法
        return switch (position) {
            case 1 -> "子";
            case 2 -> "丑";
            case 3 -> "寅";
            case 4 -> "卯";
            case 5 -> "辰";
            case 6 -> "巳";
            case 7 -> "午";
            case 8 -> "未";
            case 9 -> "申";
            case 10 -> "酉";
            case 11 -> "戌";
            default -> "亥";
        };
    }
    public static String getTime(int hour){                  //取時辰方法
        return switch (hour) {
            case 0, 23 -> "子";
            case 1, 2 -> "丑";
            case 3, 4 -> "寅";
            case 5, 6 -> "卯";
            case 7, 8 -> "辰";
            case 9, 10 -> "巳";
            case 11, 12 -> "午";
            case 13, 14 -> "未";
            case 15, 16 -> "申";
            case 17, 18 -> "酉";
            case 19, 20 -> "戌";
            default -> "亥";
        };
    }
    public static String getXinXiu(String gender,int tianGan){     //定性屬方法
        if(tianGan%2==0){
            return "陰"+gender;
        }
        else
            return "陽"+gender;
    }
    public static String getFiveElement(int tianGan_p,int self_p){  //定五行方法
        if(tianGan_p==1||tianGan_p==6){
            return switch (self_p) {
                case 1, 2 -> "水二局";
                //case 3, 4 -> "火六局";
                case 5, 6 -> "木三局";
                case 7, 8 -> "土五局";
                case 9, 10 -> "金四局";
                default -> "火六局";
            };
        }else if(tianGan_p==2||tianGan_p==7){
            return switch (self_p) {
                case 1, 2 -> "火六局";
                //case 3, 4 -> "土五局";
                case 5, 6 -> "金四局";
                case 7, 8 -> "木三局";
                case 9, 10 -> "水二局";
                default -> "土五局";
            };
        }else if(tianGan_p==3||tianGan_p==8){
            return switch (self_p) {
                case 1, 2 -> "土五局";
                //case 3, 4 -> "木三局";
                case 5, 6 -> "水二局";
                case 7, 8 -> "金四局";
                case 9, 10 -> "火六局";
                default -> "木三局";
            };
        }else if(tianGan_p==4||tianGan_p==9){
            return switch (self_p) {
                case 1, 2 -> "木三局";
                //case 3, 4 -> "金四局";
                case 5, 6 -> "火六局";
                case 7, 8 -> "水二局";
                case 9, 10 -> "土五局";
                default -> "金四局";
            };
        }else {
            return switch (self_p) {
                case 1, 2 -> "金四局";
                //case 3, 4 -> "水二局";
                case 5, 6 -> "土五局";
                case 7, 8 -> "火六局";
                case 9, 10 -> "木三局";
                default -> "水二局";
            };
        }
    }
    public static int search_siHua(String siHua_star){
        return switch (siHua_star){
            case "紫微" ->0;
            case "天機" ->1;
            case "太陽" ->2;
            case "武曲" ->3;
            case "天同" ->4;
            case "廉貞" ->5;
            case "天府" ->6;
            case "太陰" ->7;
            case "貪狼" ->8;
            case "巨門" ->9;
            case "天相" ->10;
            case "天梁" ->11;
            case "七殺" ->12;
            case "破軍" ->13;
            case "文昌" ->14;
            case "文曲" ->15;
            case "右弼" ->16;
            default -> 17;
        };
    }
}
