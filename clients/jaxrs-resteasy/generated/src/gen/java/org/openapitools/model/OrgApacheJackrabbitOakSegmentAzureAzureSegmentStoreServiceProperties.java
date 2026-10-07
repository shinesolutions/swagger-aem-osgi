package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties   {
  
  private ConfigNodePropertyString accountName;
  private ConfigNodePropertyString containerName;
  private ConfigNodePropertyString accessKey;
  private ConfigNodePropertyString rootPath;
  private ConfigNodePropertyString connectionURL;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountName")
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyString getConnectionURL() {
    return connectionURL;
  }
  public void setConnectionURL(ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

