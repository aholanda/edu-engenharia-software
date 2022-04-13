public class Main_ {
	public static void main(String args[]) {
		Engineer_ eng = new Engineer_();
		eng.setQuota(0.05f); // WRONG but NOT ALLOWED
		Salesman_ sal = new Salesman_();
		sal.setQuota(0.08f);
		System.out.println("Quota(Engineer)=" + eng.getQuota());
		System.out.println("Quota(Salesman)=" + sal.getQuota());
	}
}
