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
public class AdapterConcrete {

    public IBankAdapter getBank(String bank) {
        switch(bank){
            case "XBank":
                return new XBankCreditAdapter();
            case "YBank":
                return new YBankCreditAdapter();
            case "ZBank":
                return new ZBankCreditAdapter();
            default:
                throw new IllegalArgumentException("Error"); 
        }
    }


}
