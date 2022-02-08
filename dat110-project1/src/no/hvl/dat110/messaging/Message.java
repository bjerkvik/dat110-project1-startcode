package no.hvl.dat110.messaging;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		this.data =  data;
		if (data.length > MessageConfig.SEGMENTSIZE - 1){
			System.out.println("Dataen er mer enn 127 bytes");
			this.data = null;
		} else if (data == null) {
			System.out.println("Dataen er null");
		}

	}

	public byte[] getData() {
		return this.data; 
	}

}
