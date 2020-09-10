package pe.edu.upeu.proyecto01.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto01.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class HomeController {
	@Autowired
	private UsuarioService usuarioService;
@GetMapping("/mensaje1")
public String mensaje1(){
	return "Microservicios con Java";

}
@GetMapping("/mensaje2")
public List<Map<String, Object>> mensaje2(){
	return usuarioService.readAll();
}
}
