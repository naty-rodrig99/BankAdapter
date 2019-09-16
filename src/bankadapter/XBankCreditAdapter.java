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

    public XBankCreditResponse sendCreditRequest(XBankCreditRequest request) {
        XBankCreditRequest xrequest = new XBankCreditRequest();
        xrequest.setCustomerName(request.getCustomerName());
        xrequest.setRequestAmount(request.getRequestAmount());
        
        XBankCreditAPI api = new XBankCreditAPI();
        XBankCreditResponse xresponse = api.sendCreditRequest(xrequest);
        
        XBankCreditResponse response = new XBankCreditResponse();
        response.setAproval(true);
        return response;
    }

    @Override
    public Object sendCreditRequest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
