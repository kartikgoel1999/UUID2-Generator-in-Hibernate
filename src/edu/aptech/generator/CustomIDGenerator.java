package edu.aptech.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIDGenerator implements IdentifierGenerator
{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		con=session.connection();
		int val=0;
		String id="APT2019";
		try
		{
			st=con.createStatement();
			rs=st.executeQuery("select seq_gen.nextVal from dual");
			if(rs.next())
			{
				val=rs.getInt(1);
			}
			id=id.concat(val+"");
		}
		catch(Exception e)
		{
			
		}
		return null;
	}
	
}
