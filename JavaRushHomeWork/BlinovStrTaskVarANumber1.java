/*
В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader1.readLine());
        String symbol = reader2.readLine();
        String string = "  I'm from Belarus, i'm living in Minsk  ";
        string = string.trim();
        String arrayString[] = string.split(" ");
        for(int i = 0; i < arrayString.length ; i++){
            if(arrayString[i].length() >= number){
                String arrSubStr[] = arrayString[i].split("");
               arrayString[i] =  arrayString[i].replace(arrSubStr[number - 1], symbol);
            }
            System.out.print(arrayString[i] + " ");
        }


        }
    }