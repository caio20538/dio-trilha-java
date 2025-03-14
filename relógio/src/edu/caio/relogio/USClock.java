package edu.caio.relogio;

public non-sealed class USClock extends Clock{
	private String periodIndicatorString;
	
	public void setHour(int hour) {
		this.periodIndicatorString = "AM";
		if ((hour > 12) && (hour <= 23)) {
			this.periodIndicatorString = "PM";
			this.hour = hour - 12;
			return;
		}
		
		if (hour >= 24) {
			this.hour = 0;
			return;
		}
		
		this.hour = hour;
	}
	
	public String getPeriodIndicatorString() {
		return periodIndicatorString;
	}

	@Override
	Clock convertClock(Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		switch (clock) {
			case USClock usClock -> this.hour = usClock.getHour(); 
			case BRLClock brlClock -> this.setHour(brlClock.getHour());
			
			
		}
		return this;
	}
	
	@Override
	public String getTime() {
		return super.getTime() + " " + this.periodIndicatorString;
	}

}
