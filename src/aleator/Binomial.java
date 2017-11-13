package aleator;

import aleator.Generator;

public class Binomial implements Generator{

    private int n;
    private double p;

    public Binomial(int n,double p){
        this.n = n;
        this.p = p;
    }

    @Override
    public float next() {
        int x = 0;
        float u = 0;
        DefaultGenerator random = new DefaultGenerator();
        for(int i=0;i<n;i++){
            u = random.next();
            if(u<p){
                x++;
            }
        }
        return (float) x/n;
    }
}
