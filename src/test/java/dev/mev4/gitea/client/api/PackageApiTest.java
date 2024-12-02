package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import org.junit.Before;
import org.junit.Test;


/**
 * API tests for PackageApi
 */
public class PackageApiTest {

  private PackageApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(PackageApi.class);
  }


  /**
   * Delete a package
   */
  @Test
  public void deletePackageTest() {
    String owner = null;
    String type = null;
    String name = null;
    String version = null;
    // Void response = api.deletePackage(owner, type, name, version);

    // TODO: test validations
  }

  /**
   * Gets a package
   */
  @Test
  public void getPackageTest() {
    String owner = null;
    String type = null;
    String name = null;
    String version = null;
    // ModelPackage response = api.getPackage(owner, type, name, version);

    // TODO: test validations
  }

  /**
   * Gets all files of a package
   */
  @Test
  public void listPackageFilesTest() {
    String owner = null;
    String type = null;
    String name = null;
    String version = null;
    // List<PackageFile> response = api.listPackageFiles(owner, type, name, version);

    // TODO: test validations
  }

  /**
   * Gets all packages of an owner
   */
  @Test
  public void listPackagesTest() {
    String owner = null;
    Integer page = null;
    Integer limit = null;
    String type = null;
    String q = null;
    // List<ModelPackage> response = api.listPackages(owner, page, limit, type, q);

    // TODO: test validations
  }
}
