package org.jovialcode.jdk12;

import org.jovialcode.common.JEP;

@JEP(value = "361")
public class SwitchExpression {
    private class IfElse {
        public String dayName(){
            int dayOfWeek = 3;
            String dayName = "Unknown";
            if (dayOfWeek == 1){
                dayName = "Sunday";
            }else if(dayOfWeek == 2){
                dayName = "Monday";
            }else if(dayOfWeek == 3){
                dayName = "Tuesday";
            }
            return dayName;
        }
    }

    private class SwitchStatement {
        public String dayName(){
            int dayOfWeek = 3;
            String dayName;
            switch (dayOfWeek) {
                case 1:
                    dayName = "Sunday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                default:
                    dayName = "Unknown";
                    break;
            }
            return dayName;
        }
    }

    public String dayName(){
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> "Unknown";
        };
        return dayName;
    }
}
