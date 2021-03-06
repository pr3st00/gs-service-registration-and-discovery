package br.com.fernandoalmeida.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernandoalmeida.bo.HelloMessage;

@RestController
public class DemoRestController {

	@RequestMapping("/sayhello/{name}")
	public HelloMessage sayHello(@PathVariable String name) {
		return new HelloMessage(name);
	}

}
