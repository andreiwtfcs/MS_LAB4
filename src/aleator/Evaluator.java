package aleator;
public class Evaluator implements InterfaceEvaluator{

    private Generator G;
    private int n_sc,n_p;

    Evaluator(Generator value)
    {
        G=value;
    }
    public double evaluate(int max){
        int i;
        float x,y;
        n_sc=0;
        n_p=0;
        for(i=1;i<=max;i++){
            x=G.next();
            y=G.next();
            n_p++;
            if(Math.pow(x,2)+Math.pow(y,2)<=1){
                n_sc++;
            }
        }
        return Math.abs(Math.PI-(((float)(4*n_sc))/n_p));
    }
}
