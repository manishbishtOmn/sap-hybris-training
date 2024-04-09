/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Apr 2024, 18:58:06                        ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Author.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Author extends GenericItem
{
	/** Qualifier of the <code>Author.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Author.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Author.books</code> attribute **/
	public static final String BOOKS = "books";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(BOOKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books - Author written books
	 */
	public List<String> getBooks(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, "books".intern());
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books - Author written books
	 */
	public List<String> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books - Author written books
	 */
	public void setBooks(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, "books".intern(),value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books - Author written books
	 */
	public void setBooks(final List<String> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.id</code> attribute.
	 * @return the id - Author id
	 */
	public Long getId(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "id".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.id</code> attribute.
	 * @return the id - Author id
	 */
	public Long getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.id</code> attribute. 
	 * @return the id - Author id
	 */
	public long getIdAsPrimitive(final SessionContext ctx)
	{
		Long value = getId( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.id</code> attribute. 
	 * @return the id - Author id
	 */
	public long getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.id</code> attribute. 
	 * @param value the id - Author id
	 */
	public void setId(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "id".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.id</code> attribute. 
	 * @param value the id - Author id
	 */
	public void setId(final Long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.id</code> attribute. 
	 * @param value the id - Author id
	 */
	public void setId(final SessionContext ctx, final long value)
	{
		setId( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.id</code> attribute. 
	 * @param value the id - Author id
	 */
	public void setId(final long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name - author name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.name</code> attribute.
	 * @return the name - author name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name - author name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.name</code> attribute. 
	 * @param value the name - author name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
