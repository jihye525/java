package api.lang;

public class SystemTest {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHame = System.getProperty("user.home");
		String version = System.getProperty("java.version");
		String vendor = System.getProperty("java.vendor");
		String oSname = System.getProperty("os.name");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userName);
		System.out.println(version);
		System.out.println(vendor);
		
		long start = System.currentTimeMillis();
		for(int i = 1; i<100;i++) {
			System.out.println("java");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간:"+(end-start));
		System.out.println("===============================");
		
		start = System.nanoTime();
		for(int i = 1; i<100;i++) {
			System.out.println("java");
		}
		end = System.nanoTime();
		
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간:"+(end-start));
		
	}

}
