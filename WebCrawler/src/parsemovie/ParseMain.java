package parsemovie;

public class ParseMain {
	public final static String url = "";
	public final static String key = "933f45c63c6ceedd94da50695bf4d05d";
	public static String today;

	public static void main(String[] args) throws Exception {
		ParseMovie pm = new ParseMovie();
		// System.out.println(pm.makeURL());
		String url = pm.makeURL();

		String[][] arrRank = pm.getBoxOffice(url);

		for (int i = 0; i < arrRank.length; i++) {
			System.out.println("☞ " + arrRank[i][0] + "위");
			System.out.println("제목 : " + arrRank[i][1]);
			System.out.println("누적 관객 : " + arrRank[i][2] + "명");
			System.out.println("누적 수익 : " + arrRank[i][3] + "원");
		}
	}
}