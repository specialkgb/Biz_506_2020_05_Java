package naver;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie1 {
	public static void main(String[] args) throws Exception {

		String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=1";

		String content = "";
		String score = "";
		String writer = "";
		String reg_date = "";

		Document doc = Jsoup.connect(url).get();

		Elements movieList = doc.select("div.score_result li");

		for (Element movie : movieList) {

			content = movie.select("div.score_reple p > span").get(0).text();

			score = movie.select("div.star_score >em").get(0).text();

			writer = movie.select("div.score_reple em").get(0).text();

			

			reg_date = movie.select("div.score_reple em").get(1).text();

			int reg_dateIndex = reg_date.lastIndexOf(" ");

			reg_date = reg_date.substring(0, reg_dateIndex);

			System.out.println("==================================================================================");

			System.out.println("댓글 :" + content);

			System.out.println("평점 :" + score);

			System.out.println("작성자 :" + writer);

			System.out.println("작성일자 :" + reg_date);
		}
	}
}