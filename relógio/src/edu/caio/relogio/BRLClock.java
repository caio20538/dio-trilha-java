package edu.caio.relogio;

public non-sealed class BRLClock extends Clock {

	
	@Override
	public Clock convertClock(Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		switch (clock) {
			case USClock usClock -> this.hour = (usClock.getPeriodIndicatorString().equals("PM") ? usClock.getHour() + 12: usClock.getHour());
			case BRLClock brlClock -> this.hour = brlClock.getHour();
		}
		return this;
	}
}
