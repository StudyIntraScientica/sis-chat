package id.sis.chat;

import android.app.Application;

import id.zelory.sischat.BuildConfig;
import timber.log.Timber;

/**
 * Created on : February 22, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class SisChatApp extends Application {
    private static SisChatApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;

        if (BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static SisChatApp pluck() {
        return INSTANCE;
    }
}
