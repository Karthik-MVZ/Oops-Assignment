package com.zsgs.librasphere.features.registration;

import com.zsgs.librasphere.repository.dto.RegistrationInfo;

public interface IRegistrationModelToPresenter {
    void proceedLogin();

    void proceedRegistration();

    void showErrorMessage(String usernameAlreadyExist);

    void onRegistrationSuccess(RegistrationInfo info);

    void onSuccessLogin(String userName);

    void onInvalidCredentials();
}
