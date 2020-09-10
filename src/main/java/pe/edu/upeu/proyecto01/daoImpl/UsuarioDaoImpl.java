package pe.edu.upeu.proyecto01.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.proyecto01.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select *from usuario");
	}

}
