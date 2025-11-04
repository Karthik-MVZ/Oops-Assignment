package com.zsgs.librasphere.features.registration;

import com.zsgs.librasphere.features.base.BaseModel;
import com.zsgs.librasphere.repository.db.LibraScopeDb;
import com.zsgs.librasphere.repository.dto.RegistrationInfo;

public class RegistrationModel extends BaseModel implements IRegistrationPresenterToModel{
    private final IRegistrationModelToPresenter presenter;

    public RegistrationModel(RegistrationPresenter registrationPresenter) {
        presenter = registrationPresenter;
    }

    public void init() {
        if (LibraScopeDb.getInstance().getRegistrationInfo() != null) {
            presenter.proceedLogin();
        } else {
            presenter.proceedRegistration();
        }
    }

    public void registerUser(RegistrationInfo info) {
        if (ifAlreadyExisit(info.getUserName())) {
            presenter.showErrorMessage("Username already Exist");
        } else if (isWeakPassword()) {
            presenter.showErrorMessage("Please enter strong password");
        } else {
            LibraScopeDb.getInstance().setRegistrationInfo(info);
            presenter.onRegistrationSuccess(info);
        }
    }

    private boolean isWeakPassword() {
        return false; // Write your logics here
    }

    private boolean ifAlreadyExisit(String userName) {
        return false;
    }

    public void validateCredentials(String userName, String password) {
        if(LibraScopeDb.getInstance().validateLoginIngo(userName,password)){
            presenter.onSuccessLogin(userName);
        } else{
            presenter.onInvalidCredentials();
        }
    }
}
