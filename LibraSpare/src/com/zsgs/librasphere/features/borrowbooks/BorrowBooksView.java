package com.zsgs.librasphere.features.borrowbooks;

import com.zsgs.librasphere.features.base.BaseView;

public class BorrowBooksView extends BaseView {

    private final BorrowBooksModel model;

    public BorrowBooksView() {
        model = new BorrowBooksModel(this);
    }

    public void init() {
        model.init();
    }

    public void onSuccessLogin() {
        System.out.println("BorrowbooksView: Login successful");
    }
}
