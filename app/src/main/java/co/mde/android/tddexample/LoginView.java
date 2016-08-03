package co.mde.android.tddexample;

public interface LoginView {
  String username();

  String password();

  void showLoading();

  void showLogin();

  void hideLoading();

  void showLoginError();
}
