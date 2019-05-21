package com.gmail.mrdemqnvip.lambda_min_max;

@FunctionalInterface
public interface Function {

    Integer randomGenerate(int limit);

    default int getLimit(){
        return 100;
    }
}
