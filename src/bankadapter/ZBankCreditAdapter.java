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
public class ZBankCreditAdapter implements IBankAdapter {

    @Override
    public Object sendCreditRequest(BankCreditRequest request) {
        BankCreditRequest zrequest = new BankCreditRequest();
        zrequest.setCustomerName(request.getCustomerName());
        zrequest.setRequestAmount(request.getRequestAmount());
        
        ZBankCreditAPI api = new ZBankCreditAPI();
        BankCreditResponse zresponse = api.sendCreditRequest(zrequest);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproval(zresponse.getApproval());
        return response;
    }
    
}
