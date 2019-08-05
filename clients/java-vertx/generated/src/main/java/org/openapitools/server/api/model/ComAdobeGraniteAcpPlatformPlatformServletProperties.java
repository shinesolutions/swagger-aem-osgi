package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAcpPlatformPlatformServletProperties   {
  
  private ConfigNodePropertyInteger queryLimit = null;
  private ConfigNodePropertyArray fileTypeExtensionMap = null;

  public ComAdobeGraniteAcpPlatformPlatformServletProperties () {

  }

  public ComAdobeGraniteAcpPlatformPlatformServletProperties (ConfigNodePropertyInteger queryLimit, ConfigNodePropertyArray fileTypeExtensionMap) {
    this.queryLimit = queryLimit;
    this.fileTypeExtensionMap = fileTypeExtensionMap;
  }

    
  @JsonProperty("query.limit")
  public ConfigNodePropertyInteger getQueryLimit() {
    return queryLimit;
  }
  public void setQueryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
  }

    
  @JsonProperty("file.type.extension.map")
  public ConfigNodePropertyArray getFileTypeExtensionMap() {
    return fileTypeExtensionMap;
  }
  public void setFileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAcpPlatformPlatformServletProperties comAdobeGraniteAcpPlatformPlatformServletProperties = (ComAdobeGraniteAcpPlatformPlatformServletProperties) o;
    return Objects.equals(queryLimit, comAdobeGraniteAcpPlatformPlatformServletProperties.queryLimit) &&
        Objects.equals(fileTypeExtensionMap, comAdobeGraniteAcpPlatformPlatformServletProperties.fileTypeExtensionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryLimit, fileTypeExtensionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAcpPlatformPlatformServletProperties {\n");
    
    sb.append("    queryLimit: ").append(toIndentedString(queryLimit)).append("\n");
    sb.append("    fileTypeExtensionMap: ").append(toIndentedString(fileTypeExtensionMap)).append("\n");
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
