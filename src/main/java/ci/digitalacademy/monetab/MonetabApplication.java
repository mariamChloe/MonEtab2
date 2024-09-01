package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private AdresseService adresseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private FicheService ficheService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}
}
