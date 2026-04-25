public class Invoice {
    String num;
    String desc;
    int quantity;
    double price;

    public Invoice( String num, String desc, int quantity, double price ){
        this.num=num;
        this.desc=desc;
        this.quantity=quantity;
        this.price=price;
    }

    public double getInvoiceAmount(){
        double total = quantity*price;
        if(total<0){
            return 0;
        }
        return total;
    }
}
