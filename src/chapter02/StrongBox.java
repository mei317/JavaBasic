package chapter02;

class StrongBox<E> {
	
	private final KeyType keyType;
	private E keyData;
	private int count;
	
	StrongBox(KeyType type) {
		this.keyType = type;
	}

	void put (E data) {
		this.keyData = data;
	}
	
	E get() {
		this.count++;
		
		switch (this.keyType) {
			case padlock -> {
				if (count > 1024) {
					return null;
				}
			}
			case button -> {
				if (count > 10000) {
					return null;
				}
			}
			case dial -> {
				if (count > 30000) {
					return null;
				}
			}
			case finger -> {
				if (count > 1000000) {
					return null;
				}
			}
		}
		
		this.count = 0;
		return this.keyData;
	}
}
