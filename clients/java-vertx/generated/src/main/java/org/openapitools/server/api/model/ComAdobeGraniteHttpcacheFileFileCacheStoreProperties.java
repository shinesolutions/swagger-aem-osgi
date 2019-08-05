package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties   {
  
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot = null;
  private ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost = null;

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties () {

  }

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties (ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot, ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
  }

    
  @JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileDocumentRoot() {
    return comAdobeGraniteHttpcacheFileDocumentRoot;
  }
  public void setComAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
  }

    
  @JsonProperty("com.adobe.granite.httpcache.file.includeHost")
  public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileIncludeHost() {
    return comAdobeGraniteHttpcacheFileIncludeHost;
  }
  public void setComAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
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
    return Objects.equals(comAdobeGraniteHttpcacheFileDocumentRoot, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileDocumentRoot) &&
        Objects.equals(comAdobeGraniteHttpcacheFileIncludeHost, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileIncludeHost);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
