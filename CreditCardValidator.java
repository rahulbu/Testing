class CreditCardValidator{

    private long cardNumber;

    public CreditCardValidator(long number){
        this.cardNumber = number;
    }
    private int getLength(){
        return String.valueOf(this.cardNumber).length();
    }
    private int sumOfEvenPlaces(){
        int sum = 0;
        String num = String.valueOf(cardNumber);
        for(int i=num.length()-2; i>=0 ;i-=2){
            int digit = Integer.valueOf(num.charAt(i)+"");
            digit = digit*2;
            digit = (String.valueOf(digit).length() != 1) ? (digit -9):digit;
            sum += digit;
        }
        return sum;
    }
    private int sumOfOddPlaces(){
        int sum = 0;
        String num = String.valueOf(cardNumber);
        for(int i= num.length()-1;i>=0;i-=2){
            int digit = Integer.valueOf(num.charAt(i)+"");
            sum += digit;
        }
        return sum;
    }
    public boolean validate(){
        int len = getLength();
        if(len >= 13 && len <=16){ /* default credit card number lengths */
            if(((sumOfEvenPlaces() + sumOfOddPlaces()))%10 !=0 ){
                return false;
            }
        }
        else return false;
        return true;
    }

    public static void main(String[] args) {
        
        CreditCardValidator card ;
        
        long cardNumbers[] = {79927398713L, 4388576018402626L, 89076543212345L, 5196081888500645L, 4388576018402626L};

        for(long num : cardNumbers){
            card = new CreditCardValidator(num);
            System.out.println(num+" : "+card.validate());
        }
    }
}