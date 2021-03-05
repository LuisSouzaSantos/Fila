public class Fila {
	
	private String[] queue  = new String[10];
	
	public void toQueue(String object) {
		int queueSize = queueSize();
		
		if(queueSize >= 9) { 
			System.out.println("Fila Cheia");
			return;
		}
		
		queue[queueSize] = object;
	}
	
	public void deQueue() {
		int queueSize = queueSize();
		
		if(queueSize <= 0) { 
			System.out.println("Fila Vazia");
			return;
		}
		
		for (int i = 0; i < queue.length; i++) {
			
			if(i == queueSize) { break; }
			
			queue[i] = queue[i+1];
		}
	}
	
	public int queueSize() {
		int size = 0;
		for (int i = 0; i < queue.length; i++) {
			if(queue[i] == null) {
				size = i;
				break;
			}
		}
		return size;
	}
	
	public String firstElement() {
		int queueSize = queueSize();
		
		if(queueSize <= 0) { 
			System.out.println("Fila Vazia");
			return "";
		}
		
		return queue[0];
	}
	
	public String lastElement() {
		int queueSize = queueSize();
		
		if(queueSize <= 0) { 
			System.out.println("Fila Vazia");
			return "";
		}
		
		return queue[queueSize-1];
	}
	
	

}
