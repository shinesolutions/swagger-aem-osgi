package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties   {
  
  private ConfigNodePropertyString accountName = null;
  private ConfigNodePropertyString containerName = null;
  private ConfigNodePropertyString accessKey = null;
  private ConfigNodePropertyString rootPath = null;
  private ConfigNodePropertyString connectionURL = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountName")
  public ConfigNodePropertyString getAccountName() {
    return accountName;
  }
  public void setAccountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("containerName")
  public ConfigNodePropertyString getContainerName() {
    return containerName;
  }
  public void setContainerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessKey")
  public ConfigNodePropertyString getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rootPath")
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }
  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionURL")
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

