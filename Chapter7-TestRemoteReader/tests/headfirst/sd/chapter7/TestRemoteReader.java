package headfirst.sd.chapter7;

import java.io.*;
import java.net.Socket;
import org.junit.*;

public class TestRemoteReader {
	private Socket mTestSocket;
    private ObjectOutputStream mOutStream;
    private ObjectInputStream mInStream;

    public static final boolean[] EMPTY_CHECKBOXES = new boolean[256];
    
    @Before
    public void setUp() throws IOException {
   		mTestSocket = new Socket("127.0.0.1", 4242);
		mOutStream = new ObjectOutputStream(mTestSocket.getOutputStream());
		mInStream = new ObjectInputStream(mTestSocket.getInputStream());
    }
    
    @After
    public void tearDown() throws IOException {
  		mTestSocket.close();
		mOutStream = null;
		mInStream = null;
		mTestSocket = null;
    }
    
	@Test
	public void testNormalMessage()throws IOException {
		boolean[] checkboxState = new boolean[256];
		checkboxState[0] = true;
		checkboxState[5] = true;
		checkboxState[19] = true;
		mOutStream.writeObject("This is a test message!");
		mOutStream.writeObject(checkboxState);
	}
}
