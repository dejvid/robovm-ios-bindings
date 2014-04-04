
package org.robovm.bindings.googleanalytics;

import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/** Extends UIViewController to generate Google Analytics appview calls whenever the view appears; this is done by overriding the
 * `viewDidAppear:` method. The screen name must be set for any tracking calls to be made.
 * 
 * By default, this will use [GAI defaultTracker] for tracking calls, but one can override this by setting the tracker property. */
@NativeClass
public class GAITrackedViewController extends UIViewController {

	/** The tracker on which view tracking calls are be made, or `nil`, in which case [GAI defaultTracker] will be used. */
	@Property
	public native GAIDefaultTracker getTracker ();

	@Property
	public native void setTracker (GAITracker tracker);

	/** The screen name, for purposes of Google Analytics tracking. If this is `nil`, no tracking calls will be made. */
	@Property
	public native String getScreenName ();

	@Property
	public native void setScreenName (String screenName);
}
