package domino;

import java.util.Iterator;

class Node<T>
{
	T data;
	Node<T> next;
	Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	Node(T data)
	{
		this(data, null);
	}
	Node()
	{
		this(null, null);
	}
}
public class Deck<T> implements InterfaceDeck<T>
{
	private Node<T> left;
	private Node<T> right;
	
	public Deck()
	{
		this.left = this.right = null;
	}

	
	@Override
	public boolean isEmpty() 
	{
		return this.left == null;
	}

	@Override
	public T getLeft() 
	{
		if(left == null)
		{
			return null;
		}
		
		return left.data;
	}

	@Override
	public T getRight() 
	{
		if(right == null)
		{
			return null;
		}
		
		return right.data;
	}

	@Override
	public void addLeft(T item) 
	{
		if(isEmpty())
		{
			left = right = new Node<>(item);
		}
		
		else
		{
			left = (Node<T>)new Node<>(item, left);
		}
		
	}

	
	@Override
	public void addRight(T item) 
	{
		if(isEmpty())
		{
			addLeft(item);
		}
		
		else
		{
			right.next = new Node<>(item);
			right = right.next;
		}
	}

	@Override
	public void print() 
	{
		Node<T> current = this.left;
		
		while (current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public Iterator<T> getIterator()
	{
		return new DeckIterator();
	}
	
	private class DeckIterator implements Iterator<T>
	{
		private Node<T> current;
		
		DeckIterator()
		{
			current = left;
		}

		@Override
		public boolean hasNext() 
		{
			return current != null;
		}

		@Override
		public T next() 
		{
			T result = current.data;
			current = current.next;
			return result;
		}
		
	}
	
}
