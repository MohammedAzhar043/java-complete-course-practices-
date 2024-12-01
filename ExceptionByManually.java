public class ExceptionByManually {
    
    public static void main(String[] args) {
        
        int i=10,j=0,k;
        try{
            if(i%j==0){
                throw new MohammedAzharException("It is having some errors in the code ,need to rectify the code");
            }
        }
        catch(MohammedAzharException e){
            System.out.println("hiii " + e);
        }
    }
}
class MohammedAzharException extends Exception{

    public  MohammedAzharException(String str){
        super(str);
            // System.out.println("This is customize exceptions");
    }
}