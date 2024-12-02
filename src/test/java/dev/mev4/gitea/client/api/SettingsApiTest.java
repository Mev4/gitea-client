package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import org.junit.Before;
import org.junit.Test;


/**
 * API tests for SettingsApi
 */
public class SettingsApiTest {

  private SettingsApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(SettingsApi.class);
  }


  /**
   * Get instance&#x27;s global settings for api
   */
  @Test
  public void getGeneralAPISettingsTest() {
    // GeneralAPISettings response = api.getGeneralAPISettings();

    // TODO: test validations
  }

  /**
   * Get instance&#x27;s global settings for Attachment
   */
  @Test
  public void getGeneralAttachmentSettingsTest() {
    // GeneralAttachmentSettings response = api.getGeneralAttachmentSettings();

    // TODO: test validations
  }

  /**
   * Get instance&#x27;s global settings for repositories
   */
  @Test
  public void getGeneralRepositorySettingsTest() {
    // GeneralRepoSettings response = api.getGeneralRepositorySettings();

    // TODO: test validations
  }

  /**
   * Get instance&#x27;s global settings for ui
   */
  @Test
  public void getGeneralUISettingsTest() {
    // GeneralUISettings response = api.getGeneralUISettings();

    // TODO: test validations
  }
}
