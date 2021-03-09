package law.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import law.lawyerInfo.Lawyer;

public class LawyerDAOImpl implements LawyerDAO {

	private JdbcTemplate jdbcTemplate;

	public LawyerDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Lawyer lawyer) {
		String sql = "INSERT INTO lawyer (name, casesWon, casesLost) values (?,?,?)";
		return jdbcTemplate.update(sql, lawyer.getName(), lawyer.getCasesWon(), lawyer.getCasesLost());
	}

	@Override
	public int update(Lawyer lawyer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Lawyer get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Lawyer> list() {
		String sql = "SELECT * FROM lawyer";
		List<Lawyer> listLawyer = jdbcTemplate.query(sql, new RowMapper<Lawyer>() {
			@Override
			public Lawyer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Lawyer alawyer = new Lawyer();
				alawyer.setId(rs.getInt("id"));
				alawyer.setName(rs.getString("name"));
				alawyer.setCasesWon(rs.getInt("casesWon"));
				alawyer.setCasesLost(rs.getInt("casesLost"));
				return alawyer;
			}
		});
		return listLawyer;
	}
}
