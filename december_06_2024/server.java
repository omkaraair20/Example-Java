import java.io.BufferedReader;

public class server {

	public static void main(String[] args) throws IOException
	{
		ServerSocket sss=new ServerSocket(6666);
		System.out.println("in server");
		Socket ss=sss.accept();
		System.out.println("after accepting connection");
		
		DataInputStream din =new DataInputStream(ss.getInputStream());
		DataOutputStream dout=new DataOutputStream(ss.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";
		while(!str.equals("stop")) {
			str=din.readUTF();
			System.out.println("client says:"+str);
			str2=br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		ss.close();
		sss.close();
	}

}
