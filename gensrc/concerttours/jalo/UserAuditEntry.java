/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 Mar 2024, 12:22:35                       ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type UserAuditEntry.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class UserAuditEntry extends GenericItem
{
	/** Qualifier of the <code>UserAuditEntry.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>UserAuditEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>UserAuditEntry.displayName</code> attribute **/
	public static final String DISPLAYNAME = "displayName";
	/** Qualifier of the <code>UserAuditEntry.changeTimestamp</code> attribute **/
	public static final String CHANGETIMESTAMP = "changeTimestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DISPLAYNAME, AttributeMode.INITIAL);
		tmp.put(CHANGETIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.changeTimestamp</code> attribute.
	 * @return the changeTimestamp
	 */
	public Date getChangeTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, "changeTimestamp".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.changeTimestamp</code> attribute.
	 * @return the changeTimestamp
	 */
	public Date getChangeTimestamp()
	{
		return getChangeTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.changeTimestamp</code> attribute. 
	 * @param value the changeTimestamp
	 */
	public void setChangeTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, "changeTimestamp".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.changeTimestamp</code> attribute. 
	 * @param value the changeTimestamp
	 */
	public void setChangeTimestamp(final Date value)
	{
		setChangeTimestamp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.displayName</code> attribute.
	 * @return the displayName
	 */
	public String getDisplayName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "displayName".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.displayName</code> attribute.
	 * @return the displayName
	 */
	public String getDisplayName()
	{
		return getDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setDisplayName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "displayName".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setDisplayName(final String value)
	{
		setDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "uid".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserAuditEntry.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "uid".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserAuditEntry.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
