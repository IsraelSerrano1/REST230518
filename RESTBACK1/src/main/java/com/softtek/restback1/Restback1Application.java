package com.softtek.restback1;

import com.softtek.restback1.controlador.MedicoControlador;
import com.softtek.restback1.repository.MedicoRepoImpl;
import com.softtek.restback1.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Restback1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Restback1Application.class, args);
	}
	@Autowired
	MedicoRepoImpl medico;
	@Autowired
	IMedicoServicio medicoservicio;
	@Autowired
	private MedicoControlador medicoCont;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("SPRING Boot Application Started");
		System.out.println(medicoCont.listarMedicos());
	}
}
