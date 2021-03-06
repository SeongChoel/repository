package kr.mjc.seongchoel.spring.midterm;

import kr.mjc.seongchoel.java.jdbc.article.Article;
import kr.mjc.seongchoel.java.jdbc.article.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class AddArticleEx {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ArticleDao articleDao = context.getBean(ArticleDao.class);

    Article article = new Article();
    article.setTitle("중간고사.");
    article.setContent("""
        내용은 목록을 출력합니다.
        다른 내용은 글을 저장합니다.""");
    article.setUserId(400);
    article.setName("김성철");
    articleDao.addArticle(article);

    log.debug("글을 저장했습니다. title={}", article.getTitle());
  }
}
