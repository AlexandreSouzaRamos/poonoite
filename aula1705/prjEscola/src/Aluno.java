import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private int ra;
    private String nome;
    private String email;

    public Aluno(int ra, String nome, String email){
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Aluno) && ((Aluno) o).ra == this.ra) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.ra < o.ra){
            return -1;
        }
        if(this.ra > o.ra){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ra: " + ra + "\n"
                +"Nome: " + nome + "\n"
                +"Email: " + email +"\n"
                +"==========================\n";
    }
}
