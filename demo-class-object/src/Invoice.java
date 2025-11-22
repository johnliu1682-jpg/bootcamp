public class Invoice {

  // ! Attribute
  private String companyName;
  private String companyAddress;
  private String companyTelephone;
  private String companyEmail;
  private String clientName;
  private String clientAddress;
  private String currency;
  private double currencyRate;
  private String item1Description;
  private double item1Quantity;
  private double item1UnitPrice;
  private double item1Total;
  private String item2Description;
  private double item2Quantity;
  private double item2UnitPrice;
  private double item2Total;
  private String item3Description;
  private double item3Quantity;
  private double item3UnitPrice;
  private double item3Total;
  private double item4Quantity;
  private double total;
  private String beneficiaryName;
  private String beneficiaryBank;
  private int beneficiaryAccountNum;
  private Date dueDate;
  private Date invoiceDate;
  private boolean isDiscount;
  private boolean discountRate;

  // ! Constructor
  item1Total = item1Quantity * item1UnitPrice;
  item2Total = item2Quantity * item2UnitPrice;
  item3Total = item3Quantity * item3UnitPrice;
  if (isDiscount) {
    item1Total = item1Total * (1 - discountRate);
    item2Total = item2Total * (1 - discountRate);
    item3Total = item3Total * (1 - discountRate);
  }
  total = item1Total + item2Total + item3Total

  // * main -> testing
  
}
