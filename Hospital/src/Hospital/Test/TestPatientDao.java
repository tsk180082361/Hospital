package Hospital.Test;

import java.util.ArrayList;

import org.junit.Test;

import Hospital.Dao.patientDao;
import Hospital.pojo.Patient;

public class TestPatientDao {
	
	patientDao dao = new patientDao();
	@Test
	public void testInsert() {
		Patient patient = new Patient("刘建雄", 19, "男", "18712345678");
		dao.insert(patient);
	}
	/*@Test
	public void testUpdate() {
		Patient patient = new Patient(20,"留学",20,"男","18742015656");
		dao.update(patient);
	}*/
	/*@Test
	public void testDelete() {
		dao.delete(4);
		System.out.println("success");
	}
	@Test
	public void testQueryById() {
		Patient patient = dao.queryById(1);
		System.out.println(patient);
	}
	@Test
	public void testQuery() {
		ArrayList<Patient> list = dao.query();
		
		for(Patient patient : list) {
			System.out.println(patient);
		}
	}*/
	

}
