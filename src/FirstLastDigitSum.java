public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number)
    {


        if (number < 0)
        {
            return -1 ;

        }

        int lastnumber = number % 10 ;
        int firstnumber = 0 ;

        if (number < 10)
        {
            int total = 2 * number ;
            return total ;
        }
        while (number != 0)
        {
            number = number / 10 ;
            if (number < 10)
            {
                firstnumber = number ;
                break;
            }
        }
        return (lastnumber + firstnumber) ;

    }
}
