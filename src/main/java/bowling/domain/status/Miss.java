package bowling.domain.status;

import bowling.domain.score.Score;

public class Miss extends FrameStatus {

    public Miss(int firstCountOfPin, int secondCountOfPin) {
       this.firstCountOfPin = firstCountOfPin;
       this.secondCountOfPin = secondCountOfPin;
    }

    @Override
    public FrameStatus bowl(int countOfPin) {
        if (this.secondCountOfPin + countOfPin == 10) {
            return new Spare(this.secondCountOfPin, countOfPin);
        }

        return new Miss(this.secondCountOfPin, countOfPin);
    }

    @Override
    public Score findScore() {
        return Score.ofMiss(firstCountOfPin + secondCountOfPin);
    }
}