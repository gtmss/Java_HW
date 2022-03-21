package ch3.Ex_12_3;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice Invoice_AutodoctorSRL = new Invoice("2301", "Kit 1", 45, 27.04);
        Invoice Invoice_MegalartoSRL = new Invoice("3421", "Kit 2", 2, 36.22);

        System.out.println("Hardware store\n" +
                "___________________________");

        System.out.printf("AtodoctorSRL\n");
        System.out.printf("");
        System.out.printf("Invoice:%f\n",Invoice_AutodoctorSRL.getInvoiceAmount());
        System.out.printf("Part number - %s\n",Invoice_AutodoctorSRL.getPartNumber());
        System.out.printf("Price - %f\n",Invoice_AutodoctorSRL.getPriceItem());


        System.out.printf("\nMegalartoSRL\n");
        System.out.printf("Invoice:",Invoice_MegalartoSRL.getInvoiceAmount());
        System.out.printf("Part number - %s\n",Invoice_MegalartoSRL.getPartNumber());
        System.out.printf("Price - %f\n",Invoice_MegalartoSRL.getPriceItem());

        Invoice_AutodoctorSRL.setquantity(50);
        System.out.printf("\n\nAtodoctorSRL\n");
        System.out.printf("");
        System.out.printf("Invoice:%f\n",Invoice_AutodoctorSRL.getInvoiceAmount());
        System.out.printf("Part number - %s\n",Invoice_AutodoctorSRL.getPartNumber());
        System.out.printf("Price - %f\n",Invoice_AutodoctorSRL.getPriceItem());

    }
}
