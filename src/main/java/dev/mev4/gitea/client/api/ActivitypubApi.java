package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.ActivityPub;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ActivitypubApi {
  /**
   * Returns the Person actor for a user
   *
   * @param userId user ID of the user (required)
   * @return Call&lt;ActivityPub&gt;
   */
  @GET("activitypub/user-id/{user-id}")
  Call<ActivityPub> activitypubPerson(
    @Path("user-id") Integer userId
  );

  /**
   * Send to the inbox
   *
   * @param userId user ID of the user (required)
   * @return Call&lt;Void&gt;
   */
  @POST("activitypub/user-id/{user-id}/inbox")
  Call<Void> activitypubPersonInbox(
    @Path("user-id") Integer userId
  );

}
