package bowling.state;

public interface State {

  State nextPitch(int fallenPin);

  boolean isFinish();

  String Score();
}