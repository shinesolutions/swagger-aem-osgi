package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.accountName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accountName) &&
        Objects.equals(this.containerName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.containerName) &&
        Objects.equals(this.accessKey, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accessKey) &&
        Objects.equals(this.rootPath, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.rootPath) &&
        Objects.equals(this.connectionURL, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.connectionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, containerName, accessKey, rootPath, connectionURL);
  }

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

