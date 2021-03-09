package law.dao;

import java.util.List;

import law.lawyerInfo.Lawyer;

public interface LawyerDAO {
	public int save(Lawyer lawyer);
	public int update(Lawyer lawyer);
	public Lawyer get(Integer id);
	public int delete(Integer id);
	public List<Lawyer> list();
}
