package com.opensky.osis;

import com.braintreegateway.TransactionCloneRequest;
import com.braintreegateway.TransactionRequest;

public class DefaultBraintreeRequestFactoryImpl implements
        BraintreeRequestFactory
{

    @Override
    public TransactionCloneRequest transactionCloneRequest()
    {
        return new TransactionCloneRequest();
    }

    @Override
    public TransactionRequest transactionRequest()
    {
        return new TransactionRequest();
    }

}
