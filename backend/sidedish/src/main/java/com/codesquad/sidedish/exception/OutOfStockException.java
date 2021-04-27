package com.codesquad.sidedish.exception;

public class OutOfStockException extends ApplicationException {

    public OutOfStockException() {
        super(ErrorCode.OUT_OF_STOCK);
    }
}
