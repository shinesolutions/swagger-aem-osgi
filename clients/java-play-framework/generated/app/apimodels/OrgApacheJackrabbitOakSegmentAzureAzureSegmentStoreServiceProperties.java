package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties   {
  @JsonProperty("accountName")
  private ConfigNodePropertyString accountName = null;

  @JsonProperty("containerName")
  private ConfigNodePropertyString containerName = null;

  @JsonProperty("accessKey")
  private ConfigNodePropertyString accessKey = null;

  @JsonProperty("rootPath")
  private ConfigNodePropertyString rootPath = null;

  @JsonProperty("connectionURL")
  private ConfigNodePropertyString connectionURL = null;

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Valid
  public ConfigNodePropertyString getAccountName() {
    return accountName;
  }

  public void setAccountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties containerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Get containerName
   * @return containerName
  **/
  @Valid
  public ConfigNodePropertyString getContainerName() {
    return containerName;
  }

  public void setContainerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Valid
  public ConfigNodePropertyString getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

   /**
   * Get rootPath
   * @return rootPath
  **/
  @Valid
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties connectionURL(ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
    return this;
  }

   /**
   * Get connectionURL
   * @return connectionURL
  **/
  @Valid
  public ConfigNodePropertyString getConnectionURL() {
    return connectionURL;
  }

  public void setConnectionURL(ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties = (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties) o;
    return Objects.equals(accountName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accountName) &&
        Objects.equals(containerName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.containerName) &&
        Objects.equals(accessKey, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accessKey) &&
        Objects.equals(rootPath, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.rootPath) &&
        Objects.equals(connectionURL, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.connectionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, containerName, accessKey, rootPath, connectionURL);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
    sb.append("    connectionURL: ").append(toIndentedString(connectionURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

