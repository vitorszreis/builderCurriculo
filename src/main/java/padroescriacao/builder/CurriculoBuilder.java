package padroescriacao.builder;

public class CurriculoBuilder {

    private Curriculo curriculo;

    public CurriculoBuilder() {
        curriculo = new Curriculo();
    }

    public Curriculo build() {
        if (curriculo.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (curriculo.getEmail().equals("")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        return curriculo;
    }

    public CurriculoBuilder setNome(String nome) {
        curriculo.setNome(nome);
        return this;
    }

    public CurriculoBuilder setEmail(String email) {
        curriculo.setEmail(email);
        return this;
    }

    public CurriculoBuilder setTelefone(String telefone) {
        curriculo.setTelefone(telefone);
        return this;
    }

    public CurriculoBuilder setCidade(String cidade) {
        curriculo.setCidade(cidade);
        return this;
    }

    public CurriculoBuilder setUf(String uf) {
        curriculo.setUf(uf);
        return this;
    }

    public CurriculoBuilder setFormacao(String formacao) {
        curriculo.setFormacao(formacao);
        return this;
    }

    public CurriculoBuilder setInstituicao(String instituicao) {
        curriculo.setInstituicao(instituicao);
        return this;
    }

    public CurriculoBuilder setExperiencia(String experiencia) {
        curriculo.setExperiencia(experiencia);
        return this;
    }

    public CurriculoBuilder setIdiomas(String idiomas) {
        curriculo.setIdiomas(idiomas);
        return this;
    }

    public CurriculoBuilder setLinkedin(String linkedin) {
        curriculo.setLinkedin(linkedin);
        return this;
    }

    public CurriculoBuilder setGithub(String github) {
        curriculo.setGithub(github);
        return this;
    }

}
