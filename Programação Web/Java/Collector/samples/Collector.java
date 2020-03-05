package samples;

public class Collector
{
	String[] CarModels = {"Toyota","Mercedez","Ford","Holden","Renault"};
	String[] TruckModels = {"Toyota","Mercedez","Ford","Holden","Renault"};

	private Collection<Truck>	m_Trucks;
	private Collection<Car>	 m_Cars;
		
	public Collector()
	{
	}
	
	public Car NewCar(String Model)
	{
		samples.Car car = new samples.Car(Model);
		m_Cars.Add(car);
		return car;
	}
	public Truck NewTruck(String Model)
	{
		samples.Truck truck = new samples.Truck(Model);
		m_Trucks.Add(truck);
		return truck;
	}

	public void Run()
	{
		m_Trucks = new Collection<Truck>();
		m_Cars = new Collection<Car>();
		
		for (int i = 0; i < CarModels.length; i++)
		{
	 		NewCar( CarModels[i]);
		}
		for (int i = 0; i < TruckModels.length; i++)
		{
	 		NewTruck( TruckModels[i]);
		}
		for (int c = 0; c < m_Cars.getCount(); c++)
		{
			Car car = m_Cars.get(c);
			System.out.println( "Car " + c + " = " + car.getModel() + ", year " + car.getYear());
		}
	}
	
	public static void main(String[] args)
	{
		Collector app = new Collector();
		app.Run();
		System.out.println("end-of-run");
	}
}