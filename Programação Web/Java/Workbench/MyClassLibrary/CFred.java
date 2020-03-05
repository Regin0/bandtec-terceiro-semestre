package MyClassLibrary;

public class CFred extends CPerson
{
        public CFred()      
        {
		super("Fred", "Daylesford", 2);
        }
        public CFred(String town, int age)   
        {
			super("Fred", town, age);
        }
        public void Init()
        {
			Age = 33;
        }        
    
}




