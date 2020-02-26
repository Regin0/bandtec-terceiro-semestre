package samples;


public class Truck
{
	String  m_sModel;
	int		m_nYear;
	
	public Truck()
	{
 	    m_sModel = "Truck";
		m_nYear = 2011;
	}
	public Truck(String type)
	{
 	    m_sModel = type;
		m_nYear = 2011;
	}
	int getYear()
	{
		return m_nYear;
	}
	String getModel()
	{
		return m_sModel;
	}
}