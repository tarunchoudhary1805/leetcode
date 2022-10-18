// Given an integer, convert it to a roman numeral.
//function:

public String intToRoman(int num) {
        TreeMap<Integer,String> roman= new TreeMap<>();
        roman.put(1,"I");
        roman.put(4,"IV");
        roman.put(5,"V");
        roman.put(9,"IX");
        roman.put(10,"X");
        roman.put(40,"XL");
        roman.put(50,"L");
        roman.put(90,"XC");
        roman.put(100,"C");
        roman.put(400,"CD");
        roman.put(500,"D");
        roman.put(900,"CM");
        roman.put(1000,"M");
        String s="";
        while(num!=0)
        {
            
            Integer closestKey = roman.floorKey(num);
            s+=roman.get(closestKey);
            num=num-closestKey;
           
        }
        return s;
    }
