package samples;

/**
 * @version 1.0
 * @created 09-Oct-2006 5:27:56 PM
 */
public class Collection<T>
{
	Object[]	m_Store;
	int 		m_count = 0;
	
	public Collection()
	{
		m_Store = new Object[10];	
	}

	int Add(T entry)
	{
		m_Store[m_count] = (Object)entry;
		return ++m_count;
	}
	T get(int index)
	{
	   if(index < m_count)
	     return (T) m_Store[index];
	     
	   return null;
	}
	int getCount()
	{
		return m_count;
	}
}