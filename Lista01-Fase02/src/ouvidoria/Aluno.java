package ouvidoria;

import java.util.List;

public class Aluno {
    private String id;
    private String name;
    private String login;
    private String password;
    private List<Manifestacao> manifestacaosAbertas;

    public Aluno() {}

    public Aluno(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public Aluno(String id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Manifestacao> getManifestacaosAbertas() {
        return manifestacaosAbertas;
    }

    public void addManifestacoes(Manifestacao manifestacao) {
        manifestacaosAbertas.add(manifestacao);
    }

}
