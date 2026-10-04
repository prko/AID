+ String {
	aid {
		var isInsideQuarks = false;
		var targetUrl = this;
		var path = this.standardizePath;

		if(this.beginsWith("/") or: { this[1] == $: }) {
			var quarksURI = URI.fromLocalPath(Quarks.folder).asString;

			targetUrl = URI.fromLocalPath(this).asString;

			if(thisProcess.platform.name == \windows) {
				isInsideQuarks = targetUrl.toLower.beginsWith(quarksURI.toLower);
			} {
				isInsideQuarks = targetUrl.beginsWith(quarksURI);
			};
		};

		if("(.htm(|l))|(http(|s)://)".matchRegexp(this) or: { isInsideQuarks and: { PathName(path).isFolder } }) {
			HelpBrowser.goTo(targetUrl)
		} {
			if(File.exists(path)) {
				path.openOS
			} {
				if(this.endsWith(".scd")) {
					(thisProcess.nowExecutingPath.dirname +/+ this).openDocument
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
}
