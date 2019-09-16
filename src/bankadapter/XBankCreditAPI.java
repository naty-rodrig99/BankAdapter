package bankadapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naty9
 */
public class XBankCreditAPI {
    
    public BankCreditResponse sendCreditRequest(BankCreditRequest request){
        BankCreditResponse response = new BankCreditResponse();
        if(request.getRequestAmount() <= 5000){
            response.setApproval(true);
        }else{
            response.setApproval(false);
        }
        return response;
    }
}
