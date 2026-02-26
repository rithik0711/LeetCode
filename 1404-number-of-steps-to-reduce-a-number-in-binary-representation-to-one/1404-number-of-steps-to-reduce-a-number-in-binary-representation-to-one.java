import java.math.BigInteger;

class Solution {

    public int Steps(BigInteger bin, int step){
        if(bin.equals(BigInteger.ONE)){
            return step;
        }
        if(bin.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
            bin=bin.divide(BigInteger.TWO);
        }else{
            bin=bin.add(BigInteger.ONE);
        }
        return Steps(bin, step+1);
    }

    public int numSteps(String s) {
        BigInteger bin = new BigInteger(s, 2);
        return Steps(bin, 0);
    }
}