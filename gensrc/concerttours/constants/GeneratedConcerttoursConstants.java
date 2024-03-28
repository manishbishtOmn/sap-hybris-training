/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27 Mar 2024, 16:10:32                       ---
 * ----------------------------------------------------------------
 */
package concerttours.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedConcerttoursConstants
{
	public static final String EXTENSIONNAME = "concerttours";
	public static class TC
	{
		public static final String AUTHOR = "Author".intern();
		public static final String BAND = "Band".intern();
		public static final String CONCERT = "Concert".intern();
		public static final String CONCERTTYPE = "ConcertType".intern();
		public static final String MUSICTYPE = "MusicType".intern();
		public static final String NEWS = "News".intern();
		public static final String STUDENT = "Student".intern();
		public static final String SUBJECT = "Subject".intern();
		public static final String USERAUDITENTRY = "UserAuditEntry".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String BANDS = "bands".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
			public static final String HASHTAG = "hashtag".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConcertType
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
		public static class MusicType
		{
			// no values defined
		}
	}
	public static class Relations
	{
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String PRODUCT2ROCKBAND = "Product2RockBand".intern();
		public static final String STUDENT2SUBJECT = "Student2Subject".intern();
	}
	
	protected GeneratedConcerttoursConstants()
	{
		// private constructor
	}
	
	
}
