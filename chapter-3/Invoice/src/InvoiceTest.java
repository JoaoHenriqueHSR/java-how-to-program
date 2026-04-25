public class InvoiceTest {
    public static void main(String[] args){
        Invoice iv = new Invoice("436465", "PC", 10, 4690.99);

        System.out.printf("Valor do estoque: %.2f",iv.getInvoiceAmount());
    }
}
