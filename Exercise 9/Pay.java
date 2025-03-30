interface Payment {
    void processPayment(double amount);
    void issueRefund(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
    
    public void issueRefund(double amount) {
        System.out.println("Issuing credit card refund of $" + amount);
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    
    public void issueRefund(double amount) {
        System.out.println("Issuing PayPal refund of $" + amount);
    }
}

public class Pay {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
        
        creditCard.processPayment(100);
        creditCard.issueRefund(20);
        
        payPal.processPayment(200);
        payPal.issueRefund(50);
    }
}
