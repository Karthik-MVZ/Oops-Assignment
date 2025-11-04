package com.zsgs.librasphere.features.registration;

import com.zsgs.librasphere.repository.dto.RegistrationInfo;

public interface IRegistrationPresenterToModel {
    void init();

    void registerUser(RegistrationInfo info);

    void validateCredentials(String userName, String passwordForLogin);
}
