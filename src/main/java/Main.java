// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {



    TADAluno joaozinho = new TADAluno("Joao");
    System.out.println(joaozinho.getNome());
    System.out.println(joaozinho.setNota(1));
    
  }
  
 

  public static class TADAluno{

    private String nome;
    private String  RA;
    private int nota ;

    public TADAluno (String nome){

this.nome= nome;
     
    }

    public String getNome(){

      return this.nome;
    }

    public String getRA(){

      return  this.RA;
    }



    public int getNota(){

      return this.nota;
    }

    public boolean setNota (int nota){
      if ((nota < 0 ) || (nota > 10)){ return false;}
      else{

        this.nota = nota;
        return true;
      }
     
    }
  }



  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}