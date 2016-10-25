package Queue;
/*
 *Daniel Cancelmo
 *Lab 5 - altered for Lab 7 - being reused for Project 2
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public interface DoublyLinkedList<AnyType> {
	public void insertFront(AnyType x);
	public void insertBack(AnyType x);
	public void deleteFront(AnyType x);
	public void deleteBack(AnyType x);
	public boolean contains(AnyType x);
	public AnyType lookup(AnyType x);
	public boolean isEmpty();
	public void printList();
	public void printListRev();
}
