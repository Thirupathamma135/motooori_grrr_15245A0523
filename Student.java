import java.util.Date;
import java.io.*;
import package.*;
package pack2;
public class Student implements Comparable {

	private int id;

	private String fullName;

	
	private Date birthDate;

	
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
        System.out.println("enter the details of student ");
        System.out.println("student id"+id);
        System.out.println("student fullname"+fullname);
        System.out.println("student birthdate"+birthdate);
        System.out.println("student avgmarks"+avgMarks);
	}

	public int getId() 
      {     System.out.println("enter the id");
           BufferdeReader br=new BufferedReader(new InputStream(System.in));
             br.readLine();
           Vector<string> v=new Vector<string>;
		return id;
	}

	public void setId(int id) 
        {     public int getId();  
               System.out.println("student id"+id);
		this.id = id;
          v.getId();
	}

	public String getFullName() 
       {  
           System.out.println("enter the name.");
           BufferdeReader br=new BufferedReader(new InputStream(System.in));
           br.readLine();
           return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
           public String getFullName()
          System.out.println("student name."+fullName);
	}

	public Date getBirthDate() 
        {     System.out.println("enter the date");
  
              date()
              BufferedReader br=new BufferedReader(new InputStream(System.in));
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
        {
		this.birthDate = birthDate;
                public Date getBirthDate();
               System.out.println("date of birth is dd-mm-yyy"+birthDate);
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark)
         {
		this.avgMark = avgMark;
                int sub1,sub2,sub3;
              Vector<string> v=new Vector<string>;
              sub1=70;
              sub2=80;
              sub3=81;
              double avgMark=sub1+sub2+sub3/3;
             System.out.println("average marks is:"+avgMark);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
