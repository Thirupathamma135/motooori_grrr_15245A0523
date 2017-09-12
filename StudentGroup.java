import java.util.Date;
package pack1;

public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	
	public StudentGroup(int length)
          {
		this.students = new Student[length];
                System.out.println("enter number of students");
                BufferedReader br=new BufferedReader(new InputStream(System.in));
          
	}


	public Student[] getStudents(int i,String name)
        {
		System.out.println("enter number of students");
                 BufferedReader br=new BufferedReader(new InputStream(System.in));
                 for(i=0;i<=br.readLine;i++)
                 {  
                    BufferedReader br=new BufferedReader(new InputStream(System.in));
		return null;
	}

	public void setStudents(Student[] students) 
        {
           System.out.println("student names are:");
           int i;
           String name;
           for(i=0;i<=br.readLine;i++)
           {
             System.out.println("student name is:"+name[i]);
	
	}

	
	public Student getStudent(int index[])
        {    int index[],i;
              String str;
             for(i=0;i<n;i++)
             {
             BufferedReader br=new BufferedReader(new InputStream(System.in));
		System.out.println("student index:"+index[i]"="+name[i]);
		return null;
	}

	
	public void setStudent(Student student, int index) {
		
	}

	
	public void addFirst(Student student) 
       { String name;
         if(name=='\0')
        {
          System.out.println("student name:");
          BufferedReader br=new BufferedReader(new InputStream(System.in));
	  }	
	}

	@Override
	public void addLast(Student student)
        {
        if(student!='\0')
        {
          System.out.println("student name:");
          BufferedReader br=new BufferedReader(new InputStream(System.in));
	  }
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
          if(name=='\0')
        {
          System.out.println("student name:");
          BufferedReader br=new BufferedReader(new InputStream(System.in));
	  }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
          if(name!='\0')
        {
          System.out.println("student name:"+name);
          Systeme.out.println("enter index that you want delete"+index);
          BufferedReader br=new BufferedReader(new InputStream(System.in));
           free(name);
	  }
	}

	@Override
	public void remove(Student student) 
        {
	
          Systeme.out.println("enter name that you want delete"+name);
          BufferedReader br=new BufferedReader(new InputStream(System.in))
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() 
      {  int n,i,j,tmp;
         int a[];
           System.out.println("enter number of elements");
          Scanner sc=new Scanner(System.in)
          sc.nextInt();
          for(i=0;i<n;i++)
          { int small,a[i]=0;
            for(j=0;j<n;j++)
            {
               if(a[j]<small)
              System.out.println(" "+a[j]);
	}
            small=a[j];
            a[j]=a[i];
            a[i]=small;
       }
      }
	@Override
	public Student[] getByBirthDate(Date date) 
       {
		System.out.println("enter the date of the student dd-mm-yyy");
                Scanner sc=new Scanner(System.In);
                sc.nextInt;

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) 
        { 
          if(
	
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)
        {
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
