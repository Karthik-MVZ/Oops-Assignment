package com.zsgs.librasphere.features.registration;

import com.zsgs.librasphere.repository.dto.RegistrationInfo;

public class RegistrationPresenter implements IRegistrationPresenter, IRegistrationModelToPresenter {

    private final IRegistrationView view;
    private final IRegistrationPresenterToModel model;

    public RegistrationPresenter(IRegistrationView registrationView) {
        view = registrationView;
        model = new RegistrationModel(this);
    }

    public void init() {
        model.init();
    }

    public void registerUser(RegistrationInfo info) {
        model.registerUser(info);
    }

    public void validateCredentials(String userName, String passwordForLogin) {
        model.validateCredentials(userName, passwordForLogin);
    }

    public void proceedLogin() {
        view.proceedLogin();
    }

    public void proceedRegistration() {
        view.proceedRegistration();
    }

    public void showErrorMessage(String errorMessage) {
        view.showErrorMessage(errorMessage);
    }

    public void onRegistrationSuccess(RegistrationInfo info) {
        view.onRegistrationSuccess(info);
    }

    public void onSuccessLogin(String userName) {
        view.onSuccessLogin(userName);
    }

    public void onInvalidCredentials() {
        view.onInvalidCredentials();
    }
}
