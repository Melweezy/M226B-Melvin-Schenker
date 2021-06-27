package grafikeditor_0;

public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
            "Rechteck,100,300,20,50",
            "Kreis,250,30,300"
    };
    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if(currentFigur < testFiguren.length) {
            String[] figurData = testFiguren[currentFigur].split(",");
            currentFigur++;
            return figurData;
        }
        return null;
    }
}
