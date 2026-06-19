package br.com.mcb.hexagonal_architecture_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HexagonalArchitectureStudyApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void deveRetornarDadosMockados() throws Exception {
		mockMvc.perform(get("/dados"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.dados[0].cnpj").value("123142141"))
				.andExpect(jsonPath("$.dados[1].agencia").value(1234))
				.andExpect(jsonPath("$.dados[1].conta").value(56789))
				.andExpect(jsonPath("$.dados[1].digito").value(0));
	}

}
