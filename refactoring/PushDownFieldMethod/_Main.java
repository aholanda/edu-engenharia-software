public class _Main {
	public static void main(String args[]) {
		_Engineer eng = new _Engineer();
		eng.setQuota(0.05f); // WRONG but ALLOWED
		_Salesman sal = new _Salesman();
		sal.setQuota(0.08f);
		System.out.println("Quota(Engineer)=" + eng.getQuota());
		System.out.println("Quota(Salesman)=" + sal.getQuota());
	}
}
