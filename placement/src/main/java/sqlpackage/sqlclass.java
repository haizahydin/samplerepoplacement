package sqlpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlclass {

	public static void main(String[] args)throws SQLException { 
	
		
            Connection conn = null;
		
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			}
				//String dbURL = "jdbc:sqlserver://localhost:1433;databasename=SOLTraining";
				String dbURL = "jdbc:sqlserver://localhost:1433;databasename=SOLTraining";
				Aiswarya Asokan
				12:09
				// String dbURL = "jdbc:sqlserver://localhost:1433;databasename=SOLTraining;integratedSecurity=true";
						String user = "sa";  // username
						//String user = "";
				        String pass = "12345678"; //password
						//String pass = "";		

				conn = DriverManager.getConnection(dbURL, user, pass);//Establishing Connection
						
				        if (conn != null) {
				        	Statement st;
						st = conn.createStatement();//Creating Statement
				        	String query = "update students set student_name = 'Sanu' where student
	}
				        String query1 = "select * from students";
				        int res = st.executeUpdate(query);//Execute statement--when using update,insert commands.. output                                                                                                   comes as integer(1)row affected.. so have to store in integer
			        	if(res>0){
			        		System.out.println("Updated");
			        	}else
			        	{
			        		System.out.println("update unsuccessful");
			        	}
			ResultSet rs = st.executeQuery(query1);//Execute statement gets data from the table
			        	while(rs.next()){
			        		int empid=rs.getInt(1);
			        		String name=rs.getString(2);
			        		String desig=rs.getString(3);
			        		System.out.println(empid + " " +name+ " "+desig);
			        

			       
			        	}
	}
} catch (ClassNotFoundException e) {

e.printStackTrace();
}
finally{

conn.close();

}
}

