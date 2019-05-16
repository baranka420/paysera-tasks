public class taskNo3 {

    public static void main(String args[]){
        for(int i = 0; i < 20; i++){
            System.out.println(countCows(i));
        }
    }

    public static int countCows(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        else if(n == 3){
            return 2;
        }else if(n == 4){
            return 3;
        }else{
            double val = ((double)(n-4+1)/2)*(n-4)+3;
            return (int)val;
        }
    }

}
