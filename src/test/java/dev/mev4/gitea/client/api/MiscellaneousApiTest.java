package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.MarkdownOption;
import dev.mev4.gitea.client.model.MarkupOption;
import org.junit.Before;
import org.junit.Test;


/**
 * API tests for MiscellaneousApi
 */
public class MiscellaneousApiTest {

  private MiscellaneousApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(MiscellaneousApi.class);
  }


  /**
   * Returns information about a gitignore template
   */
  @Test
  public void getGitignoreTemplateInfoTest() {
    String name = null;
    // GitignoreTemplateInfo response = api.getGitignoreTemplateInfo(name);

    // TODO: test validations
  }

  /**
   * Returns all labels in a template
   */
  @Test
  public void getLabelTemplateInfoTest() {
    String name = null;
    // List<LabelTemplate> response = api.getLabelTemplateInfo(name);

    // TODO: test validations
  }

  /**
   * Returns information about a license template
   */
  @Test
  public void getLicenseTemplateInfoTest() {
    String name = null;
    // LicenseTemplateInfo response = api.getLicenseTemplateInfo(name);

    // TODO: test validations
  }

  /**
   * Returns the nodeinfo of the Gitea application
   */
  @Test
  public void getNodeInfoTest() {
    // NodeInfo response = api.getNodeInfo();

    // TODO: test validations
  }

  /**
   * Get default signing-key.gpg
   */
  @Test
  public void getSigningKeyTest() {
    // String response = api.getSigningKey();

    // TODO: test validations
  }

  /**
   * Returns the version of the Gitea application
   */
  @Test
  public void getVersionTest() {
    // ServerVersion response = api.getVersion();

    // TODO: test validations
  }

  /**
   * Returns a list of all gitignore templates
   */
  @Test
  public void listGitignoresTemplatesTest() {
    // List<String> response = api.listGitignoresTemplates();

    // TODO: test validations
  }

  /**
   * Returns a list of all label templates
   */
  @Test
  public void listLabelTemplatesTest() {
    // List<String> response = api.listLabelTemplates();

    // TODO: test validations
  }

  /**
   * Returns a list of all license templates
   */
  @Test
  public void listLicenseTemplatesTest() {
    // List<LicensesTemplateListEntry> response = api.listLicenseTemplates();

    // TODO: test validations
  }

  /**
   * Render a markdown document as HTML
   */
  @Test
  public void renderMarkdownTest() {
    MarkdownOption body = null;
    // String response = api.renderMarkdown(body);

    // TODO: test validations
  }

  /**
   * Render raw markdown as HTML
   */
  @Test
  public void renderMarkdownRawTest() {
    String body = null;
    // String response = api.renderMarkdownRaw(body);

    // TODO: test validations
  }

  /**
   * Render a markup document as HTML
   */
  @Test
  public void renderMarkupTest() {
    MarkupOption body = null;
    // String response = api.renderMarkup(body);

    // TODO: test validations
  }
}
