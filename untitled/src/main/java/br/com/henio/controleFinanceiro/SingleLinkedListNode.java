package br.com.henio.controleFinanceiro;

public class SingleLinkedListNode<E> {
    private E element;
    private SingleLinkedListNode<E> next;

    public SingleLinkedListNode(E element, SingleLinkedListNode<E> next){
        this.element = element;
        this.next = next;
    }

}
