package net.antra;

 public  class Student{

	 	  String name;
	      int regNo;
	 
	   
	    public Student(String name, int regNo)
	    {
	        this.name = name;
	        this.regNo = regNo;
	    }
	    
	   
	    public String getName()
	    {
	        return name;
	    }
	    public int getRegNo()
	    {
	        return regNo;
	    }
	    
	   
	    
	   public String toString() {
	    	
	    	return getClass().getName()+"@"+Integer.toHexString(hashCode());
	    }
	    
	    
	    public int hashCode() {
	    	
	    	return 123;
	    }
	    
	   public boolean equals(Object o) {
		   
		  
	    	String name1=this.name;
	    	int regNo1=this.regNo;
	    	Student st=(Student)o;
	    	String name2=st.name;
	    	int regNo2=st.regNo;
	    	
	    	if(name1.equals(name2) && regNo1==regNo2) {
	    		
	    		return true;
	    	}else {
	    		return false;
	    	}
	    	
	    }
	
}
