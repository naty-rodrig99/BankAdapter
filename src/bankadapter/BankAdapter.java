/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankadapter;

/**
 *
 * @author naty9
 */
public class BankAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankCreditRequest request = new BankCreditRequest();
        request.setCustomerName("Oscar Balcarte");
        request.setRequestAmount(1000);
        
        IBankAdapter xBank = new XBankCreditAdapter();
        BankCreditResponse xresponse = (BankCreditResponse) xBank.sendCreditRequest(request);
        System.out.println("xBank approved>" + xresponse.getApproval() + "\n");
        
        IBankAdapter yBank = new YBankCreditAdapter();
        BankCreditResponse yresponse = (BankCreditResponse) yBank.sendCreditRequest(request);
        System.out.println("yBank approved>" + yresponse.getApproval() + "\n");
        
        if(xresponse.getApproval() == true){
            System.out.println("xBank aprovo su credito, felicidades!!");
        } else if(yresponse.getApproval() == true){
            System.out.println("yBank aprovo su credito, felicidades!!");
        } else {
            System.out.println("Lo sentimos su credito no ha sido aprobado.");
        }
    }
    
}
