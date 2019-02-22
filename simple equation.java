import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		 {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			boolean f=false;
			for (int x=-22;x<=22 && !f;x++) {
				for (int y=-100;y<=100 && !f;y++) {
					if (x!=y && x*x+y*y<=c) {
						int z=a-x-y;
						if (x!=z && y!=z && x*y*z==b && x*x+y*y+z*z==c) {
							System.out.println(x+" "+y+" "+z);
							f=true;
						}
					}
				}
			}
			if (!f) {
				System.out.println("No solution.");
			}
		}
 	}
}

