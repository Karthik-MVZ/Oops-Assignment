package com.zsgs.librasphere.features.borrowbooks.feedback;

import com.zsgs.librasphere.features.base.BaseView;

public class FeedbackView extends BaseView {

    private final FeedbackModel model;

    public FeedbackView() {
        model = new FeedbackModel(this);
    }

    public void init() {
        model.init();
    }

    public void onSuccessLogin() {
        System.out.println("FeedbackView: Login successful");
    }
}
