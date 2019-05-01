package husaynhakeem.io.tictactoe_mvvm.model;

import java.util.ArrayList;
import java.util.List;

public class Colors {
    private List<CellColor> cellColors = new ArrayList<>();

    public void setCellColors(CellColor cellColor) {

        cellColors.add(cellColor);
    }
}
