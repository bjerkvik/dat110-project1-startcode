package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {
		
	private byte RPCIDDISPLAY = 2;
	
	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		// implement marshalling, call and unmarshalling for write RPC method

		byte[] req = RPCUtils.marshallString(message);
		byte[] resp = rpcclient.call(RPCIDDISPLAY, req);

		RPCUtils.unmarshallString(resp);

	}
}
