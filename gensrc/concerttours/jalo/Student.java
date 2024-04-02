/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2 Apr 2024, 15:18:31                        ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Subject;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type Student.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Student extends GenericItem
{
	/** Qualifier of the <code>Student.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Student.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Student.rollNumber</code> attribute **/
	public static final String ROLLNUMBER = "rollNumber";
	/** Qualifier of the <code>Student.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Student.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/**
	* {@link OneToManyHandler} for handling 1:n SUBJECT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Subject> SUBJECTHANDLER = new OneToManyHandler<Subject>(
	ConcerttoursConstants.TC.SUBJECT,
	false,
	"students",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ROLLNUMBER, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.address</code> attribute.
	 * @return the address - Student Address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "address".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.address</code> attribute.
	 * @return the address - Student Address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.address</code> attribute. 
	 * @param value the address - Student Address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "address".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.address</code> attribute. 
	 * @param value the address - Student Address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id - Student unique id
	 */
	public Long getId(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "id".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id - Student unique id
	 */
	public Long getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id - Student unique id
	 */
	public long getIdAsPrimitive(final SessionContext ctx)
	{
		Long value = getId( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id - Student unique id
	 */
	public long getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id - Student unique id
	 */
	public void setId(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "id".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id - Student unique id
	 */
	public void setId(final Long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id - Student unique id
	 */
	public void setId(final SessionContext ctx, final long value)
	{
		setId( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id - Student unique id
	 */
	public void setId(final long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name - Student name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name - Student name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name - Student name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name - Student name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.rollNumber</code> attribute.
	 * @return the rollNumber - Roll Number
	 */
	public Long getRollNumber(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "rollNumber".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.rollNumber</code> attribute.
	 * @return the rollNumber - Roll Number
	 */
	public Long getRollNumber()
	{
		return getRollNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.rollNumber</code> attribute. 
	 * @return the rollNumber - Roll Number
	 */
	public long getRollNumberAsPrimitive(final SessionContext ctx)
	{
		Long value = getRollNumber( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.rollNumber</code> attribute. 
	 * @return the rollNumber - Roll Number
	 */
	public long getRollNumberAsPrimitive()
	{
		return getRollNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.rollNumber</code> attribute. 
	 * @param value the rollNumber - Roll Number
	 */
	public void setRollNumber(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "rollNumber".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.rollNumber</code> attribute. 
	 * @param value the rollNumber - Roll Number
	 */
	public void setRollNumber(final Long value)
	{
		setRollNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.rollNumber</code> attribute. 
	 * @param value the rollNumber - Roll Number
	 */
	public void setRollNumber(final SessionContext ctx, final long value)
	{
		setRollNumber( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.rollNumber</code> attribute. 
	 * @param value the rollNumber - Roll Number
	 */
	public void setRollNumber(final long value)
	{
		setRollNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.subject</code> attribute.
	 * @return the subject
	 */
	public Set<Subject> getSubject(final SessionContext ctx)
	{
		return (Set<Subject>)SUBJECTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.subject</code> attribute.
	 * @return the subject
	 */
	public Set<Subject> getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final SessionContext ctx, final Set<Subject> value)
	{
		SUBJECTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final Set<Subject> value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to subject. 
	 * @param value the item to add to subject
	 */
	public void addToSubject(final SessionContext ctx, final Subject value)
	{
		SUBJECTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to subject. 
	 * @param value the item to add to subject
	 */
	public void addToSubject(final Subject value)
	{
		addToSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from subject. 
	 * @param value the item to remove from subject
	 */
	public void removeFromSubject(final SessionContext ctx, final Subject value)
	{
		SUBJECTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from subject. 
	 * @param value the item to remove from subject
	 */
	public void removeFromSubject(final Subject value)
	{
		removeFromSubject( getSession().getSessionContext(), value );
	}
	
}
