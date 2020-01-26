class CreditCardValidator{

    private long cardNumber;

    public CreditCardValidator(long number){
        this.cardNumber = number;
    }

    public boolean validate(){
        
        return true;
    }

    public static void main(String[] args) {
        
        CreditCardValidator card ;
        long cardNumbers[] = {1234567891234L, 4567890123456L, 89076543212345L};

        for(long num : cardNumbers){
            card = new CreditCardValidator(num);
            System.out.println(num+" : "+card.validate());
        }

        System.out.println();
    }
}