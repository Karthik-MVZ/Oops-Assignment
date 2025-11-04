package com.zsgs.librasphere.features.users;

import com.zsgs.librasphere.features.base.BaseModel;
import com.zsgs.librasphere.repository.db.LibraScopeDb;
import com.zsgs.librasphere.repository.dto.User;
import java.util.List;

class UsersModel extends BaseModel {

    private final UsersView view;

    public UsersModel(UsersView view) {
        this.view = view;
    }

    void listAllUsers() {
        List<User> users = LibraScopeDb.getInstance().getAllUsers();
        view.displayUsers(users);
    }
}
