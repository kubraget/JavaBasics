
public class ExeceptionDemo {
	// try catch mechanisim

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 0;
		try {
			//int k = a / b;
			int arr[] = new int[5];
			System.out.println(arr[2]);
			//System.out.println(k);
		} catch (ArithmeticException et) {
			System.out.println("I catched the ArithmeticException/exeception");
		} catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexOutOfBoundsException");
		} catch (Exception e){
			System.out.println("I catched the error/exeception");//general exception
		}finally
		{
			System.out.println("delete cookies");
		}
	}
}