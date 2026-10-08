package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAcpPlatformPlatformServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger queryLimit;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray fileTypeExtensionMap;
 /**
   * Get queryLimit
   * @return queryLimit
  **/
  @JsonProperty("query.limit")
  public ConfigNodePropertyInteger getQueryLimit() {
    return queryLimit;
  }

  public void setQueryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
  }

  public ComAdobeGraniteAcpPlatformPlatformServletProperties queryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
    return this;
  }

 /**
   * Get fileTypeExtensionMap
   * @return fileTypeExtensionMap
  **/
  @JsonProperty("file.type.extension.map")
  public ConfigNodePropertyArray getFileTypeExtensionMap() {
    return fileTypeExtensionMap;
  }

  public void setFileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
  }

  public ComAdobeGraniteAcpPlatformPlatformServletProperties fileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
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
    ComAdobeGraniteAcpPlatformPlatformServletProperties comAdobeGraniteAcpPlatformPlatformServletProperties = (ComAdobeGraniteAcpPlatformPlatformServletProperties) o;
    return Objects.equals(this.queryLimit, comAdobeGraniteAcpPlatformPlatformServletProperties.queryLimit) &&
        Objects.equals(this.fileTypeExtensionMap, comAdobeGraniteAcpPlatformPlatformServletProperties.fileTypeExtensionMap);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

