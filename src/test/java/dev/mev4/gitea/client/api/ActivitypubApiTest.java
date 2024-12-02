package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import org.junit.Before;
import org.junit.Test;


/**
 * API tests for ActivitypubApi
 */
public class ActivitypubApiTest {

  private ActivitypubApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(ActivitypubApi.class);
  }


  /**
   * Returns the Person actor for a user
   */
  @Test
  public void activitypubPersonTest() {
    Integer userId = null;
    // ActivityPub response = api.activitypubPerson(userId);

    // TODO: test validations
  }

  /**
   * Send to the inbox
   */
  @Test
  public void activitypubPersonInboxTest() {
    Integer userId = null;
    // Void response = api.activitypubPersonInbox(userId);

    // TODO: test validations
  }
}
