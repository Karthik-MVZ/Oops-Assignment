package com.zsgs.librasphere.features.borrowbooks;

import com.zsgs.librasphere.features.base.BaseModel;

class BorrowBooksModel extends BaseModel {

    private final BorrowBooksView view;

    public BorrowBooksModel(BorrowBooksView view) {
        this.view = view;
    }

    void init() {
        System.out.println("BorrowbooksModel - " + view);
    }
}
