package aleator;

import java.util.Scanner;

import aleator.Generator;

public class Main {
    
    public static void main(String[] args) {
  
		Scanner scanner = new Scanner(System.in);
    	
    	System.out.print( "Introduce 1 pentru LCG sau 2 pentru MidSquare sau 3 pentru Evaluate sau 4 pentru Binomial&Poisson: " );
        int optiune = scanner.nextInt();
        
    	if(optiune == 2){
    		System.out.print( "Dati seed: " );
            int seedmidsq = scanner.nextInt();
            System.out.print( "Cate nr sa genereze: " );
            int nr = scanner.nextInt();
	        Generator ms = new MidSquare(seedmidsq);
	        System.out.println("MidSquare: ");
			System.out.println(ms.next());
			for (int i = 0; i < nr; i++) {
				System.out.println((float)ms.next());
	        }
    	}
		if(optiune==1){
			System.out.print( "Cate nr sa genereze: " );
	        int n = scanner.nextInt();	
	        System.out.print( "Dati seed: " );
	        int seed = scanner.nextInt();
	        System.out.print( "Dati a: " );
	        int a = scanner.nextInt();	
	        System.out.print( "Dati c: " );
	        int c = scanner.nextInt();	
	        System.out.print( "Dati m: " );
	        int m = scanner.nextInt();	
	        Generator lcg = new LCG(seed,a,c,m);
	        System.out.println("\nLCG: ");
	        System.out.println(lcg.next());
	        for (int i = 0; i < n; i++) {
	        	System.out.println((float)lcg.next());
	        }
		}
		scanner.close();
		if(optiune==3){
			MidSquare MS= new MidSquare(1245);
	        LCG LCG =new LCG(12,15,10,100);
	        Evaluator E_MS=new Evaluator(MS);
	        Evaluator E_LCG=new Evaluator(LCG);
	        System.out.println("LCG:"+E_LCG.evaluate(10));
	        System.out.println(" MS:"+E_MS.evaluate(10000));
		}
		if(optiune==4){
		 	Generator E_Binomial = new Binomial(1000,0.7);
	        System.out.println("Random number Binomial: " + E_Binomial.next());
	        Generator generatorDefault = new DefaultGenerator();
	        System.out.println("Random number DefaultGenerator: " + generatorDefault.next());
	        Generator E_MS =  new MidSquare(6578);
	        System.out.println("Random number MidSqr: " + E_MS.next());
	        Generator E_LCG =  new LCG(17,15,10,100);
	        System.out.println("Random number LGC: " + E_LCG.next());
	        Generator E_Poisson = new Poisson(10);
	        System.out.println("Random number Poisson: " + E_Poisson.next());
		}
                
    }
}