package sss.dpstate.state;

import sss.dpstate.context.MP3PlayerContext;

public class PlayingState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("In playing state..");
		context.setState(new StandbyState());
	}

}