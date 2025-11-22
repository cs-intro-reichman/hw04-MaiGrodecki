public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        boolean [] isPrime = new boolean[n + 1];
        double nSqrt = Math.sqrt(n);
        while (i < isPrime.length){
            if (i > 1){
                isPrime[i] = true;
            } else {
                isPrime[i] = false;
            }
            i++;
        }
        System.out.println(isPrime[0]);
        int j = 0;
        while(j <= nSqrt){
            for(int c = j; c < isPrime.length; c++){ ///now J is the next true
                if (isPrime[c] == true){
                    j = c;
                    break;
                }
            }
            int index = j;
            while(index < isPrime.length){
                index+=j;
                if(index > isPrime.length){
                    break;
                }
                isPrime[index] = false;
            }
            j++;
        }
        System.out.println("Prime numbers up to " + n +":");
        int count = 0;
        for(int t = 0; t < n +1;t++ ){
            if(isPrime[t] == true){
                System.out.println(t);
                count++;
            }
        }
        int prs = (count*100/n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + prs + "% are primes)");
    }   
}