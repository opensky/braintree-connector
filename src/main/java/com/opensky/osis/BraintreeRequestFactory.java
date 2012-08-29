package com.opensky.osis;

import com.braintreegateway.TransactionCloneRequest;
import com.braintreegateway.TransactionRequest;

public interface BraintreeRequestFactory
{
    public TransactionCloneRequest transactionCloneRequest();
    public TransactionRequest transactionRequest();
}
