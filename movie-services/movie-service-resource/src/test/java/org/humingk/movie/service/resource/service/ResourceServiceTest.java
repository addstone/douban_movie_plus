package org.humingk.movie.service.resource.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ResourceServiceTest {

  @Autowired private ResourceService resourceService;

  private static final Long MOVIE_DOUBAN_ID = 3711760L;

  @Test
  public void getResourceListByMovieDoubanId() {
    Assert.assertFalse(resourceService.getResourceListByMovieDoubanId(MOVIE_DOUBAN_ID).isEmpty());
  }
}
