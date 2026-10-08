package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteAcpPlatformPlatformServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAcpPlatformPlatformServletProperties   {
  private ConfigNodePropertyInteger queryLimit;
  private ConfigNodePropertyArray fileTypeExtensionMap;

  public ComAdobeGraniteAcpPlatformPlatformServletProperties() {
  }

  /**
   **/
  public ComAdobeGraniteAcpPlatformPlatformServletProperties queryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("query.limit")
  @Valid public ConfigNodePropertyInteger getQueryLimit() {
    return queryLimit;
  }

  @JsonProperty("query.limit")
  public void setQueryLimit(ConfigNodePropertyInteger queryLimit) {
    this.queryLimit = queryLimit;
  }

  /**
   **/
  public ComAdobeGraniteAcpPlatformPlatformServletProperties fileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
    this.fileTypeExtensionMap = fileTypeExtensionMap;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file.type.extension.map")
  @Valid public ConfigNodePropertyArray getFileTypeExtensionMap() {
    return fileTypeExtensionMap;
  }

  @JsonProperty("file.type.extension.map")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
