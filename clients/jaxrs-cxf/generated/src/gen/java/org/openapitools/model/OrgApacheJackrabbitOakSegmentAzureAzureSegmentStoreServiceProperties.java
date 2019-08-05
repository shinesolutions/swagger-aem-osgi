package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString accountName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString containerName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString accessKey = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString rootPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString connectionURL = null;
 /**
   * Get accountName
   * @return accountName
  **/
  @JsonProperty("accountName")
  public ConfigNodePropertyString getAccountName() {
    return accountName;
  }

  public void setAccountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
    return this;
  }

 /**
   * Get containerName
   * @return containerName
  **/
  @JsonProperty("containerName")
  public ConfigNodePropertyString getContainerName() {
    return containerName;
  }

  public void setContainerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties containerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
    return this;
  }

 /**
   * Get accessKey
   * @return accessKey
  **/
  @JsonProperty("accessKey")
  public ConfigNodePropertyString getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
    return this;
  }

 /**
   * Get rootPath
   * @return rootPath
  **/
  @JsonProperty("rootPath")
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

 /**
   * Get connectionURL
   * @return connectionURL
  **/
  @JsonProperty("connectionURL")
  public ConfigNodePropertyString getConnectionURL() {
    return connectionURL;
  }

  public void setConnectionURL(ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties connectionURL(ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

