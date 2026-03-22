public class BasicExceptionHandling{
    public static void main(String [] args){
        System.out.println("===Basic Exception Handling Demo===");
        //Example-1:Arithmetic Exception:
        try{
            int result=10/0; //This will throw arithmetic Exception
            System.out.println("Result"+result);
        }catch(ArithmeticException e){
            System.out.println("Caught Arithmetic Exception"+e.getMessage());
        }
        //Null Pointer Exception:
        try{
            String str=null;
            System.out.println("The length of the string is"+str.length());
        }catch(NullPointerException e){
            System.out.println("Caught Null Pointer exception"+e.getMessage());
        }
        //Finally Block:
        try{
            int[] arr=new int[2];
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundException:"+e.getMessage());
        }finally{
            System.out.println("Finally Block always Executes.");
        }
        System.out.println("Program Continues after exception handling...");
    }
}