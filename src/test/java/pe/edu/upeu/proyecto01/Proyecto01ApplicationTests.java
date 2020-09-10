package pe.edu.upeu.proyecto01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.proyecto01.dao.UsuarioDao;

@SpringBootTest
class Proyecto01ApplicationTests {
@Autowired 
private UsuarioDao usuarioDao;
	@Test
	void contextLoads() {

		System.out.println(usuarioDao.readAll());

	}

}
