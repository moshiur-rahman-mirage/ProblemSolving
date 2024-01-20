package Leetcode;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanInteger {
    public static void main(String[] args) {
        Dictionary<Character,Integer> romanNumber=new Hashtable<>();
        romanNumber.put('I',1);
        romanNumber.put('V',5);
        romanNumber.put('X',10);
        romanNumber.put('L',50);
        romanNumber.put('C',100);
        romanNumber.put('D',500);
        romanNumber.put('M',1000);
        int result=0;

        String s = "MCMXCIV";
        for (int i=0;i<s.length();i++){
            if(i<s.length()-1 && romanNumber.get(s.charAt(i))<romanNumber.get(s.charAt(i+1))){
                result-=romanNumber.get(s.charAt(i));
            }else{
                result+=romanNumber.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
