package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteAcpPlatformPlatformServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteAcpPlatformPlatformServletProperties   {
  @JsonProperty("query.limit")
  private ConfigNodePropertyInteger queryLimit = null;

  @JsonProperty("file.type.extension.map")
  private ConfigNodePropertyArray fileTypeExtensionMap = null;

  public ComAdobeGraniteAcpPlatformPlatformServletProperties queryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
    return this;
  }

  /**
   * Get queryLimit
   * @return queryLimit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getQueryLimit() {
    return queryLimit;
  }

  public void setQueryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
  }

  public ComAdobeGraniteAcpPlatformPlatformServletProperties fileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
    return this;
  }

  /**
   * Get fileTypeExtensionMap
   * @return fileTypeExtensionMap
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getFileTypeExtensionMap() {
    return fileTypeExtensionMap;
  }

  public void setFileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

