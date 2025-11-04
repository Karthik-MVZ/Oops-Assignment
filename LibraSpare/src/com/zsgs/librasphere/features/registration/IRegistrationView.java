package com.zsgs.librasphere.features.registration;

import com.zsgs.librasphere.repository.dto.RegistrationInfo;

public interface IRegistrationView {
    void proceedLogin();

    void proceedRegistration();

    void showErrorMessage(String errorMessage);

    void onRegistrationSuccess(RegistrationInfo info);

    void onSuccessLogin(String userName);

    void onInvalidCredentials();
}
