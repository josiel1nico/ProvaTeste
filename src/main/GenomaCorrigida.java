package main;

public class GenomaCorrigida {
    private static String cadeiaP = new String(), cadeiaT = new String();
    private static int tamanhoCadeiaP = 0;
	private static int tamanhoCadeiaT = 0;
        
    public static void setTamanhoCadeias(int p, int t){
        if(p >= 4 && t >=4)
        	if(p <= 20 && t <= 20)
        		if(p <= t){
        			tamanhoCadeiaP = p;
        	        tamanhoCadeiaT = t;
        		}
    }//END FUNCTION

	public static void setCadeiaP(String p){
        if(p.length() >=4 && p.length() <=20)
        	cadeiaP = p;
    }//END FUNCTION
    
    public static void setCadeiaT(String t){
        if(t.length() >= 4 && t.length() <= 20)    
        	cadeiaT = t;
    }//END FUNCTION
    
    public static String getResult(){
        String auxStr, returnValue = new String();
        auxStr = inverseLetters(cadeiaP);
        if(cadeiaP.length() <= cadeiaT.length()){
        	returnValue  = "ocorrencia direta: "+getOccurences(cadeiaP,cadeiaT);
            returnValue += "\nocorrencia complementar invertida: "+getOccurences(auxStr,cadeiaT);
        }        
        return returnValue;
}//END FUNCTION

private static String getOccurences(String p, String t){
        String c = new String(), returnValue = new String();
        int lenP = tamanhoCadeiaP, lenT = tamanhoCadeiaT;
        if(lenP>0 && lenT>0 && lenT>=lenP){
                for(int i=0,j=(lenT-lenP);i<=j;i++){
                        c = t.substring(i,i+lenP);
                        if(c.equalsIgnoreCase(p)){
                                returnValue+= (i+1)+" ";
                        }//END IF
                }//END FOR
        }//END IF
        return (returnValue.length()>0)?returnValue:"0";
}//END FUNCTION

private static String inverseLetters(String str){
        String returnValue = new String(), c = new String();
        if(str.length()>0){
                for(int i=0;i<str.length();i++){
                        c = str.substring(i,i+1);
                        if(c.equalsIgnoreCase("A")){
                                returnValue+="T";
                        }//END IF
                        if(c.equalsIgnoreCase("T")){
                                returnValue+="A";
                        }//END IF
                        if(c.equalsIgnoreCase("C")){
                                returnValue+="G";
                        }//END IF
                        if(c.equalsIgnoreCase("G")){
                                returnValue+="C";
                        }//END IF
                }//END FOR
        }//END IF
        return inverseLettersOrder(returnValue); 
}//END FUNCTION

private static String inverseLettersOrder(String str){
        String returnValue = new String();
        if(str.length()>0){
                for(int i=str.length();i>0;i--){
                        returnValue+= str.substring(i-1,i);
                }//END FOR
        }//END IF
        return returnValue;
}//END FUNCTION


public static void main(String[] args) {
    setTamanhoCadeias(2, 4);
    setCadeiaP("AC");
    setCadeiaT("TGGT");
    showMessage(getResult());
    
    setTamanhoCadeias(4, 25);
    setCadeiaP("CATA");
    setCadeiaT("TCATATGCAAATAGCTGCATACCGA");
    showMessage(getResult());
}//END FUNCTION

public static void showMessage(int n){
    System.out.println(n);
}//END FUNCTION

public static void showMessage(String str){
    System.out.println(str);
}//END FUNCTION
}//END CLASS