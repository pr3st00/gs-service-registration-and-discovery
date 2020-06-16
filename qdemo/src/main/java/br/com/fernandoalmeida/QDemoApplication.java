package br.com.fernandoalmeida;

import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.Quarkus;

@QuarkusMain
public class QDemoApplication {

	public static void main(String... args) {
		System.out.println("Starting application...");
		Quarkus.run(args);
	}
}
