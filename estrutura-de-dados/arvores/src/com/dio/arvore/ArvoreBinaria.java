package src.com.dio.arvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo novoNo = new BinNo<T>(conteudo);
        this.raiz = this.inserir(raiz, novoNo);

    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> noPai = null;
            BinNo<T> noFilho = null;
            BinNo<T> noTemp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                noPai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
                
            }

            if (atual == null) {
                System.out.println("Conteudo não encontrado. Bloco Try");
            }

            if (noPai == null){

                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (noTemp = atual, noFilho = atual.getNoEsq(); noFilho.getNoDir() != null; noTemp = noFilho, noFilho = noFilho.getNoEsq()) {
                        if (noFilho != atual.getNoEsq()) {
                            noTemp.setNoDir(noFilho.getNoEsq());
                            noFilho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    noFilho.setNoDir(raiz.getNoDir());
                    raiz = noFilho;
                }

            } else if (atual.getNoDir() == null) {

                if (noPai.getNoEsq() == atual) {
                    noPai.setNoEsq(atual.getNoEsq());
                } else {
                    noPai.setNoDir(atual.getNoEsq());
                }

            } else if (atual.getNoEsq() == null) {

                if (noPai.getNoEsq() == atual) {
                    noPai.setNoDir(atual.getNoDir());
                } else {
                    noPai.setNoDir(atual.getNoDir());
                }

            } else {

                for (
                    noTemp = atual, noFilho = atual.getNoEsq();
                    noFilho.getNoDir() != null;
                    noTemp = noFilho, noFilho = noFilho.getNoDir()
                ) {
                    if (noFilho != atual.getNoEsq()) {
                        noTemp.setNoDir((noFilho.getNoEsq()));
                        noFilho.setNoEsq(atual.getNoEsq());
                    } 
                    noFilho.setNoDir(atual.getNoDir());
                    
                    if (noPai.getNoEsq() == atual) {
                        noPai.setNoEsq(noFilho);
                    } else {
                        noPai.setNoDir(noFilho);
                    }
                }

            }

        } catch (NullPointerException erro) {
           System.out.println("Conteudo não encontrado. Bloco Catch");
        }
    }

}
