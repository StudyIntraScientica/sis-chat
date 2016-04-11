package id.sis.chat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.sis.chat.data.local.LocalDataManager;
import id.zelory.benih.ui.BenihActivity;
import id.zelory.sischat.R;
import timber.log.Timber;

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
        try {
            String name = LocalDataManager.getInstance().getSavedName();
            Timber.d("Name: " + name);
            new Handler().postDelayed(() -> startActivity(new Intent(this, RoomsActivity.class)), 1800);
        } catch (RuntimeException e) {
            e.printStackTrace();
            new Handler().postDelayed(() -> startActivity(new Intent(this, InputNameActivity.class)), 1800);
        }
    }
}
