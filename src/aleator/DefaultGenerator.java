package aleator;

import aleator.Generator;

import java.util.Random;

public class DefaultGenerator implements Generator {

    Random rand ;
    public DefaultGenerator(){
        rand =  new Random();

    }

    @Override
    public float next(){
        return rand.nextFloat();
    }
}
