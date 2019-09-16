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
public class YBankCreditAdapter implements IBankAdapter, YBankCreditSenderListener {

    private YBankCreditApproveResult yresponse;
    
    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        YBankCreditApprove yrequest = new YBankCreditApprove();
        yrequest.setCredit((float)request.getRequestAmount());
        yrequest.setName(request.getCustomerName());
        YBankCreditSender sender = new YBankCreditSender();
        sender.sendCreditForValidate(yrequest, this);
        
        do{
            try{
                Thread.sleep(10000);
                System.out.println("YBank peticion en espera...");
            } catch(Exception e){
                e.printStackTrace();
            }
        } while(yresponse == null);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproval(yresponse.getApproved() == "Y"?true:false);
        return response;
    }

    @Override
    public void notifyCreditResult(YBankCreditApproveResult result) {
        this.yresponse = result;
    }
    
}
