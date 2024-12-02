package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.ModelPackage;
import dev.mev4.gitea.client.model.PackageFile;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PackageApi {
  /**
   * Delete a package
   *
   * @param owner   owner of the package (required)
   * @param type    type of the package (required)
   * @param name    name of the package (required)
   * @param version version of the package (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("packages/{owner}/{type}/{name}/{version}")
  Call<Void> deletePackage(
    @Path("owner") String owner, @Path("type") String type, @Path("name") String name, @Path("version") String version
  );

  /**
   * Gets a package
   *
   * @param owner   owner of the package (required)
   * @param type    type of the package (required)
   * @param name    name of the package (required)
   * @param version version of the package (required)
   * @return Call&lt;ModelPackage&gt;
   */
  @GET("packages/{owner}/{type}/{name}/{version}")
  Call<ModelPackage> getPackage(
    @Path("owner") String owner, @Path("type") String type, @Path("name") String name, @Path("version") String version
  );

  /**
   * Gets all files of a package
   *
   * @param owner   owner of the package (required)
   * @param type    type of the package (required)
   * @param name    name of the package (required)
   * @param version version of the package (required)
   * @return Call&lt;List&lt;PackageFile&gt;&gt;
   */
  @GET("packages/{owner}/{type}/{name}/{version}/files")
  Call<List<PackageFile>> listPackageFiles(
    @Path("owner") String owner, @Path("type") String type, @Path("name") String name, @Path("version") String version
  );

  /**
   * Gets all packages of an owner
   *
   * @param owner owner of the packages (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @param type  package type filter (optional)
   * @param q     name filter (optional)
   * @return Call&lt;List&lt;ModelPackage&gt;&gt;
   */
  @GET("packages/{owner}")
  Call<List<ModelPackage>> listPackages(
    @Path("owner") String owner, @Query("page") Integer page, @Query("limit") Integer limit, @Query("type") String type, @Query("q") String q
  );

}
