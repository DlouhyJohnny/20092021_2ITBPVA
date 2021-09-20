import java.util.Scanner;

public class javavavvava {
    Scanner sc = new Scanner(System.in);
    static int nums[] = { 1,2,3,4,5,6,7,8,9,10 };
    int input = sc.nextInt();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("jake cislo chcete hledat?");
        int input2 = sc.nextInt();
        hasnum(nums,input2);

        System.out.println("jake cislo chcete secist?");
        int input3 = sc.nextInt();
        System.out.println("S cim ?");
        int input4 = sc.nextInt();
        sum(input3, input4);


        sc.close();
    }
    public void dejVlevo(int[] nums, int input) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int last = numbers[numbers.length - 1]; 
        

        for (int i = numbers.length - 1; i > 0; --i) {
            numbers[i] = numbers[i - 1];
        }
        
        numbers[0] = last; 
    }
    public static void sum(int cislo1,int cislo2) {
        int output = cislo1 + cislo2;
        System.out.println(output);
    }
    public static void hasnum(int[] arr, int toCheckValue)
    {

        String test = "ne";
        for (int element : arr) {
            if (element == toCheckValue) {
                test = "ano";
                break;
            }
        }
        System.out.println("Je " + toCheckValue
                           + " v array: " + test);
    }
    
}
