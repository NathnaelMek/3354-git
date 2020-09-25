package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("the argument provided is empty, please input two or more integers");
        }catch (NumberFormatException e) {
            System.err.println("invalid argument! please input two or more integers");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        try{
            if(args[0] == "-"){
                // throws NumberFormatException if condition is true
            }else{
                for(int i = 0; i < args.length; i++)
                    sum += Integer.valueOf(args[i]);
            }

        }catch(NumberFormatException e){

            for(int i = 1; i < args.length; i++)
                sum += (Integer.valueOf(args[i]))*(-1);
        }
       

        return sum;
    }
}
