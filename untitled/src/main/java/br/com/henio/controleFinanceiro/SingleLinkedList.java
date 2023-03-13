package br.com.henio.controleFinanceiro;

public class SingleLinkedList<E>{
    private SingleLinkedListNode<E> firstNode;
    public SingleLinkedList(){
        this.firstNode = null;
    }
    public SingleLinkedList(E element){
        this.firstNode = new SingleLinkedListNode<E>(element, null);
    }
}
