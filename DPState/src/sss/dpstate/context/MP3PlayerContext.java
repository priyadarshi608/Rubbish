package sss.dpstate.context;

import sss.dpstate.state.PlayingState;
import sss.dpstate.state.State;

// Context class
public class MP3PlayerContext {

	private State state;
	
	public MP3PlayerContext() {
		this.state = new PlayingState();
	}
	
	public void pressPlayButton() {
		state.pressPlay(this);
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

}