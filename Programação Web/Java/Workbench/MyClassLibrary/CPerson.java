package MyClassLibrary;

public class CPerson
{
    public String Name = "";
    public String Town = "";
    public CPerson[] Friends;
    public int FriendCount = 0;
    public int Age;
	public float AverageAge = 0;
	public double AverageIncome = 2341234.1234;
	
        public void Construct()
        {
			Age = 0;
            Name ="John";
            Town = "JavaTown";
			Friends = new CPerson[10];	
        }
        public CPerson()
        {
			Construct();
        }
        public CPerson(CPerson f)
        {
        	Construct();
            Town = f.Town;
            Name = f.Name;
            Age = f.Age;
            for(int x = 0; x < f.Friends.length; x++)
            {
            	Friends[x] = new CPerson(f.Friends[x]);
            }
        }
        public CPerson(String name, String town, int age)
        {
			Construct();
            Age = age;
            Name = name;
            Town = town;
        }

        public int SetAge(int age)
        {
            Age = age;
            return age;
        }
        public void SetName(String name)
        {
            Name = name;
        }        
        public String SetTown(String town)
        {
        	String old = Town;
            Town = town;
            return old;
        }
        public int AddFriend(CPerson friend)
        {
            if(friend != null)
            {
            	if(FriendCount < Friends.length)
            	{
            		Friends[FriendCount++] = friend;
					return FriendCount;            		
            	}
            }
            return -1;
        }

        public int CreateFriends(int count)
        {
			for(int a = 0; a < count; a++)
			{
				String name = "friend";
				name += Integer.toString(FriendCount);
				CPerson man = new CPerson(name, "home", 20);
				if(AddFriend(man) == -1)
				{
					man = null;
					break;
				}
			}        	
        	return FriendCount;
        }
        public float GetAverage()
        {
        	AverageAge = Age;
        	for(int a = 0; a < FriendCount; a++)
        	{
     			AverageAge += Friends[a].Age;   	
        	}
        	AverageAge /= (FriendCount+1);
        	System.out.println(AverageAge);
        	return AverageAge;
        }
        public void SetAverage(float av)
        {
        	AverageAge = av;
        }
        
        public boolean Find(String[] names)
        {
        	int mat = 0;
        	for(int a = 0; a < names.length; a++)
        	{
        		for(int b = 0; b < FriendCount; b++)
        		{
        			if(names[a] == Friends[b].Name)
        			{
        				System.out.println(names[a] + "is a friend");
        				mat++;
         			}
        		}
           	}
           	return mat > 0;
        }
        public boolean IsFriend( CPerson person)
        { 
         	for(int a = 0; a < FriendCount; a++)
        	{
        		if(Friends[a] == person)
        		{
        			return true;
        		}
        	}
        	return false;
        }
        public int AddFriends(CPerson[] people)
        {
        	if(people != null)
			{         		
         		for(int a = 0; a < people.length; a++)
         		{
         			if(people[a] != null)
         			{
         				if(!IsFriend(people[a]))
	         				AddFriend(people[a]);
         			}
         		}
         	}
         	return FriendCount;
        }
        public static void main(String names[])
        {
        	CPerson p = new CPerson();
        	p.Find(names);
        }

	public void Init(){

	}

}




