package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";


	/**
	 * Encoder meldingen som lengde+melding
	 * @param message meldingen som skal encodes
	 * @return encoded melding
	 */
	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
		byte[] data = message.getData();

		segment[0] = (byte) data.length;
		for (int i = 0; i < data.length; i++){
			segment[i+1] = data[i];
		}

		return segment;
		
	}

	/**
	 * Decoder segment og putter dataen i message
	 * @param segment
	 * @return
	 */
	public static Message decapsulate(byte[] segment) {

		int size = segment[0];
		byte[] data = new byte[size];
		for (int i = 0; i < size; i++){
			data[i] = segment[i+1];
		}

		Message message = new Message(data);
		
		return message;
		
	}
	
}
