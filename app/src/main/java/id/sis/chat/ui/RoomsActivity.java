package id.sis.chat.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import butterknife.Bind;
import id.zelory.benih.ui.BenihActivity;
import id.zelory.benih.ui.view.BenihRecyclerView;
import id.zelory.sischat.R;

/**
 * Created on : April 11, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class RoomsActivity extends BenihActivity {
    @Bind(R.id.recycler_view) BenihRecyclerView recyclerView;
    @Bind(R.id.button_add_room) FloatingActionButton addRoom;

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_rooms;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {

    }
}
