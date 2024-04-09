/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Apr 2024, 18:58:06                        ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Student;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type Subject.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Subject extends GenericItem
{
	/** Qualifier of the <code>Subject.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Subject.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Subject.marks</code> attribute **/
	public static final String MARKS = "marks";
	/** Qualifier of the <code>Subject.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>Subject.students</code> attribute **/
	public static final String STUDENTS = "students";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STUDENTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Subject> STUDENTSHANDLER = new BidirectionalOneToManyHandler<Subject>(
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
		tmp.put(MARKS, AttributeMode.INITIAL);
		tmp.put(GRADE, AttributeMode.INITIAL);
		tmp.put(STUDENTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STUDENTSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.grade</code> attribute.
	 * @return the grade - Subject grade
	 */
	public String getGrade(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "grade".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.grade</code> attribute.
	 * @return the grade - Subject grade
	 */
	public String getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.grade</code> attribute. 
	 * @param value the grade - Subject grade
	 */
	public void setGrade(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "grade".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.grade</code> attribute. 
	 * @param value the grade - Subject grade
	 */
	public void setGrade(final String value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.id</code> attribute.
	 * @return the id - Subject unique id
	 */
	public Long getId(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "id".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.id</code> attribute.
	 * @return the id - Subject unique id
	 */
	public Long getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.id</code> attribute. 
	 * @return the id - Subject unique id
	 */
	public long getIdAsPrimitive(final SessionContext ctx)
	{
		Long value = getId( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.id</code> attribute. 
	 * @return the id - Subject unique id
	 */
	public long getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.id</code> attribute. 
	 * @param value the id - Subject unique id
	 */
	public void setId(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "id".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.id</code> attribute. 
	 * @param value the id - Subject unique id
	 */
	public void setId(final Long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.id</code> attribute. 
	 * @param value the id - Subject unique id
	 */
	public void setId(final SessionContext ctx, final long value)
	{
		setId( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.id</code> attribute. 
	 * @param value the id - Subject unique id
	 */
	public void setId(final long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.marks</code> attribute.
	 * @return the marks - Subject Marks
	 */
	public Long getMarks(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "marks".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.marks</code> attribute.
	 * @return the marks - Subject Marks
	 */
	public Long getMarks()
	{
		return getMarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.marks</code> attribute. 
	 * @return the marks - Subject Marks
	 */
	public long getMarksAsPrimitive(final SessionContext ctx)
	{
		Long value = getMarks( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.marks</code> attribute. 
	 * @return the marks - Subject Marks
	 */
	public long getMarksAsPrimitive()
	{
		return getMarksAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.marks</code> attribute. 
	 * @param value the marks - Subject Marks
	 */
	public void setMarks(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "marks".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.marks</code> attribute. 
	 * @param value the marks - Subject Marks
	 */
	public void setMarks(final Long value)
	{
		setMarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.marks</code> attribute. 
	 * @param value the marks - Subject Marks
	 */
	public void setMarks(final SessionContext ctx, final long value)
	{
		setMarks( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.marks</code> attribute. 
	 * @param value the marks - Subject Marks
	 */
	public void setMarks(final long value)
	{
		setMarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute.
	 * @return the name - Subject name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute.
	 * @return the name - Subject name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name - Subject name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name - Subject name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.students</code> attribute.
	 * @return the students
	 */
	public Student getStudents(final SessionContext ctx)
	{
		return (Student)getProperty( ctx, "students".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.students</code> attribute.
	 * @return the students
	 */
	public Student getStudents()
	{
		return getStudents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.students</code> attribute. 
	 * @param value the students
	 */
	public void setStudents(final SessionContext ctx, final Student value)
	{
		STUDENTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.students</code> attribute. 
	 * @param value the students
	 */
	public void setStudents(final Student value)
	{
		setStudents( getSession().getSessionContext(), value );
	}
	
}
