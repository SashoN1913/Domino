package domino;

public interface InterfaceDeck<T> 
{
	public boolean isEmpty();
	public T getLeft();
	public T getRight();
	public void addLeft(T item);
	public void addRight(T item);
	public void print();
}
