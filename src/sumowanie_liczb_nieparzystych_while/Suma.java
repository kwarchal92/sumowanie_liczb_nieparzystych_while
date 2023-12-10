package sumowanie_liczb_nieparzystych_while;

public class Suma {

    public static void main(String[] args)
    {
        int i = 1, suma =0;

        while(i <= 100)
        {
            if(!(i % 2 == 0)) suma += i;
            i++;
        }

        System.out.println("Suma liczb nieparzystych 1 do 100 wynosi:\t" + suma);

    }
}
