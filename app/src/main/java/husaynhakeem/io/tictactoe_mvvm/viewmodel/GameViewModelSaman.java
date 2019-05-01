package husaynhakeem.io.tictactoe_mvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayMap;
import android.util.Log;

public class GameViewModelSaman extends ViewModel {
    public ObservableArrayMap<String, String> cells;

    public void init(String player1, String player2) {
        cells = new ObservableArrayMap<>();
        cells.put(player1, player2);
        cells.put("00", "00");
        cells.put("01", "01");
        cells.put("02", "02");
    }



    public void onClickedCellAt(int row, int column) {
        Log.i("saman >> ", row + " --- " + column);
        cells.put(row + "" + column, String.valueOf(System.currentTimeMillis()));
    }
}
