package samples;


public class Car
{
	public String m_sModel;
	int		m_nYear;
	
	public Car()
	{
 	    m_sModel = "Car";
		m_nYear = 2011;
	}
	public Car(String type)
	{
 	    m_sModel = type;
		m_nYear = 2011;
	}
	String getModel()
	{
		return m_sModel;
	}
	int getYear()
	{
		return m_nYear;
	}

}