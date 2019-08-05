package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAcpPlatformPlatformServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger queryLimit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray fileTypeExtensionMap = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

