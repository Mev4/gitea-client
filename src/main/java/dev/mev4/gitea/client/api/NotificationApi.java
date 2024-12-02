package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.NotificationCount;
import dev.mev4.gitea.client.model.NotificationThread;
import org.threeten.bp.OffsetDateTime;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface NotificationApi {
  /**
   * List users&#x27;s notification threads
   *
   * @param all         If true, show notifications marked as read. Default value is false (optional)
   * @param statusTypes Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned. (optional)
   * @param subjectType filter notifications by subject type (optional)
   * @param since       Only show notifications updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before      Only show notifications updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;NotificationThread&gt;&gt;
   */
  @GET("notifications")
  Call<List<NotificationThread>> notifyGetList(
    @Query("all") Boolean all, @Query("status-types") List<String> statusTypes, @Query("subject-type") List<String> subjectType, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List users&#x27;s notification threads on a specific repo
   *
   * @param owner       owner of the repo (required)
   * @param repo        name of the repo (required)
   * @param all         If true, show notifications marked as read. Default value is false (optional)
   * @param statusTypes Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned (optional)
   * @param subjectType filter notifications by subject type (optional)
   * @param since       Only show notifications updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before      Only show notifications updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;NotificationThread&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/notifications")
  Call<List<NotificationThread>> notifyGetRepoList(
    @Path("owner") String owner, @Path("repo") String repo, @Query("all") Boolean all, @Query("status-types") List<String> statusTypes, @Query("subject-type") List<String> subjectType, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get notification thread by ID
   *
   * @param id id of notification thread (required)
   * @return Call&lt;NotificationThread&gt;
   */
  @GET("notifications/threads/{id}")
  Call<NotificationThread> notifyGetThread(
    @Path("id") String id
  );

  /**
   * Check if unread notifications exist
   *
   * @return Call&lt;NotificationCount&gt;
   */
  @GET("notifications/new")
  Call<NotificationCount> notifyNewAvailable();


  /**
   * Mark notification threads as read, pinned or unread
   *
   * @param lastReadAt  Describes the last point that notifications were checked. Anything updated since this time will not be updated. (optional)
   * @param all         If true, mark all notifications on this repo. Default value is false (optional)
   * @param statusTypes Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. (optional)
   * @param toStatus    Status to mark notifications as, Defaults to read. (optional)
   * @return Call&lt;List&lt;NotificationThread&gt;&gt;
   */
  @PUT("notifications")
  Call<List<NotificationThread>> notifyReadList(
    @Query("last_read_at") OffsetDateTime lastReadAt, @Query("all") String all, @Query("status-types") List<String> statusTypes, @Query("to-status") String toStatus
  );

  /**
   * Mark notification threads as read, pinned or unread on a specific repo
   *
   * @param owner       owner of the repo (required)
   * @param repo        name of the repo (required)
   * @param all         If true, mark all notifications on this repo. Default value is false (optional)
   * @param statusTypes Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. (optional)
   * @param toStatus    Status to mark notifications as. Defaults to read. (optional)
   * @param lastReadAt  Describes the last point that notifications were checked. Anything updated since this time will not be updated. (optional)
   * @return Call&lt;List&lt;NotificationThread&gt;&gt;
   */
  @PUT("repos/{owner}/{repo}/notifications")
  Call<List<NotificationThread>> notifyReadRepoList(
    @Path("owner") String owner, @Path("repo") String repo, @Query("all") String all, @Query("status-types") List<String> statusTypes, @Query("to-status") String toStatus, @Query("last_read_at") OffsetDateTime lastReadAt
  );

  /**
   * Mark notification thread as read by ID
   *
   * @param id       id of notification thread (required)
   * @param toStatus Status to mark notifications as (optional, default to read)
   * @return Call&lt;NotificationThread&gt;
   */
  @PATCH("notifications/threads/{id}")
  Call<NotificationThread> notifyReadThread(
    @Path("id") String id, @Query("to-status") String toStatus
  );

}
