package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

import java.util.List;


/**
 * API tests for NotificationApi
 */
public class NotificationApiTest {

  private NotificationApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(NotificationApi.class);
  }


  /**
   * List users&#x27;s notification threads
   */
  @Test
  public void notifyGetListTest() {
    Boolean all = null;
    List<String> statusTypes = null;
    List<String> subjectType = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Integer page = null;
    Integer limit = null;
    // List<NotificationThread> response = api.notifyGetList(all, statusTypes, subjectType, since, before, page, limit);

    // TODO: test validations
  }

  /**
   * List users&#x27;s notification threads on a specific repo
   */
  @Test
  public void notifyGetRepoListTest() {
    String owner = null;
    String repo = null;
    Boolean all = null;
    List<String> statusTypes = null;
    List<String> subjectType = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Integer page = null;
    Integer limit = null;
    // List<NotificationThread> response = api.notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit);

    // TODO: test validations
  }

  /**
   * Get notification thread by ID
   */
  @Test
  public void notifyGetThreadTest() {
    String id = null;
    // NotificationThread response = api.notifyGetThread(id);

    // TODO: test validations
  }

  /**
   * Check if unread notifications exist
   */
  @Test
  public void notifyNewAvailableTest() {
    // NotificationCount response = api.notifyNewAvailable();

    // TODO: test validations
  }

  /**
   * Mark notification threads as read, pinned or unread
   */
  @Test
  public void notifyReadListTest() {
    OffsetDateTime lastReadAt = null;
    String all = null;
    List<String> statusTypes = null;
    String toStatus = null;
    // List<NotificationThread> response = api.notifyReadList(lastReadAt, all, statusTypes, toStatus);

    // TODO: test validations
  }

  /**
   * Mark notification threads as read, pinned or unread on a specific repo
   */
  @Test
  public void notifyReadRepoListTest() {
    String owner = null;
    String repo = null;
    String all = null;
    List<String> statusTypes = null;
    String toStatus = null;
    OffsetDateTime lastReadAt = null;
    // List<NotificationThread> response = api.notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt);

    // TODO: test validations
  }

  /**
   * Mark notification thread as read by ID
   */
  @Test
  public void notifyReadThreadTest() {
    String id = null;
    String toStatus = null;
    // NotificationThread response = api.notifyReadThread(id, toStatus);

    // TODO: test validations
  }
}
