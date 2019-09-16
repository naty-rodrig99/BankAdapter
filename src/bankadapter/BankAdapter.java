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
        
        AdapterConcrete adapter = new AdapterConcrete();
        BankCreditResponse xresponse = (BankCreditResponse)  adapter.getBank("XBank").sendCreditRequest(request);
        System.out.println("xBank approved > " + xresponse.getApproval() + "\n");
        
        BankCreditResponse zresponse = (BankCreditResponse)  adapter.getBank("ZBank").sendCreditRequest(request);
        System.out.println("zBank approved > " + zresponse.getApproval() + "\n");
        
        BankCreditResponse yresponse = (BankCreditResponse)  adapter.getBank("YBank").sendCreditRequest(request);
        System.out.println("yBank approved > " + yresponse.getApproval() + "\n");
        
        if(xresponse.getApproval() == true){
            System.out.println("xBank aprovo su credito, felicidades!!");
        } else if(yresponse.getApproval() == true){
            System.out.println("yBank aprovo su credito, felicidades!!");
        } else if(zresponse.getApproval() == true){
            System.out.println("zBank aprovo su credito, felicidades!!");
        } else {
            System.out.println("Lo sentimos su credito no ha sido aprobado.");
        }
        
        /*IBankAdapter xBank = new XBankCreditAdapter();
        BankCreditResponse xresponse = (BankCreditResponse) xBank.sendCreditRequest(request);
        System.out.println("xBank approved > " + xresponse.getApproval() + "\n");
        
        IBankAdapter zBank = new ZBankCreditAdapter();
        BankCreditResponse zresponse = (BankCreditResponse) zBank.sendCreditRequest(request);
        System.out.println("zBank approved > " + zresponse.getApproval() + "\n");
        
        IBankAdapter yBank = new YBankCreditAdapter();
        BankCreditResponse yresponse = (BankCreditResponse) yBank.sendCreditRequest(request);
        System.out.println("yBank approved > " + yresponse.getApproval() + "\n");*/
        
    }
    
}
