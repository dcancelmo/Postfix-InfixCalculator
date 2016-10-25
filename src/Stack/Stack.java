package Stack;
/*
 *Daniel Cancelmo
 *Lab 6 - being reused for Project 1
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

public interface Stack<AnyType> {
	public boolean isEmpty();
	public void push(AnyType x);
	public AnyType pop();
	public AnyType peek();
}
