package bowling.state;

public abstract class Running implements State {

  @Override
  public boolean isFinish() {
    return false;
  }
}