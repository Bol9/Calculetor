package soon;

public class RomenConverter {
    public static StringBuilder rimNumberCoverter(int number){
        String[] romanLiterals = {"M",  "CM"   ,"D"  ,"CD"   ,"C"   ,"XC" ,"L", "XL" ,"X" ,"IX","V","IV","I"};
        int[] numbers =           {1000,  900,  500,  400    ,100   ,90   ,50,  40   ,10,   9,   5,  4,  1};
        StringBuilder romenNumber = new StringBuilder();

        for (int i = 0; i < 13; i++) {
            while (number>=numbers[i]){
                number-=numbers[i];
                romenNumber.append(romanLiterals[i]);

            }

        }
        return romenNumber;

    }
}
