class No{
  int dado;
  No ant;
  No prox;

  No (int dado){
    this.dado = dado;
  }

  No (No ant, int dado, No prox){
    this(dado);
    this.ant = ant;
    this.prox = prox;
  }
}

class ListaDuplamenteLigada{
  No primeiro;
  No ultimo;
  int qtde;

  boolean estaVazia (){
    return this.qtde <= 0;
  }

  void inserirNoComeco (int dado){
    if (estaVazia()){
      this.primeiro = this.ultimo = new No (dado);
    }
    else{
      No novo = new No (null, dado, this.primeiro);
      this.primeiro.ant = novo;
      this.primeiro = novo;
    }
    this.qtde++;
  }
}


class Main {
  public static void main(String[] args) {
    
  }
}