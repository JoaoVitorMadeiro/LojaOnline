package com.lojaonline.user.usecase.usecases;

public interface TransactionStatusUsecase {
    void createTransactionStatus();
    void getTransactionStatus();
    void updateTransactionStatus();
    void deleteTransactionStatus();

    void getTransactionStatusByUser();
    void getTransactionStatusByUserAndStore();
    void getTransactionStatusByStore();
    void getTransactionStatusByStoreAndUser();
    void getTransactionStatusByStoreAndUserAndDate();
    void getTransactionStatusByStoreAndUserAndDateRange();
    void getTransactionStatusByStoreAndUserAndTransactionType();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndDate();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndDateRange();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndDateAndValue();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndDateRangeAndValue();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndValue();
    void getTransactionStatusByStoreAndUserAndTransactionTypeAndValueRange();
    void getTransactionStatusByStoreAndUserAndValue();
    void getTransactionStatusByStoreAndUserAndValueRange();
    void getTransactionStatusByStoreAndValue();
    void getTransactionStatusByStoreAndValueRange();
    void getTransactionStatusByTransactionType();
    void getTransactionStatusByTransactionTypeAndDate();
    void getTransactionStatusByTransactionTypeAndDateRange();
    void getTransactionStatusByTransactionTypeAndDateAndValue();
    void getTransactionStatusByTransactionTypeAndDateRangeAndValue();
    void getTransactionStatusByTransactionTypeAndValue();
    void getTransactionStatusByTransactionTypeAndValueRange();
    void getTransactionStatusByUserAndDate();
    void getTransactionStatusByUserAndDateRange();
    void getTransactionStatusByUserAndTransactionType();
    void getTransactionStatusByUserAndTransactionTypeAndDate();
    void getTransactionStatusByUserAndTransactionTypeAndDateRange();
    void getTransactionStatusByUserAndTransactionTypeAndDateAndValue();
    void getTransactionStatusByUserAndTransactionTypeAndDateRangeAndValue();
    void getTransactionStatusByUserAndTransactionTypeAndValue();
    void getTransactionStatusByUserAndTransactionTypeAndValueRange();
    void getTransactionStatusByUserAndValue();
    void getTransactionStatusByUserAndValueRange();
    void getTransactionStatusByValue();
    void getTransactionStatusByValueRange();
    void getTransactionStatusByDate();
    void getTransactionStatusByDateRange();
    void getTransaction();

}
