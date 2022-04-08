public class LDE { // ORDENADA em ordem crescente
    private Node primeiro;
    private int qtd;
    private Node ultimo;

    public boolean isEmpty() {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public Node buscaMelhorada(Cliente c) {
        Node aux;
        int retorno;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    return aux;
                } else if (retorno > 0) {
                    return null;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirOrdenadoCrescente(Cliente c) {
        Node novo = new Node(c);
        Node aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    System.out.println("CPF já cadastrado. Inserção não efetuada!");
                    return;
                } else if (retorno > 0) {
                    anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    System.out.println("Cliente inserido com sucesso!!");
                    return;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void inserirOrdenadoDecrescente(Cliente c) {
        Node novo = new Node(c);
        Node aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) > 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) < 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    System.out.println("CPF já cadastrado. Inserção não efetuada!");
                    return;
                } else if (retorno > 0) {
                    anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    System.out.println("Cliente inserido com sucesso!!");
                    return;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void inserirDuplicado(Cliente c) {
        Node novo = new Node(c);
        Node aux, anterior;
        int retorno;
        aux = this.primeiro;
        while (aux != null) {
            retorno = aux.getInfo().compareTo(c);
            if (retorno == 0) {
                novo.setProx(this.primeiro);
                this.primeiro.setAnt(novo);
                this.primeiro = novo;
                this.qtd++;
                System.out.println("Cliente inserido com sucesso!!");
                return;
            } else {
                aux = aux.getProx();
            }
        }
    }

    public void buscaRemover(Cliente cpf) {
        Node retorno, ant, prox;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else if (this.qtd == 1) {
            if (cpf.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Remoção efetuada!");
            } else {
                System.out.println("Cliente não cadastrado!");
            }
        } else {
            retorno = this.buscaMelhorada(cpf);
            if (retorno == null) {
                System.out.println("Cliente não cadastrado!");
            } else {
                if (retorno == this.primeiro) {
                    this.primeiro = this.primeiro.getProx();
                    this.primeiro.setAnt(null);
                } else if (retorno == this.ultimo) {
                    this.ultimo = this.ultimo.getAnt();
                    this.ultimo.setProx(null);
                } else {
                    ant = retorno.getAnt();
                    prox = retorno.getProx();
                    ant.setProx(prox);
                    prox.setAnt(ant);
                }
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }
        }
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}
