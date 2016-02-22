package id.sis.chat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.zelory.benih.ui.BenihActivity;
import id.zelory.sischat.R;

/**
 * Created on : February 22, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class SplashActivity extends BenihActivity {
    @Override
    protected int getResourceLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {
        new Handler().postDelayed(() -> startActivity(new Intent(this, MainActivity.class)), 1800);
    }
}
