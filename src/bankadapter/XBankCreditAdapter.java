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
public class XBankCreditAdapter implements IBankAdapter {

    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        BankCreditRequest xrequest = new BankCreditRequest();
        xrequest.setCustomerName(request.getCustomerName());
        xrequest.setRequestAmount(request.getRequestAmount());
        
        XBankCreditAPI api = new XBankCreditAPI();
        BankCreditResponse xresponse = api.sendCreditRequest(xrequest);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproval(xresponse.getApproval());
        return response;
    }
    
}
