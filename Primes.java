public class Primes {
    public static void main(String[] args) {
        int limitnum = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + limitnum + ":");
        boolean primecheck[]= new boolean[limitnum+1];
        int primesnum = 0;
        for(int i=2;i<primecheck.length;i++) primecheck[i]=true;
        int p = 2;
        while(p<=Math.sqrt(limitnum)){
            if(primecheck[p]==true){
                for(int i = p+1;i<primecheck.length;i++){
                    if(i%p==0){
                        primecheck[i]=false;
                    }
                }
            }
            p++;
        }
        for(int i=2;i<primecheck.length;i++){
            if(primecheck[i]==true){
                System.out.println(i);
                primesnum++;
            }
        }
        double primepercent = (double)primesnum/(double)limitnum*100;
        System.out.println("There are " + primesnum + " primes between 2 and " + limitnum + " ("+ (int)primepercent + "% are primes)");
    }
}