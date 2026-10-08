package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountName")
  private ConfigNodePropertyString accountName;

  @JsonProperty("containerName")
  private ConfigNodePropertyString containerName;

  @JsonProperty("accessKey")
  private ConfigNodePropertyString accessKey;

  @JsonProperty("rootPath")
  private ConfigNodePropertyString rootPath;

  @JsonProperty("connectionURL")
  private ConfigNodePropertyString connectionURL;

  /**
   * 
   * @return accountName
   */
  public ConfigNodePropertyString getAccountName() {
    return accountName;
  }

  public void setAccountName(ConfigNodePropertyString accountName) {
    this.accountName = accountName;
  }

  /**
   * 
   * @return containerName
   */
  public ConfigNodePropertyString getContainerName() {
    return containerName;
  }

  public void setContainerName(ConfigNodePropertyString containerName) {
    this.containerName = containerName;
  }

  /**
   * 
   * @return accessKey
   */
  public ConfigNodePropertyString getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
  }

  /**
   * 
   * @return rootPath
   */
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  /**
   * 
   * @return connectionURL
   */
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
