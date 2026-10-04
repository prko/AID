+ String {
	aid {
		if("(.htm(|l))|(http(|s)://)".matchRegexp(this)) {
			var targetUrl = this;

			if(targetUrl.beginsWith("/") or: { targetUrl[1] == $: }) {
				targetUrl = URI.fromLocalPath(targetUrl).asString;
			};

			HelpBrowser.goTo(targetUrl)
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