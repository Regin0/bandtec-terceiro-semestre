package MyClassLibrary;

public class CJohn extends CPerson
{
        public CJohn()      
        {
			super("John", "Daylesford", 2);
        }
        public CJohn(String town, int age)  
        {
			 super("John", town, age);
        }
        public void Init()
        {
			Age = 3;
        }   
		public static void main(String names[])
        {
        	CJohn p = new CJohn();
        	p.Find(names);
        }
    
}




