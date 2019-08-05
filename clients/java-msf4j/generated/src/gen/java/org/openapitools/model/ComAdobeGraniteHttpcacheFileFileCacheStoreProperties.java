package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties   {
  @JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot = null;

  @JsonProperty("com.adobe.granite.httpcache.file.includeHost")
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost = null;

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
    return this;
  }

   /**
   * Get comAdobeGraniteHttpcacheFileDocumentRoot
   * @return comAdobeGraniteHttpcacheFileDocumentRoot
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileDocumentRoot() {
    return comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  public void setComAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
    return this;
  }

   /**
   * Get comAdobeGraniteHttpcacheFileIncludeHost
   * @return comAdobeGraniteHttpcacheFileIncludeHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileIncludeHost() {
    return comAdobeGraniteHttpcacheFileIncludeHost;
  }

  public void setComAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileFileCacheStoreProperties = (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties) o;
    return Objects.equals(this.comAdobeGraniteHttpcacheFileDocumentRoot, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileDocumentRoot) &&
        Objects.equals(this.comAdobeGraniteHttpcacheFileIncludeHost, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileIncludeHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteHttpcacheFileDocumentRoot, comAdobeGraniteHttpcacheFileIncludeHost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {\n");
    
    sb.append("    comAdobeGraniteHttpcacheFileDocumentRoot: ").append(toIndentedString(comAdobeGraniteHttpcacheFileDocumentRoot)).append("\n");
    sb.append("    comAdobeGraniteHttpcacheFileIncludeHost: ").append(toIndentedString(comAdobeGraniteHttpcacheFileIncludeHost)).append("\n");
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

