package org.humingk.movie.api.common.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.humingk.movie.common.entity.MovieConstant;
import org.humingk.movie.dal.entity.*;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Pojo转换工具类
 *
 * <p>调用方式：
 *
 * <p>uses:class
 *
 * <p>qualifiedByName:ConverterUtil,unixTimestampToDate
 *
 * @author humingk
 */
@Component
@Named("util")
public class ConverterUtil {
  /**
   * Unix时间戳转换为yyyy-MM-dd
   *
   * @param unixTimestamp
   * @return
   */
  @Named("unixTimestamp")
  public String unixTimestamp(Long unixTimestamp) {
    return unixTimestamp == 0 ? "" : DateFormatUtils.format(unixTimestamp, "yyyy-MM-dd");
  }

  /**
   * 获取豆瓣电影url
   *
   * @param id
   * @return
   */
  @Named("urlMovieDouban")
  public String urlMovieDouban(Long id) {
    return "https://movie.douban.com/subject/" + id;
  }

  /**
   * 获取豆瓣影人url
   *
   * @param id
   * @return
   */
  @Named("urlCelebrityDouban")
  public String urlCelebrityDouban(Long id) {
    return "https://movie.douban.com/celebrity/" + id;
  }

  /**
   * 获取豆瓣用户url
   *
   * @param id
   * @return
   */
  @Named("urlUserDouban")
  public String urlUserDouban(String id) {
    return "https://www.douban.com/people/" + id;
  }

  /**
   * 获取IMDB电影ID
   *
   * @param id
   * @return
   */
  @Named("idMovieImdb")
  public String idMovieImdb(Long id) {
    return id == 0 || id == 1 ? "" : "tt" + String.format("%07d", id);
  }
  /**
   * 获取IMDB影人ID
   *
   * @param id
   * @return
   */
  @Named("idCelebrityImdb")
  public String idCelebrityImdb(Long id) {
    return id == 0 || id == 1 ? "" : "nm" + String.format("%07d", id);
  }

  /**
   * 获取IMDB电影url
   *
   * @param id
   * @return
   */
  @Named("urlMovieImdb")
  public String urlMovieImdb(Long id) {
    return "https://www.imdb.com/title/" + idMovieImdb(id);
  }
  /**
   * 获取IMDB影人url
   *
   * @param id
   * @return
   */
  @Named("urlCelebrityImdb")
  public String urlCelebrityImdb(Long id) {
    return "https://www.imdb.com/name/" + idCelebrityImdb(id);
  }

  /**
   * 获取影人职位中文名
   *
   * @param id
   * @return
   */
  @Named("profession")
  public String profession(Byte id) {
    return MovieConstant.PROFESSION_TYPE.get(id).get(0);
  }

  /**
   * 获取性别中文名
   *
   * @param sex
   * @return
   */
  @Named("sex")
  public String sex(Byte sex) {
    return sex == 0 ? "女" : (sex == 1 ? "男" : "");
  }

  /**
   * 获取豆瓣电影海报链接
   *
   * @param id 豆瓣电影ID
   * @return
   */
  @Named("urlPoster")
  public String urlMoviePoster(Long id) {
    return "https://img1.doubanio.com/view/photo/s_ratio_poster/public/p" + id + ".webp";
  }

  /**
   * 获取IMDB电影海报链接
   *
   * @param url IMDB电影海报部分链接
   * @return
   */
  @Named("urlPosterImdb")
  public String urlPosterImdb(String url) {
    return "https://m.media-amazon.com/images/M/" + url;
  }

  /**
   * 获取豆瓣影人头像链接
   *
   * @param id
   * @return
   */
  @Named("urlPortrait")
  public String urlPortrait(String id) {
    return "https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p" + id + ".webp";
  }

  /**
   * 获取影片类型
   *
   * @param idTypeVideo
   * @return
   */
  @Named("typeVideo")
  public String typeVideo(Byte idTypeVideo) {
    return MovieConstant.VIDEO_TYPE.get(idTypeVideo).get(0);
  }

  /**
   * 获取豆瓣电影别名列表
   *
   * @param aliasMovieDoubanList
   * @return
   */
  @Named("aliasList")
  public List<String> aliasList(List<AliasMovieDouban> aliasMovieDoubanList) {
    return aliasMovieDoubanList.stream()
        .map(AliasMovieDouban::getNameAlias)
        .collect(Collectors.toList());
  }

