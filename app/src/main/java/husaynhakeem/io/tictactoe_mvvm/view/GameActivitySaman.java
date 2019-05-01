package husaynhakeem.io.tictactoe_mvvm.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import husaynhakeem.io.tictactoe_mvvm.R;
import husaynhakeem.io.tictactoe_mvvm.databinding.ActivityGamesamanBinding;
import husaynhakeem.io.tictactoe_mvvm.viewmodel.GameViewModelSaman;


public class GameActivitySaman extends AppCompatActivity {
    private static final String GAME_BEGIN_DIALOG_TAG = "game_dialog_tag";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prompForPlayer();
    }

    private void prompForPlayer() {
        GameBeginDialogSaman gameBeginDialogSaman = GameBeginDialogSaman.newInstance(GameActivitySaman.this);
        gameBeginDialogSaman.setCancelable(false);
        gameBeginDialogSaman.show(getSupportFragmentManager(), GAME_BEGIN_DIALOG_TAG);

    }

    public void onPlayersSet(String player1, String player2) {
        initBinding(player1, player2);
    }

    private void initBinding(String player1, String player2) {
        ActivityGamesamanBinding activityGamesamanBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_gamesaman);


        GameViewModelSaman gameViewModelSaman = ViewModelProviders
                .of(GameActivitySaman.this)
                .get(GameViewModelSaman.class);

        gameViewModelSaman.init(player1, player2);
        activityGamesamanBinding.setGameViewModel2(gameViewModelSaman);
    }
}
