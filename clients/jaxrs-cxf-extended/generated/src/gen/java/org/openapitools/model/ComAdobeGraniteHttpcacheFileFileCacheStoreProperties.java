package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost;
 /**
  * Get comAdobeGraniteHttpcacheFileDocumentRoot
  * @return comAdobeGraniteHttpcacheFileDocumentRoot
  */
  @JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileDocumentRoot() {
    return comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  /**
   * Sets the <code>comAdobeGraniteHttpcacheFileDocumentRoot</code> property.
   */
 public void setComAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  /**
   * Sets the <code>comAdobeGraniteHttpcacheFileDocumentRoot</code> property.
   */
  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
    return this;
  }

 /**
  * Get comAdobeGraniteHttpcacheFileIncludeHost
  * @return comAdobeGraniteHttpcacheFileIncludeHost
  */
  @JsonProperty("com.adobe.granite.httpcache.file.includeHost")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileIncludeHost() {
    return comAdobeGraniteHttpcacheFileIncludeHost;
  }

  /**
   * Sets the <code>comAdobeGraniteHttpcacheFileIncludeHost</code> property.
   */
 public void setComAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
  }

  /**
   * Sets the <code>comAdobeGraniteHttpcacheFileIncludeHost</code> property.
   */
  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
    return this;
  }


  @Override
  public boolean equals(Object o) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

