package com.test.FormLogin.module.login;

import com.test.FormLogin.base.BasePresenter;
import com.test.FormLogin.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
