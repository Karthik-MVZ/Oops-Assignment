package com.zsgs.librasphere.features.borrowbooks.fine;

import com.zsgs.librasphere.features.base.BaseView;

public class FineView extends BaseView {

    private final FineModel model;

    public FineView() {
        model = new FineModel(this);
    }

    public void init() {
        model.init();
    }

    public void onSuccessLogin() {
        System.out.println("FineView: Login successful");
    }
}
