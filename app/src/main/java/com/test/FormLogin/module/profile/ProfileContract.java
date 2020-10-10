package com.test.FormLogin.module.profile;

import com.test.FormLogin.base.BasePresenter;
import com.test.FormLogin.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void goBackToLogin();

        void updateProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
