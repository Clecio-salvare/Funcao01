package com.mycompany.funcao01;

/**
 *
 * @author clecio
 */
public class Fatorial {
    private int numero = 0;
    private int resultFatorial = 1;
    private String formula = "";
    
    public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        for(int i = n; i > 1; i--){
            f *= i;
            s += i + " x ";
        }
        s += "1 = ";
        resultFatorial = f;
        formula = s;
    }
    
    public int getFatorial(){
        return resultFatorial;
    }
    
    public String getFormula(){
        return formula;
    }
    
}
