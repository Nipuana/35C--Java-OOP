package week3;

public class task3 {
    public static void main(String[] args) {
        
        /*Task i 
         * 
         * Given the value below, add the total and take the average 
         * ig any of the marking is less than 35, print "Fail"
         * if average is less than 60, print 3rd division
         * if average is less than 70, print 2nd division
         * if average is less than 80, print 1st division
         * if average is greater or equals to 80, print distinction
         * 
         */
    
        int math=38, science=60, english=35;


        double average=(math+science+english)/100;
        if (average<35 && average>=0) {
            System.out.println("Fail");          
        }
        
        else if (average<60 && average>=35 ) {
            System.out.println("3rd division");
            
        }

        else if(average<70 && average>=60){
            System.err.println("2nd division");
        }

        else if (average<80 && average>=70 ) {
            System.out.println("1st division");
            
        }

        else if(average>=80 && average<=100){
            System.out.println("distinction");
        }

        else   {
            System.out.println("invalid avearge number");
        }
        
        
        }
    
}
