package Stack;
/*
 *Daniel Cancelmo
 *Lab 4 - altered for Lab 6 - being reused for Project 1
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public interface SimpleLinkedList<AnyType> {
	public void insert(AnyType x);
	public void delete();
	public boolean contains(AnyType x);
	public AnyType lookup(AnyType x);
	public boolean isEmpty();
	public void printList();
}
