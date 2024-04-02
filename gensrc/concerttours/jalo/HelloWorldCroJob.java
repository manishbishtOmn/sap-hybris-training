/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2 Apr 2024, 15:18:31                        ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type HelloWorldCroJob.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class HelloWorldCroJob extends CronJob
{
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
}
