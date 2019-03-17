package sss.dpstate.state;

import sss.dpstate.context.MP3PlayerContext;

public class StandbyState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("In standby state..");
		context.setState(new PlayingState());
	}

}