package lab_4.prob4C;

public final class Paycheck {
    private static Paycheck paycheck;

    private static final double FICA = 0.23;
    private static final double STATE_TAX = 0.05;
    private static final double LOCAL_TAX = 0.01;
    private static final double MEDICAL = 0.03;
    private static final double SOCIAL_SECURITY = 0.075;

    private double grossPay;
    private double amtFICA;
    private double amtState ;
    private double amtLocal;
    private double amtMedical;
    private double amtSocialSecurity;

    private Paycheck ()
    {

    }

    public static Paycheck calcPaycheck(double grossPay)
    {
        paycheck = new Paycheck();
        paycheck.grossPay = grossPay;
        paycheck.amtFICA =  grossPay * FICA;
        paycheck.amtState =  grossPay * STATE_TAX;
        paycheck.amtLocal =grossPay * LOCAL_TAX;
        paycheck.amtMedical =grossPay * MEDICAL;
        paycheck.amtSocialSecurity =  grossPay * SOCIAL_SECURITY;

        return paycheck;

    }

    public String toString(){
        return "paycheck Fica" + paycheck.getFICA();
    }


    public double getFICA(){
        return amtFICA;
    }

    public double getState(){
        return amtState;
    }

    public double getLocal(){
        return amtLocal;
    }

    public double getMedical(){
        return amtMedical;
    }

    public double getSocialSecurity(){
        return amtSocialSecurity;
    }

    public double getGrossPay(){return grossPay; }



}
