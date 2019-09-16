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
public class ZBankCreditAPI {
    
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        BankCreditResponse response = new BankCreditResponse();
        if(3000 < request.getRequestAmount() && request.getRequestAmount() <= 8000){
            response.setApproval(false);
        }else{
            response.setApproval(true);
        }
        return response;
    }
}
