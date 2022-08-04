package example;

public class palace {
    String self,body,siblings,spouse,children,wealth,health,travel,friends,career,property,mental,parents;
    public palace(){
        this.self="命宮";
        this.body="身宮";
        this.siblings="兄弟";
        this.spouse="夫妻";
        this.children="子女";
        this.wealth="財帛";
        this.health="疾厄";
        this.travel="遷移";
        this.friends="僕役";
        this.career="官祿";
        this.property="田宅";
        this.mental="福德";
        this.parents="父母";
    }
    public int set_self(int month,int time){                //安命宮
        if(time==23||time==0){             //子
            if(month>10){ return month-10; }
            else return month+2;
        }
        else if(time==1||time==2){         //丑
            if(month>11){return month-11;}
            else return month+1;
        }
        else if(time==3||time==4){         //寅
            return month;
        }
        else if(time==5||time==6){        //卯
            if(month==1){return month+11;}
            else return month-1;
        }
        else if(time==7||time==8){         //辰
            if(month==1||month==2){return month+10;}
            else return month-2;
        }
        else if(time==9||time==10){         //巳
            if(month<4){return month+9;}
            else return month-3;
        }
        else if(time==11||time==12){       //午
            if(month<5){return month+8;}
            else return month-4;
        }
        else if(time==13||time==14){        //未
            if(month<6){return month+7;}
            else return month-5;
        }
        else if(time==15||time==16){         //申
            if(month<7){return month+6;}
            else return month-6;
        }
        else if(time==17||time==18){         //酉
            if(month<8){return month+5;}
            else return month-7;
        }
        else if(time==19||time==20){        //戌
            if(month<9){return month+4;}
            else return month-8;
        }
        else {                               //亥
            if(month<10){return month+3;}
            else return month-9;
        }
    }
    public int set_body(int month,int time){             //安身宮
        if(time==23||time==0){             //子
            if(month>10){ return month-10; }
            else return month+2;
        }
        else if(time==1||time==2){         //丑
            if(month<10){return month+3;}
            else return month-9;
        }
        else if(time==3||time==4){         //寅
            if(month<9){return month+4;}
            else return month-8;
        }
        else if(time==5||time==6){        //卯
            if(month<8){return month+5;}
            else return month-7;
        }
        else if(time==7||time==8){         //辰
            if(month<7){return month+6;}
            else return month-6;
        }
        else if(time==9||time==10){         //巳
            if(month<6){return month+7;}
            else return month-5;
        }
        else if(time==11||time==12){       //午
            if(month<5){return month+8;}
            else return month-4;
        }
        else if(time==13||time==14){        //未
            if(month<4){return month+9;}
            else return month-3;
        }
        else if(time==15||time==16){         //申
            if(month==1||month==2){return month+10;}
            else return month-2;
        }
        else if(time==17||time==18){         //酉
            if(month==1){return month+11;}
            else return month-1;
        }
        else if(time==19||time==20){        //戌
            return month;
        }
        else {                               //亥
            if(month>11){return month-11;}
            else return month+1;
        }
    }
    public int[] set_otherPalace(int self_position){             //安其餘宮位
        return switch (self_position) {
            case 1 -> new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
            case 2 -> new int[]{1, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3};
            case 3 -> new int[]{2, 1, 12, 11, 10, 9, 8, 7, 6, 5, 4};
            case 4 -> new int[]{3, 2, 1, 12, 11, 10, 9, 8, 7, 6, 5};
            case 5 -> new int[]{4, 3, 2, 1, 12, 11, 10, 9, 8, 7, 6};
            case 6 -> new int[]{5, 4, 3, 2, 1, 12, 11, 10, 9, 8, 7};
            case 7 -> new int[]{6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8};
            case 8 -> new int[]{7, 6, 5, 4, 3, 2, 1, 12, 11, 10, 9};
            case 9 -> new int[]{8, 7, 6, 5, 4, 3, 2, 1, 12, 11, 10};
            case 10 -> new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 11};
            case 11 -> new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12};
            case 12 -> new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            default -> null;
        };
    }
}
