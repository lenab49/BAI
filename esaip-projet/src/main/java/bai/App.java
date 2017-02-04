package bai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import bai.data.entite.RenameRepository;
import bai.data.acces.IdeeRepository;
import bai.data.entite.Idee;
import bai.util.*;
/**
 * Hello world!
 *
 */
@SpringBootApplication

public class App {
	
	public static void main(String[] args)throws Exception {

		SpringApplication.run(App.class, args);
}
}
