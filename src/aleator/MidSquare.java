package aleator;

import aleator.Generator;

public class MidSquare implements Generator {
    private int seed;
      
    public MidSquare(int seed) {
        this.seed = seed;
    }
	
    @Override
    public float next() {
        int nr = seed * seed;
        int nrseed = LengthNr(seed);
        nr =  (int)nr /  (int)Math.pow(nrseed, 2);
        nr = (int)nr % (int)Math.pow(10, nrseed);
        
        if(nr/Math.pow(10, nrseed-1)==0) {
        	nr = ChangeLenght(nr);
        }
		
        seed = nr;		        
        return  (float) (seed / Math.pow(10, LengthNr(seed)));	
    }

    public int LengthNr(int seed){
        int counter=0;
        int aux=seed;
        while (aux != 0) {
            aux /= 10;
            counter++;
        }
        return counter;
    }
    
    private int ChangeLenght(int nr2) {
    	while(LengthNr(nr2) < LengthNr(seed)) {
    		nr2 = nr2 * 10 + 2;
    	}
    	return nr2;
    }    
}