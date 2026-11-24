package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurriculoBuilderTest {

    @Test
    void deveRetornarExcecaoParaCurriculoSemNome() {
        try {
            CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
            Curriculo curriculo = curriculoBuilder
                    .setEmail("candidato@email.com")
                    .setCidade("Juiz de Fora")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCurriculoSemEmail() {
        try {
            CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
            Curriculo curriculo = curriculoBuilder
                    .setNome("Candidato 1")
                    .setCidade("Juiz de Fora")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("E-mail inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCurriculoValido() {
        CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
        Curriculo curriculo = curriculoBuilder
                .setNome("Candidato 1")
                .setEmail("candidato@email.com")
                .setFormacao("Sistemas de Informação")
                .setIdiomas("Inglês, Espanhol")
                .build();

        assertNotNull(curriculo);
    }
}