  /**
   * 获取豆瓣电影类型列表
   *
   * @param movieDoubanToTypeMovieList
   * @return
   */
  @Named("typeList")
  public List<String> typeList(List<MovieDoubanToTypeMovie> movieDoubanToTypeMovieList) {
    return movieDoubanToTypeMovieList.stream()
        .map(
            movieDoubanToTypeMovie ->
                MovieConstant.MOVIE_TYPE.get(movieDoubanToTypeMovie.getIdTypeMovie()))
        .collect(Collectors.toList());
  }

  /**
   * 获取豆瓣电影标签列表
   *
   * @param tagMovieList
   * @return
   */
  @Named("tagList")
  public List<String> tagList(List<TagMovie> tagMovieList) {
    return tagMovieList.stream().map(TagMovie::getNameZh).collect(Collectors.toList());
  }

  // 场景 ---

  /**
   * 获取场景电影链接
   *
   * @param id
   * @return
   */
  @Named("urlMovieScene")
  public String urlMovieScene(Long id) {
    return "https://-----------------" + id;
  }

  /**
   * 获取场景电影地点分布图、地点地点分布图链接
   *
   * <p>scene中字段名为url_map的链接
   *
   * @param id
   * @return
   */
  @Named("urlMap")
  public String urlMap(String id) {
    return "http://cache.fotoplace.cc/mocation/staticmap/" + id + ".png";
  }

  /**
   * 获取场景详情、等等图片链接
   *
   * <p>scene中字段名不为url_map的链接
   *
   * @param id
   * @return
   */
  @Named("urlImage")
  public String urlImage(String id) {
    return id.isEmpty() ? "" : "http://cache.fotoplace.cc/mocation/" + id;
  }

  /**
   * 获取场景电影的地点类型列表
   *
   * @param placeSceneToTypePlaceSceneList
   * @return
   */
  @Named("typeListScene")
  public List<String> typeListScene(
      List<PlaceSceneToTypePlaceScene> placeSceneToTypePlaceSceneList) {
    return placeSceneToTypePlaceSceneList.stream()
        .map(
            placeSceneToTypePlaceScene ->
                MovieConstant.PLACE_TYPE.get(placeSceneToTypePlaceScene.getIdTypePlaceScene()))
        .collect(Collectors.toList());
  }

  /**
   * 获取场景地点 洲
   *
   * @param continentScene
   * @return
   */
  public String continentScene(ContinentScene continentScene) {
    return continentScene.getNameZh();
  }
  /**
   * 获取场景地点 国家
   *
   * @param countryScene
   * @return
   */
  public String countryScene(CountryScene countryScene) {
    return countryScene.getNameZh();
  }
  /**
   * 获取场景地点 州、省
   *
   * @param stateScene
   * @return
   */
  public String stateScene(StateScene stateScene) {
    return stateScene.getNameZh();
  }
  /**
   * 获取场景地点 城市
   *
   * @param cityScene
   * @return
   */
  public String cityScene(CityScene cityScene) {
    return cityScene.getNameZh();
  }

  // zhihu

  /**
   * 知乎话题链接
   *
   * @param id 知乎话题ID
   * @return
   */
  @Named("urlZhihuTopic")
  public String urlZhihuTopic(Long id) {
    return "https://www.zhihu.com/topic/" + id;
  }

  /**
   * 知乎问题链接
   *
   * @param id 知乎问题ID
   * @return
   */
  @Named("urlZhihuQuestion")
  public String urlZhihuQuestion(Long id) {
    return "https://www.zhihu.com/question/" + id;
  }

  // resource

  /**
   * 获取电影资源网站名
   *
   * @param id 资源网站ID
   * @return
   */
  @Named("websiteResource")
  public String websiteResource(Short id) {
    return MovieConstant.WEBSITE_RESOURCE.get(id).get(0);
  }

  /**
   * 获取电影资源网站链接
   *
   * @param id 资源网站ID
   * @return
   */
  @Named("urlWebsiteResource")
  public String urlWebsiteResource(Short id) {
    return MovieConstant.WEBSITE_RESOURCE.get(id).get(1);
  }
  /**
   * 获取电影资源类型
   *
   * @param id 资源类型ID
   * @return
   */
  @Named("typeResource")
  public String typeResource(Short id) {
    return MovieConstant.RESOURCE_TYPE.get(id);
  }
}
