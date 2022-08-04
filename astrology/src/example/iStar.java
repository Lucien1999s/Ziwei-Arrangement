package example;

public class iStar {
    String diJie,diKong,taiFu,fengGao,tianXing,tianYao,tianMa,jieShen,tianWu,tianYue,yinSha,sanTai,baZuo,enGuang,tianGui,tianGuan,
            tianFu,tianKu,tianXu,longChi,fengGe,hongLuan,tianXi,guChen,guaSu,feiLian,poSui,tianTsai,tianShou,tianShang,tianShi,
            jieKong,xunKong;
    public iStar(){
        this.diJie = "地劫";
        this.diKong="地空";
        this.taiFu="台輔";
        this.fengGao="封誥";
        this.tianXing="天刑";
        this.tianYao="天姚";
        this.tianMa ="天馬";
        this.jieShen ="解神";
        this.tianWu ="天巫";
        this.tianYue ="天月";
        this.yinSha ="陰煞";
        this.sanTai ="三台";
        this.baZuo ="八座";
        this.enGuang ="恩光";
        this.tianGui ="天貴";
        this.tianGuan="天官";
        this.tianFu ="天福";
        this.tianKu ="天哭";
        this.tianXu ="天虛";
        this.longChi ="龍池";
        this.fengGe ="鳳閣";
        this.hongLuan ="紅鸞";
        this.tianXi ="天喜";
        this.guChen ="孤辰";
        this.guaSu ="寡宿";
        this.feiLian ="蜚廉";
        this.poSui ="破碎";
        this.tianTsai ="天才";
        this.tianShou ="天壽";
        this.tianShang ="天傷";
        this.tianShi="天使";
        this.jieKong = "截空";
        this.xunKong = "旬空";
    }
    public int[] set_iTime(int time){                  //安地劫地空台輔封誥
        return switch (time){
            case 0,23 -> new int[]{12,12,7,3};
            case 1,2 -> new int[]{1,11,8,4};
            case 3,4 -> new int[]{2,10,9,5};
            case 5,6 -> new int[]{3,9,10,6};
            case 7,8 -> new int[]{4,8,11,7};
            case 9,10 -> new int[]{5,7,12,8};
            case 11,12 -> new int[]{6,6,1,9};
            case 13,14 -> new int[]{7,5,2,10};
            case 15,16 -> new int[]{8,4,3,11};
            case 17,18 -> new int[]{9,3,4,12};
            case 19,20 -> new int[]{10,2,5,1};
            default -> new int[]{11,1,6,2};
        };
    }
    public int[] set_iMonth(int month){                                        //安天刑天姚天馬解神天巫天月陰煞
        return switch (month){
            case 1 -> new int[]{10,2,9,9,6,11,3};
            case 2 -> new int[]{11,3,6,9,9,6,1};
            case 3 -> new int[]{12,4,3,11,3,5,11};
            case 4 -> new int[]{1,5,12,11,12,3,9};
            case 5 -> new int[]{2,6,9,1,6,8,7};
            case 6 -> new int[]{3,7,6,1,9,4,5};
            case 7 -> new int[]{4,8,3,3,3,12,3};
            case 8 -> new int[]{5,9,12,3,12,8,1};
            case 9 -> new int[]{6,10,9,5,6,3,11};
            case 10 -> new int[]{7,11,6,5,9,7,9};
            case 11 -> new int[]{8,12,3,7,3,11,7};
            default -> new int[]{9,1,12,7,12,3,5};
        };
    }
    public int[] set_iDay(int day,int zuoFu_p,int youBi_p,int wenChang_p,int wenQu_p){                //安三台八座恩光天貴
        return new int[]{(zuoFu_p+((day%12)-1))%12,(youBi_p-((day%12)-1))%12,(wenChang_p+((day%12)-2))%12,(wenQu_p+((day%12)-2))%12};
    }
    public int[] set_iTianGan(String tianGan){
        return switch (tianGan){
            case "甲" -> new int[]{8,10};
            case "乙" -> new int[]{5,9};
            case "丙" -> new int[]{6,1};
            case "丁" -> new int[]{3,12};
            case "戊" -> new int[]{4,4};
            case "己" -> new int[]{10,3};
            case "庚" -> new int[]{12,7};
            case "辛" -> new int[]{10,6};
            case "壬" -> new int[]{11,7};
            default -> new int[]{7,6};
        };
    }
    public int[] set_iDiZhi(String diZhi){                   //安天哭天虛龍池鳳閣紅鸞天喜孤辰寡宿斐廉破碎
        return switch (diZhi){
            case "子" -> new int[]{7,7,5,11,4,10,3,11,9,6};
            case "丑" -> new int[]{6,8,6,10,3,9,3,11,10,2};
            case "寅" -> new int[]{5,9,7,9,2,8,6,2,11,10};
            case "卯" -> new int[]{4,10,8,8,1,7,6,2,6,6};
            case "辰" -> new int[]{3,11,9,7,12,6,6,2,7,2};
            case "巳" -> new int[]{2,12,10,6,11,5,9,5,8,10};
            case "午" -> new int[]{1,1,11,5,10,4,9,5,3,6};
            case "未" -> new int[]{12,2,12,4,9,3,9,5,4,2};
            case "申" -> new int[]{11,3,1,3,8,2,12,8,5,10};
            case "酉" -> new int[]{10,4,2,2,7,1,12,8,12,6};
            case "戌" -> new int[]{9,5,3,1,6,12,12,8,1,2};
            default -> new int[]{8,6,4,12,5,11,3,11,2,10};
        };
    }
    public int set_tianTsai(String diZhi,int self_p,int[] otherPalace){     //安天才
        return switch (diZhi){
            case "子" -> self_p;
            case "丑" -> otherPalace[10];
            case "寅" -> otherPalace[9];
            case "卯" -> otherPalace[8];
            case "辰" -> otherPalace[7];
            case "巳" -> otherPalace[6];
            case "午" -> otherPalace[5];
            case "未" -> otherPalace[4];
            case "申" -> otherPalace[3];
            case "酉" -> otherPalace[2];
            case "戌" -> otherPalace[1];
            default -> otherPalace[0];
        };
    }
    public int set_tianShou(String diZhi,int body_p){              //安天壽
        return switch (diZhi){
            case "子" -> body_p;
            case "丑" -> (body_p+1)%12;
            case "寅" -> (body_p+2)%12;
            case "卯" -> (body_p+3)%12;
            case "辰" -> (body_p+4)%12;
            case "巳" -> (body_p+5)%12;
            case "午" -> (body_p+6)%12;
            case "未" -> (body_p+7)%12;
            case "申" -> (body_p+8)%12;
            case "酉" -> (body_p+9)%12;
            case "戌" -> (body_p+10)%12;
            default -> (body_p+11)%12;
        };
    }
    public int[] set_iOther(int[] otherPalace){                  //安天傷天使
        return new int[] {otherPalace[6],otherPalace[4]};
    }
    public int set_jieKong(String tianGan){                  //安截空
        return switch (tianGan){
            case "甲" -> 9;
            case "乙" -> 7;
            case "丙" -> 5;
            case "丁" -> 3;
            case "戊" -> 11;
            case "己" -> 10;
            case "庚" -> 8;
            case "辛" -> 6;
            case "壬" -> 4;
            default -> 12;
        };
    }
    public int set_xunKong(String tianGan,String diZhi,String xinXiu){                             //安旬空
        return switch (tianGan){
            case "甲" -> switch (diZhi){
                case "子" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "戌" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "申" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "午" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "辰" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "乙" -> switch (diZhi){
                case "丑" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "亥" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "酉" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "未" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "巳" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "丙" -> switch (diZhi){
                case "寅" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "子" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "戌" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "申" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "午" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "丁" -> switch (diZhi){
                case "卯" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "丑" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "亥" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "酉" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "未" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "戊" -> switch (diZhi){
                case "辰" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "寅" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "子" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "戌" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "申" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "己" -> switch (diZhi){
                case "巳" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "卯" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "丑" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "亥" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "酉" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "庚" -> switch (diZhi){
                case "午" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "辰" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "寅" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "子" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "戌" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "辛" -> switch (diZhi){
                case "未" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "巳" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "卯" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "丑" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "亥" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            case "壬" -> switch (diZhi){
                case "申" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "午" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "辰" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "寅" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "子" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
            default -> switch (diZhi){
                case "酉" ->switch (xinXiu){
                    case "陽男","陽女" -> 12;
                    default -> 11;
                };
                case "未" ->switch (xinXiu){
                    case "陽男","陽女" -> 10;
                    default -> 9;
                };
                case "巳" ->switch (xinXiu){
                    case "陽男","陽女" -> 8;
                    default -> 7;
                };
                case "卯" ->switch (xinXiu){
                    case "陽男","陽女" -> 6;
                    default -> 5;
                };
                case "丑" ->switch (xinXiu){
                    case "陽男","陽女" -> 4;
                    default -> 3;
                };
                default ->switch (xinXiu){
                    case "陽男","陽女" -> 2;
                    default -> 1;
                };
            };
        };
    }
}
