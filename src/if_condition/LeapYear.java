package if_condition;

public class LeapYear {
        public int year;

        public boolean checkIfLeapYear(int year){

            if((year % 4 == 0) && (year % 100 != 0 )){
                return true;
            }
            else if ((year % 4 == 0)&& (year % 100 == 0) && (year % 400 == 0)){
                return true;
            }
            else{
                return false;
            }
        }
}

