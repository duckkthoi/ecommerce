package com.uthiduck.ecommerce.modal;

import lombok.Data;

@Data
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;

    //the correct field name should be isfcCode but the author was so high that he wrote the wrong name
    private  String issCode;
}
