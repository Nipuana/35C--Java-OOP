package week3;

public class SwitchCase {
    public static void main(String[] args) {
        
char value='a';
        switch (value) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
            System.out.println("Dog");
            break;
            
            default:
            System.out.println("No word found");
                break;
        }

    }
}
