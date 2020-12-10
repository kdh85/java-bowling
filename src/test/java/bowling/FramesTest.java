package bowling;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FramesTest {
    @Test
    public void createTest() {
        Frames frames = Frames.init();
        assertThat(frames.size()).isEqualTo(10);
    }

    @Test
    @DisplayName("프레임이 모두 끝난 경우 isEnd() true")
    public void bowlingGameTest() {
        Frames frames = Frames.init();

        for (int i = 1; i <= Frames.MAX_FRAME_SIZE + 2; i++) {
            frames.setKnockDownPins(10);
        }
        assertThat(frames.isEnd()).isTrue();
    }
}
