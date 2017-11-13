package aleator;

import aleator.Generator;

public class LCG implements Generator {
    private int seed;
	
    private int a;
    private int m;
    private int c;

    public LCG(int seed, int a, int c, int m) {
        
        this.seed = seed;
        this.a = a;
        this.m = m;
        this.c = c;
    }

    @Override
    public float next() {	
		
        int seed2 = (a * seed + c) % m;
        seed = seed2;
        return (float) (seed / Math.pow(10, LengthNr(seed)));
    }
    
    private int LengthNr(int n){
        int counter=0;
        int aux=seed;
        while (aux != 0) {
            aux /= 10;
            counter++;
        }
        return counter;
    }
}