package com.zsgs.librasphere.features.librarysetup.details;

import com.zsgs.librasphere.features.base.BaseModel;
import com.zsgs.librasphere.repository.db.LibraScopeDb;
import com.zsgs.librasphere.repository.dto.Library;

class LibraryDetailsModel extends BaseModel {
    private final LibraryDetailsView view;

    public LibraryDetailsModel(LibraryDetailsView view) {
        this.view = view;
    }

    void getLibraryDetails() {
        Library library = LibraScopeDb.getInstance().getLibrary();
        view.displayLibraryDetails(library);
    }
} 