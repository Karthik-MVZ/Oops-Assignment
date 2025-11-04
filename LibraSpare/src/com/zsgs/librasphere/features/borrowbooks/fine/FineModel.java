package com.zsgs.librasphere.features.borrowbooks.fine;

import com.zsgs.librasphere.features.base.BaseModel;

class FineModel extends BaseModel {

    private final FineView view;

    public FineModel(FineView view) {
        this.view = view;
    }

    void init() {
        System.out.println("FineModel - " + view);
    }
}
