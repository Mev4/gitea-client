package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.GeneralAPISettings;
import dev.mev4.gitea.client.model.GeneralAttachmentSettings;
import dev.mev4.gitea.client.model.GeneralRepoSettings;
import dev.mev4.gitea.client.model.GeneralUISettings;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SettingsApi {
  /**
   * Get instance&#x27;s global settings for api
   *
   * @return Call&lt;GeneralAPISettings&gt;
   */
  @GET("settings/api")
  Call<GeneralAPISettings> getGeneralAPISettings();


  /**
   * Get instance&#x27;s global settings for Attachment
   *
   * @return Call&lt;GeneralAttachmentSettings&gt;
   */
  @GET("settings/attachment")
  Call<GeneralAttachmentSettings> getGeneralAttachmentSettings();


  /**
   * Get instance&#x27;s global settings for repositories
   *
   * @return Call&lt;GeneralRepoSettings&gt;
   */
  @GET("settings/repository")
  Call<GeneralRepoSettings> getGeneralRepositorySettings();


  /**
   * Get instance&#x27;s global settings for ui
   *
   * @return Call&lt;GeneralUISettings&gt;
   */
  @GET("settings/ui")
  Call<GeneralUISettings> getGeneralUISettings();


}
