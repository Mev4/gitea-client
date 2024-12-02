package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.GitignoreTemplateInfo;
import dev.mev4.gitea.client.model.LabelTemplate;
import dev.mev4.gitea.client.model.LicenseTemplateInfo;
import dev.mev4.gitea.client.model.LicensesTemplateListEntry;
import dev.mev4.gitea.client.model.MarkdownOption;
import dev.mev4.gitea.client.model.MarkupOption;
import dev.mev4.gitea.client.model.NodeInfo;
import dev.mev4.gitea.client.model.ServerVersion;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface MiscellaneousApi {
  /**
   * Returns information about a gitignore template
   *
   * @param name name of the template (required)
   * @return Call&lt;GitignoreTemplateInfo&gt;
   */
  @GET("gitignore/templates/{name}")
  Call<GitignoreTemplateInfo> getGitignoreTemplateInfo(
    @Path("name") String name
  );

  /**
   * Returns all labels in a template
   *
   * @param name name of the template (required)
   * @return Call&lt;List&lt;LabelTemplate&gt;&gt;
   */
  @GET("label/templates/{name}")
  Call<List<LabelTemplate>> getLabelTemplateInfo(
    @Path("name") String name
  );

  /**
   * Returns information about a license template
   *
   * @param name name of the license (required)
   * @return Call&lt;LicenseTemplateInfo&gt;
   */
  @GET("licenses/{name}")
  Call<LicenseTemplateInfo> getLicenseTemplateInfo(
    @Path("name") String name
  );

  /**
   * Returns the nodeinfo of the Gitea application
   *
   * @return Call&lt;NodeInfo&gt;
   */
  @GET("nodeinfo")
  Call<NodeInfo> getNodeInfo();


  /**
   * Get default signing-key.gpg
   *
   * @return Call&lt;String&gt;
   */
  @GET("signing-key.gpg")
  Call<String> getSigningKey();


  /**
   * Returns the version of the Gitea application
   *
   * @return Call&lt;ServerVersion&gt;
   */
  @GET("version")
  Call<ServerVersion> getVersion();


  /**
   * Returns a list of all gitignore templates
   *
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("gitignore/templates")
  Call<List<String>> listGitignoresTemplates();


  /**
   * Returns a list of all label templates
   *
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("label/templates")
  Call<List<String>> listLabelTemplates();


  /**
   * Returns a list of all license templates
   *
   * @return Call&lt;List&lt;LicensesTemplateListEntry&gt;&gt;
   */
  @GET("licenses")
  Call<List<LicensesTemplateListEntry>> listLicenseTemplates();


  /**
   * Render a markdown document as HTML
   *
   * @param body (optional)
   * @return Call&lt;String&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("markdown")
  Call<String> renderMarkdown(
    @Body MarkdownOption body
  );

  /**
   * Render raw markdown as HTML
   *
   * @param body Request body to render (required)
   * @return Call&lt;String&gt;
   */
  @Headers("Content-Type:text/plain")
  @POST("markdown/raw")
  Call<String> renderMarkdownRaw(
    @Body String body
  );

  /**
   * Render a markup document as HTML
   *
   * @param body (optional)
   * @return Call&lt;String&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("markup")
  Call<String> renderMarkup(
    @Body MarkupOption body
  );

}
