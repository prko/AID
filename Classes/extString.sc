+ String {
	aid {
		if("(.htm(|l))|(http(|s)://)".matchRegexp(this)) {
			HelpBrowser.goTo(this)
		} {
			if(File.exists(this.standardizePath)) {
				this.standardizePath.openOS
			} {
				if(Platform.openHelpFileAction.notNil) {
					Platform.openHelpFileAction.value(this)
				} {
					HelpBrowser.openHelpFor(this)
				}
			}
		}
	}
}