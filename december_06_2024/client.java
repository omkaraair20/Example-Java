import java.io.BufferedReader;

public class client{
	public static void main(String[] args) throws IOException
	{
		    Socket ss = new Socket("localhost",6666);
			DataInputStream din=new DataInputStream(ss.getInputStream());
			DataOutputStream dout=new DataOutputStream(ss.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String str="",str2="";
			while(!str.equals("stop")) {
				str=br.readLine();
				dout.writeUTF(str);
				dout.flush();
				str2=din.readUTF();
				System.out.println("Server says:"+str2);
			}
		}
	}
