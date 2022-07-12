import java.util.Scanner;
public class Horoscopes {
    public static void main(String[] args) {
        int month,day;
        boolean isError=false;
        String horoscope ="";
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter month: ");
        month= input.nextInt();
        System.out.printf("Enter day: ");
        day= input.nextInt();

        switch (month)
        {
            case 1:
            if(day>=1 && day<=31)
            {
                if(day<22)
                {
                    horoscope="Capricorn";
                }
                else
                {
                horoscope="Aquarius";
                }
            }
            else
                {
                isError=true;
                }
                break;
            case 2:
                if(day>=1 && day<=28)
                {
                    if(day<20)
                    {
                        horoscope="Aquarius";
                    }
                    else
                    {
                        horoscope="Pisces";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 3:
                if(day>=1 && day<=31)
                {
                    if(day<21)
                    {
                        horoscope="Pisces";
                    }
                    else
                    {
                        horoscope="aries";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 4:
                if(day>=1 && day<=31)
                {
                    if(day<21)
                    {
                        horoscope="aries";
                    }
                    else
                    {
                        horoscope="Taurus";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 5:
                if(day>=1 && day<=31)
                {
                    if(day<22)
                    {
                        horoscope="Taurus";
                    }
                    else
                    {
                        horoscope="Gemini";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 6:
                if(day>=1 && day<=31)
                {
                    if(day<23)
                    {
                        horoscope="Gemini";
                    }
                    else
                    {
                        horoscope="Cancer";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 7:
                if(day>=1 && day<=31)
                {
                    if(day<23)
                    {
                        horoscope="Cancer";
                    }
                    else
                    {
                        horoscope="leo";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 8:
                if(day>=1 && day<=31)
                {
                    if(day<23)
                    {
                        horoscope="leo";
                    }
                    else
                    {
                        horoscope="Virgo";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 9:
                if(day>=1 && day<=31)
                {
                    if(day<23)
                    {
                        horoscope="Virgo";
                    }
                    else
                    {
                        horoscope="Libra";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 10:
                if(day>=1 && day<=31)
                {
                    if(day<23)
                    {
                        horoscope="Libra";
                    }
                    else
                    {
                        horoscope="Scorpio";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 11:
                if(day>=1 && day<=31)
                {
                    if(day<22)
                    {
                        horoscope="Scorpio";
                    }
                    else
                    {
                        horoscope="Sagittarius";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            case 12:
                if(day>=1 && day<=31)
                {
                    if(day<22)
                    {
                        horoscope="Sagittarius";
                    }
                    else
                    {
                        horoscope="Capricorn";
                    }
                }
                else
                {
                    isError=true;
                }
                break;
            default:
                isError=true;
        }
        if (isError){
            System.out.println("Wrong Enter");
        }
        else {
            System.out.println("Your horoscope is : "+horoscope);
        }
        }

}
