package com.zsgs.librasphere.features.borrowbooks.feedback;

import com.zsgs.librasphere.features.base.BaseModel;

class FeedbackModel extends BaseModel {

    private final FeedbackView view;

    public FeedbackModel(FeedbackView view) {
        this.view = view;
    }

    void init() {
        System.out.println("FeedbackModel - " + view);
    }
}
