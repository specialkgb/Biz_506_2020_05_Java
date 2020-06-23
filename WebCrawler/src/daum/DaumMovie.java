package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {
		int page = 1;
		String prePage = "";
		int cnt = 0;
		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;

			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.review_info");

			String nowPage = doc.select("input#page").attr("value");
			
			if(nowPage.equals(prePage)) {				
				break;				
			} else {
				prePage = nowPage;				
			}
			String content = "";
			String writer = "";
			int score = 0;
			String regDt = "";
			

			content = replyList.select("p.desc_review").get(0).text();
			writer = replyList.select("em.link_profile").get(0).text();
			score = Integer.parseInt(replyList.select("em.emph_grade").get(0).text());
			regDt = replyList.select("span.info_append").get(0).text();

			System.out.println("==============================================");
			System.out.println("내용: " + content);
			System.out.println("작성자: " + writer);
			System.out.println("평점: " + score);
			System.out.println("작성일: " + regDt);

			for (Element one : replyList) {

//				cnt += 1;
			}
//			page += 1;
		}
//		System.out.println("총 " + cnt + "건 수집했습니다." );
	}
}


//int writerIndex = writer.lastIndexOf("(");
//
//if (writerIndex != -1) {
//	writer = writer.substring(0, writerIndex);
//}
//int regDtIndex = regDt.lastIndexOf(" ");
//
//regDt = regDt.substring(0, regDtIndex);
//
