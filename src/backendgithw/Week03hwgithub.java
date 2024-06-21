package backendgithw;

public class Week03hwgithub {

	static int returnSum(int x, int y, int z){
        int answer = x + y + z;
        return x;
    }
   public static void main(String[] args) {
        int a = 10, b = 10, c = 10;
        System.out.println(returnSum(a,b,c));
    }
   
   
   
    
    int addItUp = followTheMath(10, 5, 8, 11);

   public static int followTheMath(int num1, int num2, int num3, int num4){
    int total = 0;
    if (num1 < num4){
        total += num2;
    }
    if (num2 == num3){
        total += num4;
    } else {
        total += num1;
    }
    total += num3;
    return num3;
}

}

	

	


