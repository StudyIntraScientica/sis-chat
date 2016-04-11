package id.sis.chat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.OnClick;
import id.sis.chat.data.local.LocalDataManager;
import id.zelory.benih.ui.BenihActivity;
import id.zelory.sischat.R;

/**
 * Created on : April 11, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class InputNameActivity extends BenihActivity {

    @Bind(R.id.input_name) EditText inputName;

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_input_name;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {

    }

    @OnClick(R.id.button_submit)
    public void submitName() {
        String name = inputName.getText().toString();
        if (name.trim().isEmpty()) {
            inputName.setError("Please insert name here!");
        } else {
            LocalDataManager.getInstance()
                    .saveName(inputName.getText().toString());
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }
}
