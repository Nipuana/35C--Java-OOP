package week5;
public class FunctionTask {
    /* 1)   Make a function adoptPet
     *      Takes animal type as String
     *      if animal is Dog, Cat, Snake return true
     *      else retirn false
     */
   public static Boolean adoptPet(String pet){
        if (pet=="Dog"||pet=="Cat"||pet=="Snake") {
            return true;
        }
        else{
            return false;
        }
    }


    /*Make a function eligibleTest
     * Takes a name as String and age as int
     * If the age is less than 0
     * return the "Hello name , your age is invalid" 
     * if the age is less than 18
     * return "Hello name you are underage"
     * if the age is more than 18
     * return "Congratulation name, you are eligible"
     */

    public static String eligibleTest(String name, int age){
        if (age<0){
            return "Hello "+name+", your age is invalid";
        }
        else if (age<18) {
            return "Hello "+name+", you are underage";
            
        }
        else{
            return "Congratulations "+name+", you are eligible";
        }
    }



    public static void main(String[] args) {
        Boolean animalType=adoptPet("Snake");
        System.out.println("The pet is adoptable "+animalType);
        
        System.out.println(eligibleTest("Nipuana", 18));

        
    }
}

